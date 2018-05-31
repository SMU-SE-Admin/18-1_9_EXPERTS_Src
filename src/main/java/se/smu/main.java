package se.smu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
public class main extends JFrame{
	
	private JPanel contentPane;
	protected JTable table;
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	protected JTextField textField_4;
	
	public main  ()
	{
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0,0,700,600);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	contentPane.setLayout(null);
	setContentPane(contentPane);
	//contentPane.setBackground(Color.WHITE);
	setTitle("MAIN");
	
	JLabel NewLabel11 = new JLabel();
	NewLabel11.setText("               TO DO LIST 수정");
	NewLabel11.setBackground(Color.BLUE);
	NewLabel11.setOpaque(true);
	NewLabel11.setFont(new Font("돋음",Font.PLAIN,20));
	NewLabel11.setForeground(Color.WHITE);
	NewLabel11.setBounds(400,0,350,30);
	contentPane.add(NewLabel11);
	
	JLabel NewLabel_11 = new JLabel();
	NewLabel_11.setText("과목명");
	NewLabel_11.setOpaque(true);
	NewLabel_11.setFont(new Font("돋음",Font.PLAIN,15));
	NewLabel_11.setBounds(410,35,100,15);
	contentPane.add(NewLabel_11);
	
	JLabel NewLabel_22 = new JLabel();
	NewLabel_22.setText("마감기한");
	NewLabel_22.setOpaque(true);
	NewLabel_22.setFont(new Font("돋음",Font.PLAIN,15));
	NewLabel_22.setBounds(410,70,100,15);
	contentPane.add(NewLabel_22);
	
	JLabel NewLabel_33 = new JLabel();
	NewLabel_33.setText("실제마감일");
	NewLabel_33.setOpaque(true);
	NewLabel_33.setFont(new Font("돋음",Font.PLAIN,15));
	NewLabel_33.setBounds(410,105,100,15);
	contentPane.add(NewLabel_33);
	
	JLabel NewLabel_44 = new JLabel();
	NewLabel_44.setText("완료여부");
	NewLabel_44.setOpaque(true);
	NewLabel_44.setFont(new Font("돋음",Font.PLAIN,15));
	NewLabel_44.setBounds(410,140,100,15);
	contentPane.add(NewLabel_44);
	
	JLabel NewLabel_55 = new JLabel();
	NewLabel_55.setText("중요도");
	NewLabel_55.setOpaque(true);
	NewLabel_55.setFont(new Font("돋음",Font.PLAIN,15));
	NewLabel_55.setBounds(410,175,100,15);
	contentPane.add(NewLabel_55);
	
	textField = new JTextField();
	textField.setBounds(510,35,100,20);
	contentPane.add(textField);
	
	textField_1 = new JTextField();
	textField_1.setBounds(510,70,100,20);
	contentPane.add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setBounds(510,105,100,20);
	contentPane.add(textField_2);
	
	textField_3 = new JTextField();
	textField_3.setBounds(510,140,100,20);
	contentPane.add(textField_3);
	
	textField_4 = new JTextField();
	textField_4.setBounds(510,175,100,20);
	contentPane.add(textField_4);
	
	
	
	JLabel NewLabel = new JLabel();
	
