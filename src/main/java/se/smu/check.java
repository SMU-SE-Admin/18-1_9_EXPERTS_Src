package se.smu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;



public class check extends JFrame{

	private JPanel contentPane;
	private JTable table;
	
	public check()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		setTitle("cancel");
		
JLabel NewLabel = new JLabel();
		
		NewLabel.setText("        정보를 확인해주세요.");
		NewLabel.setOpaque(true);

		NewLabel.setFont(new Font("돋음", Font.PLAIN, 30));
		NewLabel.setBounds(0, 50, 400, 50);
		contentPane.add(NewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(85, 130, 200, 50);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("돋음", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
	}

}
