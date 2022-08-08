import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class orderdetailsbuttonClick {

	private JFrame frame;
	private JTextField pid;
	private JTextField productcolour;
	private JTextField productsize;
	private JTextField reorderlevel;
	private JTextField currentquantity;
	private JTextField productname;
	private JTextField companyID;
	private JTextField price;
	private JTextField reorderquantity;

	/**
	 * Launch the application.
	 */
	public static void od() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderdetailsbuttonClick window = new orderdetailsbuttonClick();
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
	public orderdetailsbuttonClick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frame.setBounds(100, 100, 1043, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter PID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(28, 11, 152, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		pid = new JTextField();
		pid.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		pid.setBounds(289, 13, 651, 36);
		frame.getContentPane().add(pid);
		pid.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Product Colour");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(38, 58, 171, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Product Size");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(38, 119, 171, 36);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Reorder Level");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(38, 166, 171, 36);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Enter Current Quantity");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(31, 229, 198, 36);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Enter Product Name");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(38, 293, 169, 36);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Enter Company ID");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(55, 358, 152, 36);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Enter Price");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_7.setBounds(57, 417, 152, 36);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Enter Reorder Quantity");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_8.setBounds(38, 464, 204, 36);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		productcolour = new JTextField();
		productcolour.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		productcolour.setColumns(10);
		productcolour.setBounds(289, 60, 651, 36);
		frame.getContentPane().add(productcolour);
		
		productsize = new JTextField();
		productsize.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		productsize.setColumns(10);
		productsize.setBounds(289, 121, 651, 36);
		frame.getContentPane().add(productsize);
		
		reorderlevel = new JTextField();
		reorderlevel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		reorderlevel.setColumns(10);
		reorderlevel.setBounds(289, 178, 651, 36);
		frame.getContentPane().add(reorderlevel);
		
		currentquantity = new JTextField();
		currentquantity.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		currentquantity.setColumns(10);
		currentquantity.setBounds(289, 231, 651, 36);
		frame.getContentPane().add(currentquantity);
		
		productname = new JTextField();
		productname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		productname.setColumns(10);
		productname.setBounds(289, 295, 651, 36);
		frame.getContentPane().add(productname);
		
		companyID = new JTextField();
		companyID.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		companyID.setColumns(10);
		companyID.setBounds(289, 360, 651, 36);
		frame.getContentPane().add(companyID);
		
		price = new JTextField();
		price.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		price.setColumns(10);
		price.setBounds(289, 419, 651, 36);
		frame.getContentPane().add(price);
		
		reorderquantity = new JTextField();
		reorderquantity.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		reorderquantity.setColumns(10);
		reorderquantity.setBounds(289, 483, 651, 36);
		frame.getContentPane().add(reorderquantity);
		
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ppid=Integer.parseInt(pid.getText());
				String pc=productcolour.getText();
				String ps=productsize.getText();
				int rl=Integer.parseInt(reorderlevel.getText());
				int cq=Integer.parseInt(currentquantity.getText());
				String pn=productname.getText();
				int cid=Integer.parseInt(companyID.getText());
				int p=Integer.parseInt(price.getText());
				int rq=Integer.parseInt(reorderquantity.getText());
				
				Connection conn=null;
				 try{
					 conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmsproject","root","123456");//establishes the connection
				
					 String query = "insert into warehouse values(' "+ppid+" ',' "+pc+" ',' "+ps+" ',' "+rl+" ',' "+cq+" ',' "+pn+" ',' "+cid+"','"+p+"','"+rq+" ')";
                     Statement sta=conn.createStatement();
                     sta.executeUpdate(query);
					 
					 
					 
				 }catch(Exception e1){System.out.println(e1);}
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 30));
		btnNewButton.setBounds(365, 537, 231, 37);
		frame.getContentPane().add(btnNewButton);
	}
}
