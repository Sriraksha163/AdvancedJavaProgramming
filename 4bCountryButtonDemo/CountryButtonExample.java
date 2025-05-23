//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonExample extends JFrame implements ActionListener {
    private JLabel messageLabel;

    public CountryButtonExample() {
        setTitle("Country Button Example");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnSrilanka = new JButton("Srilanka");
        JButton btnIndia = new JButton("India");

        btnSrilanka.addActionListener(this);
        btnIndia.addActionListener(this);

        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSrilanka);
        buttonPanel.add(btnIndia);

        add(buttonPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Srilanka")) {
            messageLabel.setText("Srilanka is pressed");
        } else if (command.equals("India")) {
            messageLabel.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryButtonExample().setVisible(true);
        });
    }
}
