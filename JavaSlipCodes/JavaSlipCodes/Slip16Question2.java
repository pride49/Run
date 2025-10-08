/*Write a program to design a screen using Awt that,*/

import java.awt.*;
import java.awt.event.*;

public class Slip16Question2 extends Frame implements ActionListener 
{

    MenuBar menuBar;
    Menu fileMenu, editMenu, aboutMenu;
    MenuItem newItem, openItem, saveItem, exitItem, showAboutItem;

    public Slip16Question2() 
	{
        setTitle("Java AWT Example");
        setSize(400, 300);
        setLayout(null);

        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        aboutMenu = new Menu("About");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
		showAboutItem = new MenuItem("Show About");
        exitItem = new MenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
		fileMenu.addSeparator();
        fileMenu.add(showAboutItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        setMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        showAboutItem.addActionListener(this);

        addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent e) 
			{
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String command = e.getActionCommand();
        if (command.equals("Exit")) 
		{
            dispose();
        } 
		else 
		{
            System.out.println(command + " selected.");
        }
    }

    public static void main(String[] args) 
	{
        new Slip16Question2();
    }
}