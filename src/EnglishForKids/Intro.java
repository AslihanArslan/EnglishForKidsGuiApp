package EnglishForKids;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro{
	
	

	private JFrame frame;


	/* Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
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
	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 66, 0, 0, 0, 0, 0, 0, 0, 156, 0, 0, 41, 0};
		gridBagLayout.rowHeights = new int[]{0, 15, 0, 0, 0, 31, 0, 0, 52, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		ImageIcon img = new ImageIcon("img/icon.jpg");
		frame.setIconImage(img.getImage());
		
		JLabel lblLearn = new JLabel("");
		lblLearn.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\learn.jpg"));
		GridBagConstraints gbc_lblLearn = new GridBagConstraints();
		gbc_lblLearn.gridwidth = 7;
		gbc_lblLearn.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLearn.gridheight = 8;
		gbc_lblLearn.insets = new Insets(0, 0, 0, 5);
		gbc_lblLearn.gridx = 1;
		gbc_lblLearn.gridy = 2;
		frame.getContentPane().add(lblLearn, gbc_lblLearn);
		
		JLabel lblCh = new JLabel("");
		lblCh.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\child.jpg"));
		GridBagConstraints gbc_lblCh = new GridBagConstraints();
		gbc_lblCh.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCh.anchor = GridBagConstraints.NORTH;
		gbc_lblCh.gridheight = 7;
		gbc_lblCh.insets = new Insets(0, 0, 5, 5);
		gbc_lblCh.gridx = 10;
		gbc_lblCh.gridy = 1;
		frame.getContentPane().add(lblCh, gbc_lblCh);
		
		JLabel lblStart = new JLabel("");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				EnglishForKids eng = new EnglishForKids(); // býraktýgýn yerde acma kodu:frame yazdýk
				eng.setVisible(true);
			}
		});
		lblStart.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\e.jpg"));
		GridBagConstraints gbc_lblStart = new GridBagConstraints();
		gbc_lblStart.anchor = GridBagConstraints.SOUTH;
		gbc_lblStart.insets = new Insets(0, 0, 5, 5);
		gbc_lblStart.gridx = 10;
		gbc_lblStart.gridy = 8;
		frame.getContentPane().add(lblStart, gbc_lblStart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				About about =new About(); // býraktýgýn yerde acma kodu:frame yazdýk
				about.setVisible(true);
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\About.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 11;
		gbc_lblNewLabel.gridy = 8;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		
		
	}
}
