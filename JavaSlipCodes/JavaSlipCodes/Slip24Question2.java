/*Program that displays three concentric circles where ever the user clicks the mouse on a frame.
The program must exit when user clicks ‘X’ on the frame. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip24Question2 extends JFrame 
{
    private int x = -100;
    private int y = -100;

    public Slip24Question2() 
	{
        setTitle("Concentric Circles on Click");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on 'X'
        setLocationRelativeTo(null);

        DrawingPanel panel = new DrawingPanel();
        add(panel);

        panel.addMouseListener(new MouseAdapter() 
		{
            public void mouseClicked(MouseEvent e) 
			{
                x = e.getX();
                y = e.getY();
                panel.repaint(); // Trigger paintComponent
            }
        });
    }

    class DrawingPanel extends JPanel 
	{
        protected void paintComponent(Graphics g) 
		{
            super.paintComponent(g);

            if (x >= 0 && y >= 0) 
			{
                g.setColor(Color.BLUE);

                g.drawOval(x - 20, y - 20, 40, 40);
                g.drawOval(x - 40, y - 40, 80, 80);
                g.drawOval(x - 60, y - 60, 120, 120);
            }
        }
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            new Slip24Question2().setVisible(true);
        });
    }
}
