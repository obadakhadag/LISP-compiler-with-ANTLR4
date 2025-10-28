import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Load the input file
            CharStream input = CharStreams.fromFileName("input.lisp");

            // Instantiate the generated lexer with the input
            Compiler lexer = new Compiler(input);

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            // Print tokens with details
            for (Token token : tokens.getTokens()) {
                if (token.getType() == Token.EOF) continue;
                String tokenText = token.getText();
                int line = token.getLine();
                int col = token.getCharPositionInLine();
                String symbolicName = lexer.getVocabulary().getSymbolicName(token.getType());
                String tokenMeaning = symbolicName != null
                        ? symbolicName
                        : lexer.getVocabulary().getDisplayName(token.getType());
                System.out.printf("Token: %-15s | Line: %-3d Col: %-3d | Meaning: %s%n",
                        tokenText, line, col, tokenMeaning);
            }

            // Instantiate the parser with the token stream for syntax analysis
            CompilerParser parser = new CompilerParser(tokens);

            // Parse starting from the 'program' rule
            ParseTree tree = parser.program();

            System.out.println("\nParse Tree:");
            System.out.println(tree.toStringTree(parser));

            // Build AST using visitor
            ASTBuilder builder = new ASTBuilder();
            ASTNode astRoot = builder.visit(tree);

            // Print the abstract syntax tree
            System.out.println("\nAbstract Syntax Tree:");
            System.out.println(astRoot);

            // ---- GUI Code for Displaying the Parse Tree with Sliders ----

            // Create a list of rule names for the TreeViewer
            List<String> ruleNames = Arrays.asList(parser.getRuleNames());

            // Initialize the TreeViewer with rule names and parse tree
            TreeViewer viewer = new TreeViewer(ruleNames, tree);
            viewer.setScale(1.5); // initial scaling

            // Wrap the TreeViewer in a JScrollPane for scrolling capability
            JScrollPane scrollPane = new JScrollPane(viewer);

            // Create a horizontal slider for adjusting the tree scale
            JSlider scaleSlider = new JSlider(JSlider.HORIZONTAL, 50, 300, 150);
            scaleSlider.setMajorTickSpacing(50);
            scaleSlider.setMinorTickSpacing(10);
            scaleSlider.setPaintTicks(true);
            scaleSlider.setPaintLabels(true);

            // Add a change listener to update the tree scale when the slider value changes
            ChangeListener scaleChangeListener = e -> {
                int sliderValue = scaleSlider.getValue();
                double scale = sliderValue / 100.0;
                viewer.setScale(scale);
                viewer.repaint();
            };
            scaleSlider.addChangeListener(scaleChangeListener);

            // Create a vertical slider for vertical navigation
            JSlider verticalSlider = new JSlider(JSlider.VERTICAL);
            // Link the vertical slider's model to the scroll pane's vertical scrollbar model
            verticalSlider.setModel(scrollPane.getVerticalScrollBar().getModel());
            verticalSlider.setPaintTicks(true);
            verticalSlider.setPaintLabels(true);

            // Create and display a JFrame to host the TreeViewer and sliders
            JFrame frame = new JFrame("Parse Tree");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);      // Center: Scrollable TreeViewer
            frame.add(scaleSlider, BorderLayout.SOUTH);      // Bottom: Horizontal scale slider
            frame.add(verticalSlider, BorderLayout.EAST);    // Right: Vertical navigation slider
            frame.setSize(800, 600);
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
