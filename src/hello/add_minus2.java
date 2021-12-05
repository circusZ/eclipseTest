package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_minus2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_minus2 frame = new add_minus2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public add_minus2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(14, 58, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(14, 141, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("相加");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				Double c = Double.valueOf(s1) + Double.valueOf(s2);
				textField_2.setText(c.toString());
			}
		});
		btnNewButton.setBounds(140, 76, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("相减");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				Double c = Double.valueOf(s1) - Double.valueOf(s2);
				textField_2.setText(c.toString());
			}
		});
		btnNewButton_1.setBounds(140, 140, 113, 27);
		contentPane.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(301, 108, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
