package se.smu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.util.StringTokenizer;

public class login extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public login()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,350,430);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setTitle("Experts Scheduler");
		//contentPane.setBackground(Color.WHITE);
		
		
		JLabel NewLabel_3 = new JLabel();
		NewLabel_3.setText("                   TO DO LIST");
		NewLabel_3.setBackground(Color.BLUE);
		NewLabel_3.setOpaque(true);
		NewLabel_3.setFont(new Font("µ¸À½",Font.PLAIN,20));
		NewLabel_3.setForeground(Color.WHITE);
		NewLabel_3.setBounds(0,0,350,75);
		contentPane.add(NewLabel_3);
		
		JLabel NewLabel = new JLabel();
		NewLabel.setText("ID");
		NewLabel.setOpaque(true);
		NewLabel.setFont(new Font("µ¸À½",Font.PLAIN,20));
		NewLabel.setBounds(50,110,40,40);
		contentPane.add(NewLabel);
		
		JLabel NewLabel_1 = new JLabel();
		NewLabel_1.setText("pw");
		NewLabel_1.setOpaque(true);
		NewLabel_1.setFont(new Font("µ¸À½",Font.PLAIN,20));
		NewLabel_1.setBounds(50,170,40,40);
		contentPane.add(NewLabel_1);
	
		textField = new JTextField();
		textField.setBounds(100,115,180,30);
		contentPane.add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(100,175,180,30); 
		contentPane.add(textField_1);

		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							FileReader fr = new FileReader("save.txt");
							BufferedReader inFile = new BufferedReader(fr);
							String line = inFile.readLine();
							StringTokenizer tokenizer = new StringTokenizer(line," ");
							int n = tokenizer.countTokens();
							
							if(textField.getText().isEmpty()||textField_1.getText().isEmpty())
							{
								noid frame = new noid();
								frame.setVisible(true);
								setVisible(false);
							    dispose();
							}
							for(int i=1;i<=n/2;i++)
							{
						
							String idi = tokenizer.nextToken();
							String pwi = tokenizer.nextToken();
							
							 if(idi.equals(textField.getText())&&pwi.equals(textField_1.getText()))
							{
							main frame = new main();
							frame.setVisible(true);
							setVisible(false);
						    dispose();
							break;
							}
							else 
							{
							
									noid frame = new noid();
									frame.setVisible(true);
									setVisible(false);
								    dispose();
							}
							
							}

					}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		btnNewButton.setBounds(50,215,115,40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							signup frame = new signup();
							frame.setVisible(true);
							
							setVisible(false);
						    dispose();
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		btnNewButton_1.setBounds(175,215,115,40);
		contentPane.add(btnNewButton_1);
		
		JLabel NewLabel_2 = new JLabel("¿À´ÃÀÇ ¸í¾ð");
		NewLabel_2.setBounds(50,290,200,30);
		contentPane.add(NewLabel_2);
		
		JLabel NewLabel_4 = new JLabel("ÀÏÂïÀÏ¾î³ª´Â »õ°¡ ÀÏÂïÁ×´Â´Ù");
		NewLabel_4.setBounds(50,325,200,30);
		contentPane.add(NewLabel_4);
		
	}
}
