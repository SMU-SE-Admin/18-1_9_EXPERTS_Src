package se.smu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class logout extends JFrame{
	
	private JPanel contentPane;
	private JTable table;

	public logout()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//contentPane.setBackground(Color.WHITE);
		setTitle("LOGOUT");
		
JLabel NewLabel = new JLabel();
		
		NewLabel.setText("    ·Î±×¾Æ¿ôÇÏ½Ã°Ú½À´Ï±î?");
		NewLabel.setOpaque(true);
		//NewLabel.setBackground(Color.WHITE);
		NewLabel.setFont(new Font("µ¸À½", Font.PLAIN, 30));
		NewLabel.setBounds(0, 50, 400, 50);
		contentPane.add(NewLabel);
		
		JButton btnNewButton = new JButton("YES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							login frame = new login();
							frame.setVisible(true);
							
							setVisible(false);
						    dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(65, 130, 100, 50);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("µ¸À½", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							main frame = new main();
							frame.setVisible(true);
							
							setVisible(false);
						    dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(215, 130, 100, 50);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("µ¸À½", Font.PLAIN, 15));
		btnNewButton_1.setForeground(Color.WHITE);
		contentPane.add(btnNewButton_1);
	}
}
