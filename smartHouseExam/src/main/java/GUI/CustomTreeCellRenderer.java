package GUI;

import java.awt.Color;
import java.awt.Component;
import java.util.HashSet;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CustomTreeCellRenderer extends DefaultTreeCellRenderer {
    private HashSet<DefaultMutableTreeNode> redNodes = new HashSet<>();
    
    public void setNodeRed(DefaultMutableTreeNode node) {
        redNodes.add(node);
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
            boolean selected, boolean expanded, boolean leaf, int row,
            boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        if (redNodes.contains(node)) {
            setForeground(Color.RED);
        }

        return this;
    }
}
