import java.util.ArrayList;
import java.util.List;

public class ASTNode {
    public String type;
    public List<ASTNode> children = new ArrayList<>();

    public ASTNode(String type) {
        this.type = type;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return toString(0);
    }

    private String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) sb.append("  ");
        sb.append(type).append("\n");
        for (ASTNode child : children) {
            sb.append(child.toString(indent + 1));
        }
        return sb.toString();
    }
}
