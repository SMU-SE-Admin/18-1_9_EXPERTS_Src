package se.smu;


import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
public class signup extends JFrame{

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public signup()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,350,430);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setTitle("SIGN UP");
		
		JLabel NewLabel = new JLabel();
		NewLabel.setText("                      SIGN UP");
		NewLabel.setBackground(Color.BLUE);
		NewLabel.setOpaque(true);
		NewLabel.setFont(new Font("µ∏¿Ω",Font.PLAIN,20));
		NewLabel.setForeground(Color.WHITE);
		NewLabel.setBounds(0,0,350,75);
		contentPane.add(NewLabel);
		
		JLabel NewLabel_1 = new JLabel();
		NewLabel_1.setText("ID");
		NewLabel_1.setOpaque(true);
		NewLabel_1.setFont(new Font("µ∏¿Ω",Font.PLAIN,20));
		NewLabel_1.setBounds(50,110,40,40);
		contentPane.add(NewLabel_1);
		
		JLabel NewLabel_2 = new JLabel();
		NewLabel_2.setText("pw");
		NewLabel_2.setOpaque(true);
		NewLabel_2.setFont(new Font("µ∏¿Ω",Font.PLAIN,20));
		NewLabel_2.setBounds(50,170,40,40);
		contentPane.add(NewLabel_2);
		
		JLabel NewLabel_3 = new JLabel();
		NewLabel_3.setText("pw»Æ¿Œ");
		NewLabel_3.setOpaque(true);
		NewLabel_3.setFont(new Font("µ∏¿Ω",Font.PLAIN,20));
		NewLabel_3.setBounds(30,230,70,40);
		contentPane.add(NewLabel_3);

		textField = new JTextField();
		textField.setBounds(100,115,180,30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100,175,180,30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100,235,180,30);
		contentPane.add(textField_2);
	
		JButton btnNewButton = new JButton("OK");
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
						
							if(textField_1.getText().equals(textField_2.getText()))
							{
								
								FileWriter fw = new FileWriter("save.txt",true);
								BufferedWriter bf = new BufferedWriter(fw);
								
								bf.write(textField.getText()+" ");
								bf.write(textField_1.getText()+" ");
							    //bf.write(textField_2.getText()+" ");
								bf.close();
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
							
								OK frame = new OK();
								frame.setVisible(true);
								
								setVisible(false);
							    dispose();
							}
							
							else 
							{
								signupfail frame = new signupfail();
								frame.setVisible(true);
								
								setVisible(false);
							    dispose();
							}
							
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		
		btnNewButton.setBounds(50,295,115,40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
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
							login frame = new login();
							frame.setVisible(true);
							
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		btnNewButton_1.setBounds(170,295,115,40);
		contentPane.add(btnNewButton_1);
	}
}
