package se.smu;

import java.awt.EventQueue;
public class start {
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					login frame = new login();
					frame.setVisible(true);
					
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
