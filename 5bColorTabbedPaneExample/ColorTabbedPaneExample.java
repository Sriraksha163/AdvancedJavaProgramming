/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan. */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneExample extends JFrame {
    private JTabbedPane tabbedPane;
    private JLabel displayLabel;

    public ColorTabbedPaneExample() {
        setTitle("Color Tabbed Pane");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("RED", createPanel(Color.RED));
        tabbedPane.addTab("BLUE", createPanel(Color.BLUE));
        tabbedPane.addTab("GREEN", createPanel(Color.GREEN));

        displayLabel = new JLabel("Select a color tab", SwingConstants.CENTER);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 20));
        displayLabel.setOpaque(true);

        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String colorName = tabbedPane.getTitleAt(index);
                displayLabel.setText(colorName + " tab selected");
                switch (colorName) {
                    case "RED" -> displayLabel.setBackground(Color.RED);
                    case "BLUE" -> displayLabel.setBackground(Color.BLUE);
                    case "GREEN" -> displayLabel.setBackground(Color.GREEN);
                }
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
        SwingUtilities.invokeLater(() -> new ColorTabbedPaneExample().setVisible(true));
    }
}