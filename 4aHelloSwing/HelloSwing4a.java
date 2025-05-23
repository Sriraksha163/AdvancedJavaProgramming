//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
//Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

import javax.swing.*;
import java.awt.*;

public class HelloSwing4a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Plain", Font.PLAIN, 32));

        frame.add(label);
        frame.setVisible(true);
    }
}
