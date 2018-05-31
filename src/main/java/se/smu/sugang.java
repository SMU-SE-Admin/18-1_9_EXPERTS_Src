package se.smu;

import java.awt.*;
import javax.swing.*;

import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class sugang extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public sugang()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,350,550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setTitle("수강과목등록");
		
		JLabel NewLabel = new JLabel();
		NewLabel.setText("               수강과목 등록");
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
		NewLabel_2.setText("담당교수");
		NewLabel_2.setOpaque(true);
		NewLabel_2.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_2.setBounds(0,160,100,40);
		contentPane.add(NewLabel_2);
		
		JLabel NewLabel_3 = new JLabel();
		NewLabel_3.setText("강의요일");
		NewLabel_3.setOpaque(true);
		NewLabel_3.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_3.setBounds(0,210,100,40);
		contentPane.add(NewLabel_3);
		
		JLabel NewLabel_4 = new JLabel();
		NewLabel_4.setText("시간");
		NewLabel_4.setOpaque(true);
		NewLabel_4.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_4.setBounds(0,260,100,40);
		contentPane.add(NewLabel_4);
		
		JLabel NewLabel_5 = new JLabel();
		NewLabel_5.setText("수강년도");
		NewLabel_5.setOpaque(true);
		NewLabel_5.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_5.setBounds(0,310,100,40);
		contentPane.add(NewLabel_5);
		
		JLabel NewLabel_6 = new JLabel();
		NewLabel_6.setText("학기");
		NewLabel_6.setOpaque(true);
		NewLabel_6.setFont(new Font("돋음",Font.PLAIN,20));
		NewLabel_6.setBounds(0,360,100,40);
		contentPane.add(NewLabel_6);
		
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
		
		textField_5 = new JTextField();
		textField_5.setBounds(110,360,180,30);
		contentPane.add(textField_5);
		
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
								
						 FileWriter fw = new FileWriter("subject.txt",true);
							BufferedWriter bf = new BufferedWriter(fw);
							if(textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty()||textField_5.getText().isEmpty())
							{
								check frame1 = new check();
								frame1.setVisible(true);
								
								setVisible(false);
								 dispose();
							}
							else if(textField_5.getText().equals("1")||textField.getText().equals("2"))
							{
								check frame1 = new check();
								frame1.setVisible(true);
								
								setVisible(false);
								 dispose();
							}
							else if(textField_5.getText().equals("1")||textField.getText().equals("2"))
							{
							 if(textField_2.getText().equals("월")||textField_2.getText().equals("화")||textField_2.getText().equals("수")||textField_2.getText().equals("목")||textField_2.getText().equals("금")||textField_2.getText().equals("토")||textField_2.getText().equals("일"))
									{
							bf.write(textField.getText()+" ");
							bf.write(textField_1.getText()+" ");
							bf.write(textField_2.getText()+" ");
							bf.write(textField_3.getText()+" ");
							bf.write(textField_4.getText()+" ");
							bf.write(textField_5.getText()+" ");
							bf.write(" \n");
							bf.close();
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							
							insertok frame = new insertok();
							frame.setVisible(true);
							
							setVisible(false);
						    dispose();
									}
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
		btnNewButton.setBounds(50,450,115,40);
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
		btnNewButton_1.setBounds(175,450,115,40);
		contentPane.add(btnNewButton_1);
	
	}

}
