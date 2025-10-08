/*Design a screen to handle the Mouse Events such as MOUSE_MOVED
and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField.*/

import java.awt.*;
import java.awt.event.*;

public class Slip8Question2 extends Frame implements MouseListener, MouseMotionListener 
{
    TextField tf;

    Slip8Question2() 
	{
        setLayout(new FlowLayout());

        tf = new TextField(30);
        add(tf);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
        setTitle("Mouse Event Demo");
        setVisible(true);

        addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent we) 
			{
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent e) 
	{
        tf.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) 
	{}
    public void mouseReleased(MouseEvent e) 
	{}
    public void mouseEntered(MouseEvent e) 
	{}
    public void mouseExited(MouseEvent e) 
	{}

    public void mouseMoved(MouseEvent e) 
	{
        setTitle("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseDragged(MouseEvent e) 
	{}

    public static void main(String[] args) 
	{
        new Slip8Question2();
    }
}
