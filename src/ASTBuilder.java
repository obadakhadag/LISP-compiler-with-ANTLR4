import org.antlr.v4.runtime.tree.TerminalNode;



public class ASTBuilder extends CompilerParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(CompilerParser.ProgramContext ctx) {
        ASTNode root = new ASTNode("program");
        for (CompilerParser.ExprContext exprCtx : ctx.expr()) {
            ASTNode child = visit(exprCtx);
            if(child != null) {
                root.addChild(child);
            }
        }
        return root;
    }

    @Override
    public ASTNode visitExpr(CompilerParser.ExprContext ctx) {
        if(ctx.atom() != null) {
            return visit(ctx.atom());
        } else if(ctx.list() != null) {
            return visit(ctx.list());
        }
        return null;
    }

    @Override
    public ASTNode visitAtom(CompilerParser.AtomContext ctx) {
        // Return a leaf node for an atomic value
        return new ASTNode(ctx.getText());
    }

    @Override
    public ASTNode visitList(CompilerParser.ListContext ctx) {
        // If listContent corresponds to a specialized rule, delegate to it
        if(ctx.listContent() != null) {
            return visit(ctx.listContent());
        }
        return new ASTNode("list");
    }

    @Override
    public ASTNode visitListContent(CompilerParser.ListContentContext ctx) {
        // Check for specific constructs first
        if(ctx.functionDefinition() != null) {
            return visitFunctionDefinition(ctx.functionDefinition());
        }
        if(ctx.ifExpression() != null) {
            return visitIfExpression(ctx.ifExpression());
        }

        // Fallback: generic handling for other list contents
        ASTNode node = new ASTNode("listContent");
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ASTNode child = visit(ctx.getChild(i));
            if(child != null) {
                node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitFunctionDefinition(CompilerParser.FunctionDefinitionContext ctx) {
        ASTNode node = new ASTNode("defun");

        // Function name
        node.addChild(new ASTNode(ctx.IDENTIFIER().getText()));

        // Parameters
        ASTNode paramsNode = new ASTNode("params");
        if(ctx.formalParams() != null) {
            for(TerminalNode id : ctx.formalParams().IDENTIFIER()) {
                paramsNode.addChild(new ASTNode(id.getText()));
            }
        }
        node.addChild(paramsNode);

        // Function body
        ASTNode bodyNode = new ASTNode("body");
        for(CompilerParser.BodyContext bodyCtx : ctx.body()) {
            ASTNode exprNode = visit(bodyCtx);
            if(exprNode != null) {
                bodyNode.addChild(exprNode);
            }
        }
        node.addChild(bodyNode);
        return node;
    }

    @Override
    public ASTNode visitIfExpression(CompilerParser.IfExpressionContext ctx) {
        ASTNode node = new ASTNode("if");

        // Condition
        if(ctx.expr(0) != null) {
            ASTNode condNode = new ASTNode("condition");
            condNode.addChild(visit(ctx.expr(0)));
            node.addChild(condNode);
        }

        // Then part
        if(ctx.expr(1) != null) {
            ASTNode thenNode = new ASTNode("then");
            thenNode.addChild(visit(ctx.expr(1)));
            node.addChild(thenNode);
        }

        // Else part (if exists)
        if(ctx.expr().size() > 2 && ctx.expr(2) != null) {
            ASTNode elseNode = new ASTNode("else");
            elseNode.addChild(visit(ctx.expr(2)));
            node.addChild(elseNode);
        }

        return node;
    }

    // You can add more specialized visitors for other constructs as needed...
}
