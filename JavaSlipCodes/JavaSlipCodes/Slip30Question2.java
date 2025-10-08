/*Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Number1 and Number2. The division of Number1 and Number2 is
displayed in the Result field when the Divide button is clicked. If Number1 or Number2 were
not an integer, the program would throw a NumberFormatException. If Number2 were Zero,
the program would throw an Arithmetic Exception Display the exception in a message
dialog box. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip30Question2 extends JFrame implements ActionListener 
{
    private JTextField number1Field, number2Field, resultField;
    private JButton divideButton;

    public Slip30Question2() 
	{
        setTitle("Integer Division");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Number 1:"));
        number1Field = new JTextField();
        add(number1Field);

        add(new JLabel("Number 2:"));
        number2Field = new JTextField();
        add(number2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        add(new JLabel());
    }

    public void actionPerformed(ActionEvent e) 
	{
        try 
		{
            int num1 = Integer.parseInt(number1Field.getText());
            int num2 = Integer.parseInt(number2Field.getText());

            if (num2 == 0) 
			{
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } 
		catch (NumberFormatException ex) 
		{
            JOptionPane.showMessageDialog(this, "Please enter valid integers only.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } 
		catch (ArithmeticException ex) 
		{
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            new Slip30Question2().setVisible(true);
        });
    }
}
