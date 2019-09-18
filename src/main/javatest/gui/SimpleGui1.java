package gui;

import javax.swing.*;

public class SimpleGui1 {

    public static void main(String[] args) {

//        make frame and button
        JFrame frame = new JFrame();
        JButton btn = new JButton("papa");

//        makes the program quit as soon as you close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        add button to the frame content pane
        frame.getContentPane().add(btn);

//        set size of frame in pixels
        frame.setSize(300, 300);

//        make it visible
        frame.setVisible( true);
    }
}
