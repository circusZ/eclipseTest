package ExceptionTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogTest01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogTest01 frame = new LogTest01();
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
	public LogTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(134, 55, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("用户名");
		lblNewLabel.setBounds(48, 58, 72, 18);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 117, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("密码");
		lblNewLabel_1.setBounds(48, 120, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("请根据提示操作");
		label.setBounds(235, 178, 183, 34);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("提交");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = textField_1.getText().toString();
				VerPass verPass = new VerPass();
				try{
					verPass.verRes(password);
					label.setText("提交成功");
				}catch (MyException me){
					me.printStackTrace();
					label.setText("密码格式错误");
				}
				
			}
		});
		btnNewButton.setBounds(75, 182, 113, 27);
		contentPane.add(btnNewButton);
		
		
		
		JLabel label_1 = new JLabel("密码由4-6位数字组成");
		label_1.setBounds(235, 120, 151, 18);
		contentPane.add(label_1);
	}
}
