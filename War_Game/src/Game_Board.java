
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;




public class Game_Board extends JPanel implements ActionListener, KeyListener
{
	Timer t = new Timer(5, this);
	double x = 0, y = 0, velX = 0, velY = 0;
	
	private Image map;
	private Image player;
	
//	private int x = 100, y = 100;
//	private Timer  t;
//	
	public Game_Board()
	{
		super.setDoubleBuffered(true);
		
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		ImageIcon ii = new ImageIcon(this.getClass().getResource("map2.png"));
		map = ii.getImage();
		ImageIcon ii2 = new ImageIcon(this.getClass().getResource("finalmcguire.png"));
		player = ii2.getImage();
		
		//get resource is how you get the image
		Graphics2D g2 = (Graphics2D)g;
		// X, Y, Width, Height
		//plus 50 on the x axis
		g2.drawImage(map, 0, 0, this);
		g2.drawImage(player, 200, 350, this);
		
		g2.fill(new Ellipse2D.Double(x, y, 40, 40));
	}

	
	public void actionPerformed(ActionEvent e)
	{
		
		repaint();
		x += velX;
		y += velY;
		
		if (x == 0)
		{
			velX = 0;
		}
		
		else if (x == 434)
		{
			velX = 0;
		}
		
		if (y == 0)
		{
			velY = 0;
		}
		
		else if (y == 311)
		{
			velY = 0;
		}
	}
	
	public void up()
	{
		velY = -0.7;
		velX = 0;
	}
	
	public void down()
	{
		velY = 0.7;
		velX = 0;
	}
	
	public void left()
	{
		velY = 0;
		velX = -0.7;
	}
	
	public void right()
	{
		velY = 0;
		velX = 0.7;
	}

	
	@Override
	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_W)
		{
			up();
		}
		
		if (code == KeyEvent.VK_S)
		{
			down();
		}
		
		if (code == KeyEvent.VK_A)
		{
			left();
		}
		
		if (code == KeyEvent.VK_D)
		{
			right();
		}
	}
	@Override
	public void keyTyped(KeyEvent e)
	{}

	

	@Override
	public void keyReleased(KeyEvent e)
	{}


	

}
