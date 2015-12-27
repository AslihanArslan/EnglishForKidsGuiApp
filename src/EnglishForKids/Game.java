package EnglishForKids;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.setBounds(50, 25, 483, 411);
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
			
			}
		});
		mnGame.setOpaque(true);
		mnGame.setBackground(Color.GREEN);
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
		JMenu mnHelp = new JMenu("Help");
		mnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Help help= new Help();
				help.setVisible(true);
			}
		});
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
		frame.getContentPane().setLayout(null);
		
		JButton btnFindNumbers = new JButton("FIND NUMBERS");
		btnFindNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FindNumbers fnd = new FindNumbers();
				fnd.setVisible(true);
			}
		});
		btnFindNumbers.setBackground(new Color(0, 255, 255));
		btnFindNumbers.setBounds(268, 122, 200, 50);
		frame.getContentPane().add(btnFindNumbers);
		
		JButton btnFindColors = new JButton("FIND COLORS");
		btnFindColors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FindColors fnd = new FindColors();
				fnd.setVisible(true);
			}
		});
		btnFindColors.setBackground(new Color(221, 160, 221));
		btnFindColors.setBounds(20, 122, 200, 50);
		frame.getContentPane().add(btnFindColors);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Game.class.getResource("/img/oyun.jpg")));
		lblNewLabel.setBounds(0, 0, 468, 355);
		
		JButton btnHangman = new JButton(" HANGMAN ");
		btnHangman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel hangman = new Hangman();
				JOptionPane.showMessageDialog(null, hangman, "HANGMAN", JOptionPane.QUESTION_MESSAGE);
			
			}
		});
		btnHangman.setForeground(new Color(0, 0, 0));
		lblNewLabel.add(btnHangman);
		frame.getContentPane().add(lblNewLabel);
		btnHangman.setBackground(new Color(255, 69, 0));
		btnHangman.setBounds(135, 291, 200, 50);
	}
	


	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}
