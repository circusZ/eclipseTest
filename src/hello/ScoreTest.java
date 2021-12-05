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
import javax.swing.JLabel;

public class ScoreTest extends JFrame {

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
					ScoreTest frame = new ScoreTest();
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
	public ScoreTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(38, 100, 86, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(287, 100, 86, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("转换");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText().toString();
				double t = Double.valueOf(s1);
				String answer;
				if(t>100){
					answer = "输入有误";
				}else if(t>=90 && t <= 100){
					answer = "5";
				}else if(t>=75 && t<90){
					answer = "4";
				}else if(t>=60 && t<75){
					answer = "3";
				}else if(t>=40 && t<60){
					answer = "2";
				}else {
					answer = "1";
				}
				textField_1.setText(answer);
			}
		});
		button.setBounds(154, 107, 113, 27);
		contentPane.add(button);
		
		JLabel label = new JLabel("请输入分数：");
		label.setBounds(14, 69, 98, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("转换结果：");
		label_1.setBounds(267, 69, 106, 18);
		contentPane.add(label_1);
	}
}
