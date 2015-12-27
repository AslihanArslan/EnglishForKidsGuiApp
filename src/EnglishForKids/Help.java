package EnglishForKids;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class Help {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
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
	public Help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.getContentPane().setBackground(new Color(199, 21, 133));
		frame.setBounds(100, 100, 450, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("img/icon.jpg");
		frame.setIconImage(img.getImage());
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 204, 255));
		frame.setJMenuBar(menuBar);
		
		JMenu mnHomepage = new JMenu("Homepage");
		mnHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				EnglishForKids eng = new EnglishForKids();
				eng.setVisible(true);
			}
		});
		menuBar.add(mnHomepage);
		
		JMenu mnUnits = new JMenu("Units");
		mnUnits.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Units unit= new Units();
				unit.setVisible(true);
			}
		});
		menuBar.add(mnUnits);
		
		JMenu mnReading = new JMenu("Reading");
		mnReading.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Reading read= new Reading();
				read.setVisible(true);
			}
		});
		
		menuBar.add(mnReading);
		
		JMenu mnGame = new JMenu("Game");
		mnGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Game game= new Game();
				game.setVisible(true);
			
			}
		});
		
		menuBar.add(mnGame);
		
		JMenu mnTests = new JMenu("Tests");
		mnTests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Tests test=new Tests();
				test.setVisible(true);
			}
		});
		menuBar.add(mnTests);
		
		JMenu mnDictionary = new JMenu("Dictionary");
		mnDictionary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final JPanel panel = new JPanel();

				JOptionPane.showMessageDialog(panel, "Dictionary requires Internet Connection !!! ", "Message", JOptionPane.INFORMATION_MESSAGE);
				
				   try{
					
					String myURL ="http://tureng.com/" ;
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myURL)); }
					catch(Exception arg0){
						JOptionPane.showMessageDialog(null,arg0.getMessage());
					}
			}
		});
		menuBar.add(mnDictionary);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(199, 21, 133));
		panel.setBounds(0, 0, 434, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JTextPane txtpnHelpthisApplication = new JTextPane();
		txtpnHelpthisApplication.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnHelpthisApplication.setEditable(false);
		txtpnHelpthisApplication.setBackground(Color.PINK);
		txtpnHelpthisApplication.setText("HELP?\r\n1.Introduction refers the start frame, you can choose 2 options first one is start the other one is about.\r\n2.About refers to version of app and developers names.\r\n3.If you want use the app click to start.\r\n4.English For Kids page refers to parts of app.\r\n5.In the units you can read the chapter, grammers.\r\n6.In the reading page there are stories and you can select the stories what you want.\r\n7.In the test you can test yourself.You can see falses, trues and also old scores.\r\n8.In the game you can play the games.Choose the one of them and enjoy :)\r\n9.In the dictionary you can connect the www.tureng.com.");
		txtpnHelpthisApplication.setBounds(10, 21, 414, 243);
		panel.add(txtpnHelpthisApplication);
		
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//frame.setVisible(false);
				//Help help= new Help();
				//help.setVisible(true);
			}
		});
		mnHelp.setOpaque(true);
		mnHelp.setBackground(Color.GREEN);
		menuBar.add(mnHelp);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				About about=new About();
				about.setVisible(true);
			}
		});
		menuBar.add(mnAbout);
	}
	
	

	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
	
	public void setVisible1(boolean v) {
		frame.setVisible(v);
		
	} 
}
