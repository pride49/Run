/*Write a simple currency converter, as shown in the figure. User can enter the amount of
"Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted
values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD,
1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Slip23Question2 extends JFrame implements ActionListener {

    private JTextField sgdField, usdField, euroField;
    private JButton convertBtn, clearBtn;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    // Conversion rates
    // 1 USD = 1.41 SGD
    // 1 USD = 0.92 Euro
    // 1 SGD = 0.65 Euro

    public Slip23Question2() 
	{
        setTitle("Currency Converter");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Singapore Dollars (SGD):"));
        sgdField = new JTextField();
        add(sgdField);

        add(new JLabel("US Dollars (USD):"));
        usdField = new JTextField();
        add(usdField);

        add(new JLabel("Euros (EUR):"));
        euroField = new JTextField();
        add(euroField);

        convertBtn = new JButton("Convert");
        clearBtn = new JButton("Clear");

        add(convertBtn);
        add(clearBtn);

        convertBtn.addActionListener(this);
        clearBtn.addActionListener(e -> clearFields());
    }

    private void clearFields() 
	{
        sgdField.setText("");
        usdField.setText("");
        euroField.setText("");
    }

    public void actionPerformed(ActionEvent e) 
	{
        try 
		{
            int filledCount = 0;
            if (!sgdField.getText().trim().isEmpty()) filledCount++;
            if (!usdField.getText().trim().isEmpty()) filledCount++;
            if (!euroField.getText().trim().isEmpty()) filledCount++;

            if (filledCount == 0) 
			{
                JOptionPane.showMessageDialog(this, "Please enter amount in one currency.");
                return;
            }
            if (filledCount > 1) 
			{
                JOptionPane.showMessageDialog(this, "Please enter amount in only one currency.");
                return;
            }

            if (!sgdField.getText().trim().isEmpty()) 
			{
                double sgd = Double.parseDouble(sgdField.getText());
                double usd = sgd / 1.41;
                double euro = sgd * 0.65;
                usdField.setText(df.format(usd));
                euroField.setText(df.format(euro));
            } 
			else if (!usdField.getText().trim().isEmpty()) 
			{
                double usd = Double.parseDouble(usdField.getText());
                double sgd = usd * 1.41;
                double euro = usd * 0.92;
                sgdField.setText(df.format(sgd));
                euroField.setText(df.format(euro));
            } 
			else if (!euroField.getText().trim().isEmpty()) 
			{
                double euro = Double.parseDouble(euroField.getText());
                double usd = euro / 0.92;
                double sgd = usd * 1.41;
                usdField.setText(df.format(usd));
                sgdField.setText(df.format(sgd));
            }
        } 
		catch (NumberFormatException ex) 
		{
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            new Slip23Question2().setVisible(true);
        });
    }
}
