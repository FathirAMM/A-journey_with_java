package BMI_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BMITable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMITable frame = new BMITable();
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
	public BMITable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 446);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 56, 334, 108);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.YELLOW);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Normal weight", "19 - 24.9"},
				{"Over weight", "25 - 29.9"},
				{"Obesity level 1", "30 - 34.9"},
				{"Obesity level 2", "35 - 39.9"},
				{"Obesity level 3", "19 - 24.9"},
			},
			new String[] {
				"New column", "Categories"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel = new JLabel("BMI CATEGORIES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(68, 11, 276, 29);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(39, 225, 334, 124);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBackground(Color.YELLOW);
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"19-24", "19-24"},
				{"25-34", "20-25"},
				{"35-44", "21-26"},
				{"45-54", "22-27"},
				{"55-64", "23-28"},
				{"Above 64", "24-29"},
			},
			new String[] {
				"AGE", "BMI"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblAgeBmiTable = new JLabel("AGE BMI TABLE");
		lblAgeBmiTable.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAgeBmiTable.setBounds(96, 189, 248, 29);
		contentPane.add(lblAgeBmiTable);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(144, 360, 123, 36);
		contentPane.add(btnNewButton);
		table.getColumnModel().getColumn(0).setPreferredWidth(109);
		table.getColumnModel().getColumn(1).setPreferredWidth(133);
	}
}
