import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Map extends JFrame
{
	
	public static void main(String[] args) 
	{
		Map sp = new Map();
	}

	public Map() 
	{
		JFrame frame = new JFrame ("");
		frame.setSize(1010, 940);
		frame.setLocation(400, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Panel1 panel1 = new Panel1();
		frame.setContentPane(panel1);
		frame.setVisible(true);
		frame.setResizable(false);
		 
	}
}

class Panel1 extends JPanel
{
	private BufferedImage image;
	private BufferedImage image1;
	private BufferedImage image2;
	
	public Panel1()
	{
	try{                
	
          image = ImageIO.read(new File("Treasure.png"));
		  image1 = ImageIO.read(new File("BadGuy1.png"));
		  image2 = ImageIO.read(new File("BadGuy2.png"));
       } catch (IOException e) {
		   System.err.println("HELLO MY DUDE YOU TRASH!!!!");
	   }
		setBackground(Color.GREEN);
	}
	 public void paintComponent(Graphics g)
    {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		int w = getWidth();
        int h = getHeight();
		g.drawImage(image, 427, 27, this);
		g.drawImage(image1, 727, 127, this);
		g.drawImage(image2, 627, 127, this);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(9));
        g2.drawLine(3, 3, 3, 900);
		g2.drawLine(3, 3, 1000, 3);
		g2.drawLine(1000, 3, 1000, 900);
		g2.drawLine(3, 900, 1000, 900);
		g2.fillRect(100, 100, 50, 50);
		g2.fillRect(200, 100, 50, 50);
		g2.fillRect(100, 300, 50, 50);
		g2.fillRect(100, 500, 50, 50);
		g2.fillRect(100, 700, 50, 50);
		g2.fillRect(200, 300, 50, 50);
		g2.fillRect(200, 500, 50, 50);
		g2.fillRect(200, 700, 50, 50);
		g2.fillRect(400, 150, 50, 50);
		g2.fillRect(400, 350, 50, 50);
		g2.fillRect(400, 550, 50, 50);
		g2.fillRect(400, 750, 50, 50);
		g2.fillRect(500, 150, 50, 50);
		g2.fillRect(500, 350, 50, 50);
		g2.fillRect(500, 550, 50, 50);
		g2.fillRect(500, 750, 50, 50);
		g2.fillRect(800, 100, 50, 50);
		g2.fillRect(800, 300, 50, 50);
		g2.fillRect(800, 500, 50, 50);
		g2.fillRect(800, 700, 50, 50);
		g2.fillRect(700, 100, 50, 50);
		g2.fillRect(700, 300, 50, 50);
		g2.fillRect(700, 500, 50, 50);
		g2.fillRect(700, 700, 50, 50);		
	}
}