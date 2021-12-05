package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class FileTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileTest frame = new FileTest();
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
	public FileTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(44, 42, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 42, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(309, 42, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(44, 110, 86, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(174, 110, 86, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("data1");
		lblNewLabel.setBounds(47, 13, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("data2");
		lblNewLabel_1.setBounds(174, 13, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("data3");
		lblNewLabel_2.setBounds(310, 11, 72, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("data4");
		lblNewLabel_3.setBounds(44, 79, 72, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("data5");
		lblNewLabel_4.setBounds(174, 79, 72, 18);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(44, 182, 169, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFilepath = new JLabel("filepath");
		lblFilepath.setBounds(44, 151, 72, 18);
		contentPane.add(lblFilepath);
		
		JButton button = new JButton("保存");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = textField.getText().toString();
				String s2 = textField_1.getText().toString();
				String s3 = textField_2.getText().toString();
				String s4 = textField_3.getText().toString();
				String s5 = textField_4.getText().toString();
				
				String filepath = textField_5.getText().toString();
				
				double data[] = new double[5];
				data[0] = Double.parseDouble(s1);
				data[1] = Double.parseDouble(s2);
				data[2] = Double.parseDouble(s3);
				data[3] = Double.parseDouble(s4);
				data[4] = Double.parseDouble(s5);
				
				try{
					File outFile = new File("E:" + File.separator + filepath);
					FileOutputStream fos = new FileOutputStream(outFile);
					OutputStreamWriter fw = new OutputStreamWriter(fos);
					BufferedWriter bfw = new BufferedWriter(fw);
					String str="";
					for(int i=0;i<5;i++){
						str += data[i];
						str += " ";
					}
					bfw.write(str);
					
					bfw.close();
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		button.setBounds(292, 147, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("排序");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath = textField_5.getText().toString();
				try{
					
					File inFile = new File("E:" + File.separator + filepath);
					FileInputStream fis = new FileInputStream(inFile);
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader br = new BufferedReader(isr);
					String data = br.readLine();
					Double nums[]=new Double[5];
					String[] strs = data.split(" ");
					for (int i = 0; i < strs.length; i++) {
						nums[i] = new Double(strs[i]);
					}
					
					for(int i = 0;i<4;i++){
						for(int j = 0;j<4;j++){
							if(nums[j] < nums[j+1]){
								double temp = nums[j];
								nums[j] = nums[j+1];
								nums[j+1] = temp;
							}
						}
					}
					
					for(int i=0;i<5;i++){
						System.out.println(nums[i]);
					}
					
					File outFile1 = new File("E:" + File.separator + filepath);
					
					BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile1,true)));
					String str1="";
					for(int i=0;i<5;i++){
						str1 += nums[i];
						str1 += " ";
					}
					bfw.write(str1);
					
					fis.close();
					bfw.close();
					
				}catch(Exception e1){
					System.out.println(e1);
				}
			}	
		});
		button_1.setBounds(292, 198, 113, 27);
		contentPane.add(button_1);
	}
}
