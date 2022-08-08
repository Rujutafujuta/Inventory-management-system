import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addcompanybuttonclick {

	private JFrame frame;
	private JTextField coid;
	private JTextField coname;

	/**
	 * Launch the application.
	 */
	public static void company() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addcompanybuttonclick window = new addcompanybuttonclick();
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
	public addcompanybuttonclick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 904, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(244, 164, 96));
		lblNewLabel.setBackground(new Color(244, 164, 96));
		lblNewLabel.setBounds(10, 11, 870, 486);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel compid = new JLabel("Enter Company ID");
		compid.setFont(new Font("Times New Roman", Font.BOLD, 25));
		compid.setBounds(61, 81, 216, 48);
		frame.getContentPane().add(compid);
		
		JLabel compname = new JLabel("Enter Company Name");
		compname.setFont(new Font("Times New Roman", Font.BOLD, 25));
		compname.setBounds(61, 218, 241, 48);
		frame.getContentPane().add(compname);
		
		coid = new JTextField();
		coid.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		coid.setBounds(319, 81, 507, 61);
		frame.getContentPane().add(coid);
		coid.setColumns(10);
		
		coname = new JTextField();
		coname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		coname.setBounds(319, 206, 507, 60);
		frame.getContentPane().add(coname);
		coname.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD Company");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cid=Integer.parseInt(coid.getText());
			       String comname=coname.getText();
				
			       Connection conn=null;
			       try {
					conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmsproject","root","123456");
					
					String query = "insert into company values(' "+cid+" ',' "+comname+" ' )";
                    Statement sta=conn.createStatement();
                    sta.executeUpdate(query);
					
					
					
					
					
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}//establishes the connection
				
				
				
				
			}
			});
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 30));
		btnNewButton.setBounds(257, 374, 398, 48);
		frame.getContentPane().add(btnNewButton);
	}

}
