/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPaneExample extends JFrame {
    private JTabbedPane tabbedPane;
    private JLabel displayLabel;

    public CMYTabbedPaneExample() {
        setTitle("CMY Tabbed Pane");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Cyan", createPanel(Color.CYAN));
        tabbedPane.addTab("Magenta", createPanel(Color.MAGENTA));
        tabbedPane.addTab("Yellow", createPanel(Color.YELLOW));

        displayLabel = new JLabel("Select a color tab", SwingConstants.CENTER);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 20));
        displayLabel.setOpaque(true);

        tabbedPane.addChangeListener(e -> {
            int index = tabbedPane.getSelectedIndex();
            String colorName = tabbedPane.getTitleAt(index);
            displayLabel.setText(colorName + " tab selected");
            switch (colorName) {
                case "Cyan":
                    displayLabel.setBackground(Color.CYAN);
                    break;
                case "Magenta":
                    displayLabel.setBackground(Color.MAGENTA);
                    break;
                case "Yellow":
                    displayLabel.setBackground(Color.YELLOW);
                    break;
            }
        });

        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.NORTH);
        add(displayLabel, BorderLayout.CENTER);
    }

    private JPanel createPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CMYTabbedPaneExample().setVisible(true));
    }
}
