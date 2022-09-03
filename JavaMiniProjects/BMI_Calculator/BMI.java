package BMI_Calculator;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Body Mass Index (BMI)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(39, 11, 406, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Height in meters :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 97, 238, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Your Weight in kg :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(50, 151, 203, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Your BMI is :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(50, 203, 111, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		text1 = new JTextField();
		text1.setBounds(308, 102, 111, 21);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(308, 156, 111, 20);
		contentPane.add(text2);
		
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(308, 208, 111, 20);
		contentPane.add(text3);
		
		JButton button1 = new JButton("Calculate");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double height=Double.parseDouble(text1.getText());
				double weight=Double.parseDouble(text2.getText());
				double BMI=weight/(height*height);
				String calbmi=String.format("%.2f",BMI);
				text3.setText(calbmi);
				
				
				if (BMI<=24.9) {
					text3.setOpaque(true);
					text3.setBackground(Color.green);
					text3.setForeground(Color.black);
				}
				else if(BMI<=29.9){
					text3.setOpaque(true);
					text3.setBackground(Color.blue);
					text3.setForeground(Color.white);
				}
				else if(BMI<=34.9){
					text3.setOpaque(true);
					text3.setBackground(Color.yellow);
					text3.setForeground(Color.black);
				}
				else if(BMI<=39.9){
					text3.setOpaque(true);
					text3.setBackground(Color.cyan);
					text3.setForeground(Color.blue);
				}
				else if(BMI>39.9){
					text3.setOpaque(true);
					text3.setBackground(Color.red);
					text3.setForeground(Color.black);
				}
			}
		});
		button1.setBounds(39, 252, 89, 23);
		contentPane.add(button1);
		
		
		
		JButton button2 = new JButton("Reset");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				
				//I added
				text3.setOpaque(true);
				text3.setBackground(Color.white);
				text3.setForeground(Color.white);
			}
		});
		button2.setBounds(149, 252, 89, 23);
		contentPane.add(button2);
		
		JButton button4 = new JButton("Exit");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button4.setBounds(379, 252, 89, 23);
		contentPane.add(button4);
		
		JButton button3 = new JButton("BMI Table");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BMITable().setVisible(true);
				
			}
		});
		button3.setBounds(263, 252, 89, 23);
		contentPane.add(button3);
	}
}
