//
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.geom.Ellipse2D;
//
//import javax.swing.ImageIcon;
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
//public class Sprite extends JPanel implements ActionListener, KeyListener
//{
//	
//	Timer t = new Timer(5, this);
//	double x = 0, y = 0, velX = 0, velY = 0;
//	
//	public Sprite()
//	{
//		
//		t.start();
//		addKeyListener(this);
//		setFocusable(true);
//		setFocusTraversalKeysEnabled(false);
//	}
//	
//	public void paintComponent (Graphics g)
//	{
//		super.paintComponent(g);
//		
//		Graphics2D g2 = (Graphics2D) g;
//		
//		g2.fill(new Ellipse2D.Double(x, y, 40, 40));
//	}
//	
//	public void actionPerformed(ActionEvent e) 
//	{
//		repaint();
//		x += velX;
//		y += velY;
//	}
//	
//	public void up()
//	{
//		velY = -1.5;
//		velX = 0;
//	}
//	
//	public void down()
//	{
//		velY = -1.5;
//		velX = 0;
//	}
//	
//	public void left()
//	{
//		velY = -1.5;
//		velX = 0;
//	}
//	
//	public void right()
//	{
//		velY = -1.5;
//		velX = 0;
//	}
//
//	
//	@Override
//	public void keyPressed(KeyEvent e)
//	{
//		int code = e.getKeyCode();
//		if (code == KeyEvent.VK_UP)
//		{
//			up();
//		}
//		
//		if (code == KeyEvent.VK_DOWN)
//		{
//			down();
//		}
//		
//		if (code == KeyEvent.VK_LEFT)
//		{
//			left();
//		}
//		
//		if (code == KeyEvent.VK_RIGHT)
//		{
//			right();
//		}
//	}
//	@Override
//	public void keyTyped(KeyEvent e)
//	{}
//
//	
//
//	@Override
//	public void keyReleased(KeyEvent e)
//	{}
//	
//	
//}
//
