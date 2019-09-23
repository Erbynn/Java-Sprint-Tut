/*Dabbling with Java interfaces*/

package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. Implement the interface
public class SimpleGui1B implements ActionListener {

    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");

//        2. Register with the button
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

//    3. define the event handling  by implementing the actionPerformed() method from the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I have been clinked");
    }
}