	NewLabel.setText("                TO DO LIST");
	NewLabel.setBackground(Color.BLUE);
	NewLabel.setOpaque(true);
	NewLabel.setFont(new Font("돋음",Font.PLAIN,30));
	NewLabel.setForeground(Color.WHITE);
	NewLabel.setBounds(0,0,400,30);
	contentPane.add(NewLabel);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 40, 400, 180);
	scrollPane.setBackground(Color.WHITE);
	contentPane.add(scrollPane);
	
	final JTable table1 = new JTable();
         table1.setAutoCreateRowSorter(true);
         try
	{
		FileReader fr = new FileReader("todolist.txt");
		BufferedReader inFile = new BufferedReader(fr);
		String line = inFile.readLine().trim();	
	
	
		String[] columnsName = line.split(" ");
		DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
		model1.setColumnIdentifiers(columnsName);
		
		
		Object[] tableLines = inFile.lines().toArray();
		for(int i=0; i<tableLines.length;i++)
		{
			String line2 = tableLines[i].toString().trim();
			String[] dataRow = line2.split(" ");
			model1.addRow(dataRow);
		}
		
		
		JButton btnNewButton_11 = new JButton("Todolist 수정");
		btnNewButton_11.setBackground(Color.BLUE);
		btnNewButton_11.setForeground(Color.WHITE);
		btnNewButton_11.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
							int SelectedRowIndex1 = table1.getSelectedRow(); 
							if(textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty()||textField_3.getText().isEmpty()||textField_4.getText().isEmpty())
							{
								check frame = new check();
								frame.setVisible(true);
								
								setVisible(false);
							    dispose();
							}
							else if(textField_3.getText().equals("완료")||textField_3.getText().equals("진행"))
								{
									if(textField_4.getText().equals("1")||textField_4.getText().equals("2")||textField_4.getText().equals("3")||textField_4.getText().equals("4")||textField_4.getText().equals("5"))
									{	
										if(SelectedRowIndex1>=0)
										{
								table1.setValueAt(textField.getText(), SelectedRowIndex1, 0);
								table1.setValueAt(textField_1.getText(), SelectedRowIndex1, 1);
								table1.setValueAt(textField_2.getText(), SelectedRowIndex1, 2);
								table1.setValueAt(textField_3.getText(), SelectedRowIndex1, 3);
								table1.setValueAt(textField_4.getText(), SelectedRowIndex1, 4);
									}
							}
								}
							
								else
								{
									check frame = new check();
									frame.setVisible(true);	
									
									setVisible(false);
								    dispose();
								}
						}
					
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}; 
						});
			}
				});
		btnNewButton_11.setBounds(485,225,130,35);
		contentPane.add(btnNewButton_11);
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	scrollPane.setViewportView(table1);
	
	
		JButton btnNewButton_12 = new JButton("Delet Todolist");
		btnNewButton_12.setBackground(Color.BLUE);
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							
							DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
							int SelectedRowIndex1 = table1.getSelectedRow(); 
							model1.removeRow(SelectedRowIndex1);
							//table1.setRowHeight(SelectedRowIndex1, 3);
							}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		btnNewButton_12.setBounds(205,225,130,35);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_122 = new JButton("완료항목숨기기");
		btnNewButton_122.setBackground(Color.BLUE);
		btnNewButton_122.setForeground(Color.WHITE);
		btnNewButton_122.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							
							DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
							
							
							//int SelectedRowIndex1 = table1.getSelectedRow(); 
							//model1.removeRow(SelectedRowIndex1);
							int rows = 0;
							rows = table1.getRowCount();
							for(int i=0;i<rows;i++)
							{
							if(table1.getValueAt(i, 3).equals("완료"))
							{
							table1.setRowHeight(i,1);
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
		btnNewButton_122.setBounds(488,300,130,35);
		contentPane.add(btnNewButton_122);
		
		JButton btnNewButton_123 = new JButton("완료항목보이기");
		btnNewButton_123.setBackground(Color.BLUE);
		btnNewButton_123.setForeground(Color.WHITE);
		btnNewButton_123.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
						{
					public void run()
					{
						try
						{
							
							DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
							//int SelectedRowIndex1 = table1.getSelectedRow(); 
							//model1.removeRow(SelectedRowIndex1);
							int rows = table1.getRowCount();
							for(int i=0;i<rows;i++)
							{
							if(table1.getValueAt(i, 3).equals("완료"))
							{
							table1.setRowHeight(i,15);
							}
							}
							//table1.setRowHeight(i,15);
							}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
						});
			}
				});
		btnNewButton_123.setBounds(488,350,130,35);
		contentPane.add(btnNewButton_123);
	
