package swingCalculator;
import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;
//import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SimpleCalculator {
    public static void main(String[] args) {
//        create a panel
        JPanel windowContent = new JPanel();

//        set layout manager for this panel
        GridLayout gl = new GridLayout(4, 2);
        windowContent.setLayout(gl);

//        set controls in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField textfield1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField textfield2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField resultTestField = new JTextField(10);
        JButton addButton = new JButton("Add");

//        add controls to panel
        windowContent.add(label1);
        windowContent.add(textfield1);
        windowContent.add(label2);
        windowContent.add(textfield2);
        windowContent.add(label3);
        windowContent.add(resultTestField);
        windowContent.add(addButton);

//        create frame and add panel
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);

//        set size and make window visible
        frame.setSize(400, 120);
        frame.setVisible(true);
    }


}
