package examples.lab7;

import javax.swing.*;
import java.awt.*;

public class Lab7AlphaBetaMessage{
    public static void main(String[] args) {
        // JFrame with a title
        JFrame frame = new JFrame("Welcome to Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);  // Set the size of the window
        frame.setLayout(new FlowLayout());  // Set layout manager (FlowLayout in this case)

        // Create the buttons
        JButton alphaButton = new JButton("Alpha");
        JButton betaButton = new JButton("Beta");

        // Create a label to display messages
        JLabel messageLabel = new JLabel("Press a button");
        
        // Add action listener for the Alpha button with lambda expression
        alphaButton.addActionListener(e -> messageLabel.setText("Alpha pressed"));
        // Add action listener for the Beta button with lambda expression
        betaButton.addActionListener(e -> messageLabel.setText("Beta pressed"));

        // Add components to the frame
        frame.add(alphaButton);
        frame.add(betaButton);
        frame.add(messageLabel);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
