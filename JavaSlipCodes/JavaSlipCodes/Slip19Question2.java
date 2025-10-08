/*Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci)
subjects. Display the selected subject in a text field.*/

import javax.swing.*;
import java.awt.event.*;

public class Slip19Question2 extends JFrame implements ActionListener 
{

    JComboBox<String> subjectComboBox;
    JTextField selectedSubjectField;

    Slip19Question2() 
	{
        setTitle("T.Y.B.Sc. (Comp. Sci) Subjects");
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Select a Subject:");
        label.setBounds(50, 30, 150, 25);
        add(label);

        String[] subjects = {
            "Computer Networks",
            "Web Development",
            "Mobile Application Development",
            "Software Testing",
            "Data Science",
            "Artificial Intelligence",
            "Project Work"
        };

        subjectComboBox = new JComboBox<>(subjects);
        subjectComboBox.setBounds(180, 30, 180, 25);
        subjectComboBox.addActionListener(this);
        add(subjectComboBox);

        selectedSubjectField = new JTextField();
        selectedSubjectField.setBounds(50, 80, 310, 25);
        selectedSubjectField.setEditable(false);
        add(selectedSubjectField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String selectedSubject = (String) subjectComboBox.getSelectedItem();
        selectedSubjectField.setText("Selected Subject: " + selectedSubject);
    }

    public static void main(String[] args) 
	{
        new Slip19Question2();
    }
}
