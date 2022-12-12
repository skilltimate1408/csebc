package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {
	int i=0;
	int total=0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(218, 10, 134, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b1.PNG"));
		lblNewLabel_1.setBounds(30, 70, 144, 188);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b3.PNG"));
		lblNewLabel_2.setBounds(266, 73, 153, 198);
		frame.getContentPane().add(lblNewLabel_2);
		JLabel lblcost = new JLabel("Cost : 0");
		lblcost.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblcost.setBounds(456, 82, 144, 41);
		frame.getContentPane().add(lblcost);
		JLabel lblcart = new JLabel("Cart : 0");
		lblcart.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblcart.setBounds(495, 30, 129, 41);
		frame.getContentPane().add(lblcart);
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart : "+i);
				total=total+120;
				lblcost.setText("Cost :"+total);
			}
		});
		btnNewButton.setBounds(53, 309, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart : "+i);
				total=total+120;
				lblcost.setText("Cost :"+total);
			}
		});
		btnNewButton_1.setBounds(312, 309, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("120/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(76, 278, 62, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("270/-");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(335, 281, 62, 21);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		
		
		
	}

}
