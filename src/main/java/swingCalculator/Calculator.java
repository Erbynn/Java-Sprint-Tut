package swingCalculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
//    creating buttons constructor of the JButton class that takes the label of the buttons as parameters
    JButton   button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

//    constructor creates the components in memory
//    and adds them to the frame using combinaation of Borderlayout and Gridlayout
    Calculator(){

//        setting layout manager for this panel
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

//        creating the display field and placing it in the North area of the window
        windowContent.add("North", displayField);

//
//        creating the panel with the GridLayout containing 12 buttons
        JPanel panel1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        panel1.setLayout(gl);

//        adding panel1 controls
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button0);
        panel1.add(buttonPoint);
        panel1.add(buttonEqual);

//        adding panel1 to the center of the window
        windowContent.add("Center", panel1);

        JPanel panel2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,1);
        panel2.setLayout(gl2);
        panel2.add(buttonPlus);
        panel2.add(buttonMultiply);
        panel2.add(buttonDivide);

        windowContent.add("East", panel2);

//        creating the frame and set its content pane
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

//        setting size of window to accomodate all controls
        frame.pack();

//        finally, display the window
        frame.setVisible(true);

        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
