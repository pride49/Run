/*Write a java program that works as a simple calculator. Use a grid layout to arrange buttons for
the digits and for the +, -, *, % operations. Add a text field to display the result.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip12Question2 extends JFrame implements ActionListener 
{
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public Slip12Question2() 
	{
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String b : buttons) 
		{
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') 
		{
            textField.setText(textField.getText() + command);
        }

        else if (command.equals("C")) 
		{
            textField.setText("");
            num1 = num2 = result = 0;
            operator = null;
        }

        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("%")) 
		{
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }

        else if (command.equals("=")) 
		{
            num2 = Double.parseDouble(textField.getText());
            switch (operator) 
			{
                case "+": 
					result = num1 + num2; 
				break;
                case "-": 
					result = num1 - num2; 
				break;
                case "*": 
					result = num1 * num2; 
				break;
                case "%": 
					result = num1 / num2; 
				break;
            }
            textField.setText("" + result);
        }
    }

    public static void main(String[] args) 
	{
        new Slip12Question2();
    }
}
