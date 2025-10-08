/*Write a program that handles all mouse events and shows the event name at the center of the
Window, red in color when a mouse event is fired. (Use adapter classes).*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip22Question2 extends JFrame 
{
    private String eventName = "";  
    public Slip22Question2() 
	{
        setTitle("Mouse Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() 
		{
            protected void paintComponent(Graphics g) 
			{
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.setFont(new Font("Arial", Font.BOLD, 24));
                FontMetrics fm = g.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(eventName)) / 2;
                int y = (getHeight() / 2) + (fm.getAscent() / 2);
                g.drawString(eventName, x, y);
            }
        };

        panel.addMouseListener(new MouseAdapter() 
		{
            public void mouseClicked(MouseEvent e) 
			{
                eventName = "Mouse Clicked";
                panel.repaint();
            }

            public void mousePressed(MouseEvent e) 
			{
                eventName = "Mouse Pressed";
                panel.repaint();
            }

            public void mouseReleased(MouseEvent e) 
			{
                eventName = "Mouse Released";
                panel.repaint();
            }

            public void mouseEntered(MouseEvent e) 
			{
                eventName = "Mouse Entered";
                panel.repaint();
            }

            public void mouseExited(MouseEvent e) 
			{
                eventName = "Mouse Exited";
                panel.repaint();
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() 
		{
            public void mouseMoved(MouseEvent e) 
			{
                eventName = "Mouse Moved";
                panel.repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) 
			{
                eventName = "Mouse Dragged";
                panel.repaint();
            }
        });

        add(panel);
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            new Slip22Question2().setVisible(true);
        });
    }
}
