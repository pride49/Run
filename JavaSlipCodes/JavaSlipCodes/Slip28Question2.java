/*Write a program called SwingTemperatureConverter to convert temperature values
between Celsius and Fahrenheit. User can enter either the Celsius or the Fahrenheit value,
in floating-point number. Hints: To display a floating-point number in a specific format
(e.g., 1 decimal place), use the static method String.format(), which has the same form
as printf(). For example, String.format("%.1f", 1.234) returns String "1.2".*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip28Question2 extends JFrame implements ActionListener 
{
    private JTextField celsiusField, fahrenheitField;
    private JButton cToFButton, fToCButton, clearButton;

    public Slip28Question2() 
	{
        setTitle("Temperature Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Panel for layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add components
        panel.add(new JLabel("Celsius:"));
        celsiusField = new JTextField();
        panel.add(celsiusField);

        panel.add(new JLabel("Fahrenheit:"));
        fahrenheitField = new JTextField();
        panel.add(fahrenheitField);

        cToFButton = new JButton("C → F");
        cToFButton.addActionListener(this);
        panel.add(cToFButton);

        fToCButton = new JButton("F → C");
        fToCButton.addActionListener(this);
        panel.add(fToCButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        // Empty label to balance grid
        panel.add(new JLabel());

        add(panel);
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == cToFButton) 
		{
            // Convert Celsius to Fahrenheit
            try 
			{
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                fahrenheitField.setText(String.format("%.1f", fahrenheit));
            } 
			catch (NumberFormatException ex) 
			{
                JOptionPane.showMessageDialog(this, "Please enter a valid Celsius value.");
            }
        } 
		else if (e.getSource() == fToCButton) 
		{
            // Convert Fahrenheit to Celsius
            try 
			{
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                celsiusField.setText(String.format("%.1f", celsius));
            } 
			catch (NumberFormatException ex) 
			{
                JOptionPane.showMessageDialog(this, "Please enter a valid Fahrenheit value.");
            }
        } 
		else if (e.getSource() == clearButton) 
		{
            celsiusField.setText("");
            fahrenheitField.setText("");
        }
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> 
		{
            new Slip28Question2().setVisible(true);
        });
    }
}
