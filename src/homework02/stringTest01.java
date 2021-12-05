package homework02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stringTest01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stringTest01 frame = new stringTest01();
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
	public stringTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("原字符串：");
		label.setBounds(59, 32, 86, 18);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(59, 56, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 147, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("删除字符：");
		label_1.setBounds(59, 120, 86, 18);
		contentPane.add(label_1);
		
		JButton button = new JButton("删除1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				String s3="";
				
				if(s2.length() != 1){
					textField_2.setText("输入有误！");
				}else{
					char c2 = s2.charAt(0);
					for(char item : s1.toCharArray()) {
						if(item != c2){
							s3 += item;
						}
					}
					textField_2.setText(s3);
				}
				
			}
		});
		button.setBounds(159, 44, 113, 27);
		contentPane.add(button);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 117, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("结果：");
		label_2.setBounds(310, 85, 72, 18);
		contentPane.add(label_2);
		
		btnNewButton = new JButton("删除2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				StringBuffer sb1 = new StringBuffer(s1);
				if(s2.length() != 1){
					textField_2.setText("输入有误！");
				}else{
					while(sb1.indexOf(s2) != -1){
					sb1.deleteCharAt(sb1.indexOf(s2));
					}
				}
				textField_2.setText(sb1.toString());
				
			}
		});
		btnNewButton.setBounds(159, 92, 113, 27);
		contentPane.add(btnNewButton);
		
		button_1 = new JButton("删除3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				StringBuffer sb1 = new StringBuffer("");
				if(s2.length() != 1){
					textField_2.setText("输入有误！");
				}else{
					char c2 = s2.charAt(0);
					for ( char item : s1.toCharArray()) {
						if(item != c2 ){
							sb1.append(item);
						}
					}
				}
				textField_2.setText(sb1.toString());
			}
		});
		button_1.setBounds(159, 146, 113, 27);
		contentPane.add(button_1);
	}
}
