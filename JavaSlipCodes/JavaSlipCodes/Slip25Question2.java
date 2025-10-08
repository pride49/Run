/*Create the following GUI screen using appropriate layout manager. Accept the name, class,
hobbies from the user and display the selected options in a textbox.*/

import java.awt.*;
import java.awt.event.*;

public class Slip25Question2 extends Frame implements ActionListener 
{
    Label nameLabel, classLabel, hobbyLabel;
    TextField nameField;
    CheckboxGroup classGroup;
    Checkbox fy, sy, ty;
    Checkbox music, dance, sports, tv;
    Button submit;
    TextField output;  

    Slip25Question2() 
	{
        setTitle("Student Information Form");
        setSize(450, 300);
        setLayout(new GridLayout(5, 1));

        Panel namePanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        nameLabel = new Label("Your Name:");
        nameField = new TextField(20);
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        Panel classPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        classLabel = new Label("Your Class:");
        classGroup = new CheckboxGroup();
        fy = new Checkbox("FY", classGroup, false);
        sy = new Checkbox("SY", classGroup, false);
        ty = new Checkbox("TY", classGroup, false);
        classPanel.add(classLabel);
        classPanel.add(fy);
        classPanel.add(sy);
        classPanel.add(ty);

        Panel hobbyPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        hobbyLabel = new Label("Your Hobbies:");
        music = new Checkbox("Music");
        dance = new Checkbox("Dance");
        sports = new Checkbox("Sports");
        tv = new Checkbox("TV");
        hobbyPanel.add(hobbyLabel);
        hobbyPanel.add(music);
        hobbyPanel.add(dance);
        hobbyPanel.add(sports);
        hobbyPanel.add(tv);

        Panel buttonPanel = new Panel();
        submit = new Button("Submit");
        buttonPanel.add(submit);

        Panel outputPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        output = new TextField(35);
        output.setEditable(false);
        outputPanel.add(output);

        add(namePanel);
        add(classPanel);
        add(hobbyPanel);
        add(buttonPanel);
        add(outputPanel);

        submit.addActionListener(this);

        addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent we) 
			{
                dispose();   
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String name = nameField.getText();
        String selectedClass = (classGroup.getSelectedCheckbox() != null)
                ? classGroup.getSelectedCheckbox().getLabel()
                : "Not Selected";

        String hobbies = "";
        if (music.getState()) hobbies += "Music ";
        if (dance.getState()) hobbies += "Dance ";
        if (sports.getState()) hobbies += "Sports ";
        if (tv.getState()) hobbies += "TV ";

        output.setText("Name: " + name + "   Class: " + selectedClass + "   Hobbies: " + hobbies);
    }

    public static void main(String[] args) 
	{
        new Slip25Question2();
    }
}