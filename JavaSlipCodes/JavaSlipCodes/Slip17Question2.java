/*Write Java program to design three text boxes and two buttons using swing. Enter different
strings in first and second textbox. On clicking the First command button, concatenation of
two strings should be displayed in third text box and on clicking second command button,
reverse of string should display in third text box*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip17Question2 extends JFrame implements ActionListener 
{
    private JTextField textField1, textField2, textField3;
    private JButton concatButton, reverseButton;

    public Slip17Question2() 
	{
        setTitle("String Operations");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField3.setEditable(false); // Output field

        concatButton = new JButton("Concatenate");
        reverseButton = new JButton("Reverse");

        concatButton.addActionListener(this);
        reverseButton.addActionListener(this);

        add(new JLabel("Enter First String:"));
        add(textField1);

        add(new JLabel("Enter Second String:"));
        add(textField2);

        add(new JLabel("Result:"));
        add(textField3);

        add(concatButton);
        add(reverseButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String str1 = textField1.getText();
        String str2 = textField2.getText();

        if (e.getSource() == concatButton) 
		{
            String result = str1 + str2;
            textField3.setText(result);
        } 
		else if (e.getSource() == reverseButton) 
		{
            String combined = str1 + str2;
            String reversed = new StringBuilder(combined).reverse().toString();
            textField3.setText(reversed);
        }
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> new Slip17Question2());
    }
}
