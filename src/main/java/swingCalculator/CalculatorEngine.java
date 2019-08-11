package swingCalculator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalculatorEngine implements ActionListener{

    Calculator parent;
    char selectedAction = ' ';
    double currentResult = 0;

    CalculatorEngine(Calculator parent){
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e){
//        get the source the source of the action
        JButton clickedButton = (JButton) e.getSource();
        String displayFieldText = parent.displayField.getText();

        double displayValue = 0;

//        get the number from the text field if not empty
        if (!"".equals(displayFieldText)){
            displayValue = Double.parseDouble(displayFieldText);
        }

        Object src = e.getSource();

        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        }
        else if(src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        }
        else if(src == parent.buttonDivide){
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        }
        else if(src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        }
        else if (src == parent.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            } else {
                String clickedButtonLabel1 = clickedButton.getText();
                parent.displayField.setText(displayFieldText + clickedButtonLabel1);

            }
        }


//        get button's label
//        String clickedButtonLabel1 = clickedButton.getText();
//
////        concatenate the button's label to the text of the message of the message box
//        JOptionPane.showConfirmDialog(null,
//                "You pressed " + clickedButtonLabel1,
//                "Just a Test",
//                JOptionPane.PLAIN_MESSAGE);

    }


}
