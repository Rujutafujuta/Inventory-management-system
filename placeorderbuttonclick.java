import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.*;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
public class placeorderbuttonclick {

	private JFrame frame;
	private JTextField  uID;
	private JTextField cname;
	private JTextField addresss;
	private JTextField phnoo;

	/**
	 * Launch the application.
	 */
	public static void NW() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					placeorderbuttonclick window = new placeorderbuttonclick();
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
	public placeorderbuttonclick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frame.setBounds(100, 100, 724, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 103, 231, 102);
		frame.getContentPane().add(lblNewLabel);
		
		uID = new JTextField();
		uID.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		uID.setBounds(264, 127, 424, 61);
		frame.getContentPane().add(uID);
		uID.setColumns(10);
		
		JLabel lblcustName = new JLabel("CUSTOMER  NAME");
		lblcustName.setHorizontalAlignment(SwingConstants.CENTER);
		lblcustName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblcustName.setBounds(10, 405, 219, 97);
		frame.getContentPane().add(lblcustName);
		
		cname = new JTextField();
		cname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		cname.setColumns(10);
		cname.setBounds(264, 426, 424, 61);
		frame.getContentPane().add(cname);
		
		JButton sn = new JButton("SIGN IN");
		 sn .setFocusable(false);
		sn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderNowbuttonClick o=new orderNowbuttonClick();
				o.click();
				//System.out.println("HELLO");
				  int id=Integer.parseInt(uID.getText());
			       String addr=addresss.getText();
			       int pno=Integer.parseInt(phnoo.getText());
			       // ap.id=this.id;
			        //System.out.println(id);
			        //temp=id;
			       //  System.out.println(temp);
			        String cn=cname.getText();
			       
			       
			        Connection conn=null;
			        //Statement st=null;
			        //ResultSet rs=null;
			        //final String DB_URL ="jdbc:mysql://localhost/dbmsproject";
			    	// final String USER="root";
			    	// final String PASS="123456";
			        //String query1;
			       
			       
			         //if(sn.isSelected())
			         {//options for owner to be displayed
			            try{
			                //Class.forName("com.mysql.jdbc.Driver");//loads the Driver
			                conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmsproject","root","123456");//establishes the connection
			                //st = conn.createStatement();//creates a statement that will be executed
			                String query = "insert into customer values(' "+id+" ',' "+addr+" ',' "+pno+" ',' "+cn+" ' )";
                             Statement sta=conn.createStatement();
                             sta.executeUpdate(query);
							//PreparedStatement prep_stmt1;
							//prep_stmt1=conn.prepareStatement(query);
							//prep_stmt1.setInt(1,id);
							
							//prep_stmt1.setString(2,addr);
							//prep_stmt1.setLong(3,pno);
							//prep_stmt1.setString(4,cn);
							//prep_stmt1.execute();
			                //query1="insert into customer values(id,addr,pnno,cn);";
			                /*rs=st.executeQuery(qu);
			                if(rs.next()){
			                    //new OptionsForOwner().setVisible(true);
			                }
			                else{
			                    //JOptionPane.showMessageDialog(this,"No such entry found....try again!!");
			                    uID.setText("");
			                    cname.setText("");
			                   
			                }*/
			               
			            }catch(Exception e1){System.out.println(e1);}
			           
			        }
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*Statement stmt = null;
				String JDBC_DRIVER="com.mysql.jdbc.Driver";
				 final String DB_URL ="jdbc:mysql://localhost/dbmsproject";
				 final String USER="root";
				 final String PASS="123456";
				 Main m=new Main();
				 m.insert();
				 */
				//Connection conn = null;
			    
               /* String producname = Pname.getText();
                String prosize = productsize.getText();
                String procolour = productcolour.getText();
                String quantity = Quantity.getText();
			    int len1= quantity.length();
			    //String compname = Companyname.getText();
                int userid = Integer.parseInt(uID.getText());
                Scanner sc=new Scanner(System.in);
                String compname=sc.next(Companyname.getText());*/
				try {
				   /*conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmsproject","root","123456");
					CallableStatement query= conn.prepareCall("{call customerss_orderss(?,?,?,?,?,?,?,?)}");
	                //Statement sta=conn.createStatement();
					//sta.executeUpdate(query);
				query.setString(1," " +userid+" ");
					query.setString(2," " +producname+" ");
					query.setString(3," " +prosize+" ");
					query.setString(4," " +procolour+" ");
					query.setString(5," " +quantity+" ");
					query.setString(6," " +compname+" ");
					query.registerOutParameter(7,Types.INTEGER);
					query.registerOutParameter(8,Types.INTEGER);
					query.execute();
					int pid=query.getInt(7);
					int CompanyID=query.getInt(8);
					System.out.println(CompanyID);
					System.out.println(pid);
					conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmsproject","root","123456");
					CallableStatement query= conn.prepareCall(" {call getcompid(?,?)} ");
					 
					query.setString(1,compname);
					
					query.registerOutParameter(2,Types.INTEGER);
					query.execute();
					int compid=query.getInt(2);
					//System.out.println(compname);
				   //uID.setText(query.getInt(2));
				    System.out.println(compid);
					//System.out.println(CompanyID);*/
                    //conn.close();
                    
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
				finally {
					
				}
			}
		});
		sn.setFont(new Font("Times New Roman", Font.BOLD, 23));
		sn.setBounds(205, 502, 277, 49);
		frame.getContentPane().add(sn);
		
		JLabel address = new JLabel("");
		address.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		address.setBounds(10, 0, 690, 609);
		frame.getContentPane().add(address);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME CUSTOMER!");
		lblNewLabel_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(31, 23, 649, 102);
		frame.getContentPane().add(lblNewLabel_2);
		
		addresss = new JTextField();
		addresss.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		addresss.setColumns(10);
		addresss.setBounds(264, 228, 424, 61);
		frame.getContentPane().add(addresss);
		
		phnoo = new JTextField();
		phnoo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		phnoo.setColumns(10);
		phnoo.setBounds(264, 327, 424, 61);
		frame.getContentPane().add(phnoo);
		
		JLabel phno = new JLabel("PHONE NUMBER");
		phno.setHorizontalAlignment(SwingConstants.CENTER);
		phno.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		phno.setBounds(31, 314, 219, 97);
		frame.getContentPane().add(phno);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblAddress.setBounds(20, 216, 219, 97);
		frame.getContentPane().add(lblAddress);
	}
}
