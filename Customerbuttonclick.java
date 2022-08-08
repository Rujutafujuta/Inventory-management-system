import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class Customerbuttonclick {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen( ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customerbuttonclick window = new Customerbuttonclick();
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
	public Customerbuttonclick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\OneDrive\\Desktop\\DBMS PROJECT\\java_logo.jpg"));
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 11, 659, 418);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Click here to see our Collection!");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Artifakt Element Book", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderNowbuttonClick oc=new orderNowbuttonClick();
				oc.click();
						
			}
		});
		panel.add(btnNewButton);
		frame.setBounds(100, 100, 693, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
