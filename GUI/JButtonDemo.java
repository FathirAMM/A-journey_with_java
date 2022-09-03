import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo {
	
	 
	

	public static void main(String[] args) {
		JFrame frame=new JFrame("Button demo");

		JButton btn=new JButton("Click me");//create button
		btn.setPreferredSize(new Dimension(100,30));
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Hi Iam Button");
			}//message box
			
		});
		
		
		frame.add(btn);//add button in window
		
		//not mandatory to create object
		frame.setSize(400,500);
		frame.setBounds(350,50,700,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}

}
