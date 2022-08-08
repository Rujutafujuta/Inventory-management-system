import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class Adminbuttonclick {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminbuttonclick window = new Adminbuttonclick();
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
	public Adminbuttonclick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frame.setBounds(100, 100, 806, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(188, 143, 143));
		panel.setBounds(10, 11, 772, 441);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Insert new Material into Warehouse");
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(10, 34, 752, 70);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderdetailsbuttonClick odb=new orderdetailsbuttonClick();
				odb.od();
				
				
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnAddANew = new JButton("Add a new Company");
		btnAddANew.setFocusable(false);
		btnAddANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addcompanybuttonclick ac=new addcompanybuttonclick();
				ac.company();
			}
		});
		btnAddANew.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnAddANew.setBounds(10, 302, 752, 77);
		panel.add(btnAddANew);
	}
}
