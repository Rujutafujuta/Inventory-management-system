import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class orderNowbuttonClick {

	private JFrame frmProductsAvailable;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void click() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderNowbuttonClick window = new orderNowbuttonClick();
					window.frmProductsAvailable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public orderNowbuttonClick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProductsAvailable = new JFrame();
		frmProductsAvailable.setTitle("PRODUCTS AVAILABLE");
		frmProductsAvailable.setType(Type.POPUP);
		frmProductsAvailable.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frmProductsAvailable.setBounds(100, 100, 815, 672);
		frmProductsAvailable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProductsAvailable.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(-16, 0, 868, 689);
		frmProductsAvailable.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\whiteTankTop.png"));
		lblNewLabel.setBounds(45, -31, 161, 268);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\tanktopBlack.png"));
		lblNewLabel_1.setBounds(266, -6, 193, 253);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\redtanktop.png"));
		lblNewLabel_2.setBounds(565, -6, 223, 235);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\greenLeggings.png"));
		lblNewLabel_3.setBounds(20, 261, 223, 311);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Green Leggings");
		lblNewLabel_4.setForeground(new Color(224, 255, 255));
		lblNewLabel_4.setBackground(new Color(224, 255, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_4.setBounds(30, 554, 186, 33);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("White Tank Top");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(224, 255, 255));
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_5.setBackground(new Color(224, 255, 255));
		lblNewLabel_5.setBounds(20, 237, 193, 33);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Black Tank Top");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(224, 255, 255));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_6.setBackground(new Color(224, 255, 255));
		lblNewLabel_6.setBounds(260, 234, 243, 38);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Red Tank Top");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(224, 255, 255));
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_7.setBackground(new Color(224, 255, 255));
		lblNewLabel_7.setBounds(565, 237, 223, 33);
		panel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\lilac_camisole.png"));
		lblNewLabel_8.setBounds(276, 258, 212, 311);
		panel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Lilac Camisole");
		lblNewLabel_9.setForeground(new Color(224, 255, 255));
		lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(272, 554, 216, 33);
		panel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\graphicctee.png"));
		lblNewLabel_10.setBounds(592, 281, 223, 262);
		panel.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Graphic Tee");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(new Color(224, 255, 255));
		lblNewLabel_11.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNewLabel_11.setBounds(580, 554, 217, 33);
		panel.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Thank-you for visiting!");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				//placeorderbuttonclick n=new placeorderbuttonclick();
				//n.NW();
			
			}
		});
		btnNewButton.setForeground(new Color(32, 178, 170));
		btnNewButton.setBackground(new Color(255, 235, 205));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(226, 583, 316, 49);
		panel.add(btnNewButton);
		
		
		
		
	}
}