JLabel NewLabel_1 = new JLabel();
	
	NewLabel_1.setText("                 수강 과목");
	NewLabel_1.setBackground(Color.BLUE);
	NewLabel_1.setOpaque(true);
	NewLabel_1.setFont(new Font("돋음",Font.PLAIN,30));
	NewLabel_1.setForeground(Color.WHITE);
	NewLabel_1.setBounds(0,275,400,30);
	contentPane.add(NewLabel_1);
	
	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(0, 315, 400, 180);
	scrollPane_1.setBackground(Color.WHITE);
	contentPane.add(scrollPane_1);
	
	table = new JTable();
	table.setAutoCreateRowSorter(true);
	try
	{
	FileReader fr1 = new FileReader("subject.txt");
	BufferedReader inFile1 = new BufferedReader(fr1);
	String line1 = inFile1.readLine();
	//StringTokenizer tokenizer1 = new StringTokenizer(line1," \n");
	//int n1 = tokenizer1.countTokens();
	String[] columnsName = line1.split(" ");
	DefaultTableModel model = (DefaultTableModel)table.getModel();
	model.setColumnIdentifiers(columnsName);
	
	
	Object[] tableLines = inFile1.lines().toArray();
	for(int i=0; i<tableLines.length;i++)
	{
		String lline = tableLines[i].toString().trim();
		String[] dataRow = lline.split(" ");
		model.addRow(dataRow);
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	//for(int i=1;i<=n1/2;i++)
	
	//{

	//String a1i = tokenizer1.nextToken(" ");
	//String b1i = tokenizer1.nextToken(" ");
	//String c1i = tokenizer1.nextToken(" ");
	//String d1i = tokenizer1.nextToken(" ");
	//String e1i = tokenizer1.nextToken(" ");
	//String f1i = tokenizer1.nextToken(" ");
	
	//table.setModel(new DefaultTableModel(
		//new Object[][] {{a1i,b1i,c1i,d1i,e1i,f1i},{},{}},
		//new String[] {"과목명","담당교수", "강의요일", "시간","수강년도","학기"}
	
			//));
	
	scrollPane_1.setViewportView(table);
	//}
	
	//fr1.close();
	//}catch (Exception e)
	//{
		//e.printStackTrace();
	//}
	
	JButton btnNewButton = new JButton("TODOLIST");
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
					
						inserttodolist frame = new inserttodolist();
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
	btnNewButton.setBounds(55,225,130,35);
	contentPane.add(btnNewButton);
		
	JButton btnNewButton_1 = new JButton("수강과목");
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
						sugang frame = new sugang();
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
	btnNewButton_1.setBounds(55,505,130,35);
	contentPane.add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("로그아웃");
	btnNewButton_2.setBackground(Color.BLUE);
	btnNewButton_2.setForeground(Color.WHITE);
	btnNewButton_2.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent arg0)
		{
			EventQueue.invokeLater(new Runnable()
					{
				public void run()
				{
					try
					{
						logout frame = new logout();
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
	btnNewButton_2.setBounds(488,400,130,35);
	contentPane.add(btnNewButton_2);
	
	JButton btnNewButton_10 = new JButton("Delet 수강과목");
	btnNewButton_10.setBackground(Color.BLUE);
	btnNewButton_10.setForeground(Color.WHITE);
	btnNewButton_10.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent arg0)
		{
			EventQueue.invokeLater(new Runnable()
					{
				public void run()
				{
					try
					{
						
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						int SelectedRowIndew = table.getSelectedRow(); 
						model.removeRow(SelectedRowIndew);
						
					}catch (Exception e)
					{
						e.printStackTrace();
					}
				}
					});
		}
			});
	btnNewButton_10.setBounds(205,505,130,35);
	contentPane.add(btnNewButton_10);
	}
}
