import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.ComponentOrientation;
import java.awt.CardLayout;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;

public class DBMS_frontend {

	private JFrame frmShoppingWebsite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBMS_frontend window = new DBMS_frontend();
					window.frmShoppingWebsite.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DBMS_frontend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShoppingWebsite = new JFrame();
		frmShoppingWebsite.setSize(800,800);
		frmShoppingWebsite.getContentPane().setBackground(Color.DARK_GRAY);
		frmShoppingWebsite.getContentPane().setLayout(new CardLayout(0, 0));
		
		Panel panel = new Panel();
		panel.setSize(new Dimension(900, 900));
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		frmShoppingWebsite.getContentPane().add(panel, "name_133512120733500");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon img=new ImageIcon(this.getClass().getResource("shoppinglogo.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(10, 0, 1003, 600);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Customer Login");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placeorderbuttonclick p=new placeorderbuttonclick();
				p.NW();
				//Customerbuttonclick nw=new Customerbuttonclick();
				//nw.NewScreen();
			}
		});
		lblNewLabel.add(btnNewButton_1);
		btnNewButton_1.setSize(new Dimension(500, 200));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setBounds(288, 151, 509, 172);
		
		JButton btnNewButton_1_1 = new JButton("Admin Login");
		btnNewButton_1_1.setFocusable(false);
		lblNewLabel.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminbuttonclick nw2=new Adminbuttonclick();
				nw2.NewScreen2();
			}
		});
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1_1.setBounds(294, 354, 504, 179);
		frmShoppingWebsite.setBackground(Color.BLACK);
		frmShoppingWebsite.setTitle("Shopping Website");
		frmShoppingWebsite.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frmShoppingWebsite.setBounds(100, 100, 1246, 648);
		frmShoppingWebsite.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
