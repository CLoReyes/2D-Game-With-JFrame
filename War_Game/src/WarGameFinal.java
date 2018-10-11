import javax.swing.JFrame;

public class WarGameFinal extends JFrame
{

	
	public WarGameFinal ()
	{
		super.setTitle("Waaaar");
		super.setSize(311,434);
		super.setResizable(false);
		super.add(new Game_Board());
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	public static void main(String[] args)
	{
		new WarGameFinal();
		
	}

}
