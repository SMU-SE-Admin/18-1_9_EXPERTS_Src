package se.smu;

import java.awt.*;
import javax.swing.*;

import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class inserttodolist extends JFrame{

	
	private JPanel contentPane;
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	protected JTextField textField_4;
	
	
	public inserttodolist()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,350,500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setTitle("INSERT TO DO LIST");
		
		JLabel NewLabel = new JLabel();
		NewLabel.setText("               TO DO LIST 등록");
		NewLabel.setBackground(Color.BLUE);
		NewLabel.setOpaque(true);
		NewLabel.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel.setForeground(Color.WHITE);
		NewLabel.setBounds(0,0,350,75);
		contentPane.add(NewLabel);
		
		JLabel NewLabel_1 = new JLabel();
		NewLabel_1.setText("과목명");
		NewLabel_1.setOpaque(true);
		NewLabel_1.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_1.setBounds(0,110,100,40);
		contentPane.add(NewLabel_1);
		
		JLabel NewLabel_2 = new JLabel();
		NewLabel_2.setText("마감기한");
		NewLabel_2.setOpaque(true);
		NewLabel_2.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_2.setBounds(0,160,100,40);
		contentPane.add(NewLabel_2);
		
		JLabel NewLabel_3 = new JLabel();
		NewLabel_3.setText("실제마감일");
		NewLabel_3.setOpaque(true);
		NewLabel_3.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_3.setBounds(0,210,100,40);
		contentPane.add(NewLabel_3);
		
		JLabel NewLabel_4 = new JLabel();
		NewLabel_4.setText("완료여부");
		NewLabel_4.setOpaque(true);
		NewLabel_4.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_4.setBounds(0,260,100,40);
		contentPane.add(NewLabel_4);
		
		JLabel NewLabel_5 = new JLabel();
		NewLabel_5.setText("중요도");
		NewLabel_5.setOpaque(true);
		NewLabel_5.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_5.setBounds(0,310,100,40);
		contentPane.add(NewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(110,110,180,30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110,160,180,30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110,210,180,30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110,260,180,30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110,310,180,30);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("등록");
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
							
							FileWriter fw = new FileWriter("todolist.txt",true);
							BufferedWriter bf = new BufferedWriter(fw);
							if(textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty())
							{
								check frame1 = new check();
								frame1.setVisible(true);
								
								setVisible(false);
							    dispose();
							}
							
							else if((textField_3.getText().equals("완료")||textField_3.getText().equals("진행"))&&(textField_4.getText().equals("1")||textField_4.getText().equals("2")||textField_4.getText().equals("3")||textField_4.getText().equals("4")||textField_4.getText().equals("5")))
								{	
								
									bf.write(textField.getText()+" ");
							bf.write(textField_1.getText()+" ");
							bf.write(textField_2.getText()+" ");
							bf.write(textField_3.getText()+" ");
							bf.write(textField_4.getText()+" ");
							bf.write(" \n");
							bf.close();
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							
							insertok frame = new insertok();
							frame.setVisible(true);
							
							setVisible(false);
						    dispose();
								}
								
							else
							{
								check frame1 = new check();
								frame1.setVisible(true);
								
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
		btnNewButton.setBounds(50,400,115,40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
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
					
							cancel frame = new cancel();
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
		btnNewButton_1.setBounds(175,400,115,40);
		contentPane.add(btnNewButton_1);
	
		
	}
}
