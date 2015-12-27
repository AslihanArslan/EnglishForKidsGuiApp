package EnglishForKids;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class EnglishForKids {

	JFrame frame;
	
	private ImageIcon image1 ;

	private Color buttonColor;
	JDialog myJDialog ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnglishForKids window = new EnglishForKids();// býraktýgýn yerde acma kodu: null sonradan yazýldý.
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
	public EnglishForKids() { // býraktýgýn yerde acma kodu: parametre girdik:JFrame parent
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	private void initialize() {
		frame = new JFrame("English For Kids");
		
		frame.setBounds(100, 100, 500, 400); // býraktýgýn yerde acma kodu x ve y parametresi girildi
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("img/icon.jpg");
		frame.setIconImage(img.getImage());
	
		
//		BackgroundPanel bp= new BackgroundPanel(null);
//		bp.add(panel);
//		frame.add(bp);
//		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.getSize();
		
		
	
		
//		image1 = new ImageIcon("C://Users/Uður/workspace/Kaynakça-Hazýrlama.jpg");
//		panel.add(image1) ;
			
		final JButton btnGames = new JButton("GAMES");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Game game = new Game();
				game.setVisible(true);
			}
		});
		btnGames.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
				
			}
		});
		btnGames.setBounds(10, 142, 153, 46);
		btnGames.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnGames);
		
		final JButton btnUnits = new JButton("UNITS");
		btnUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Units unit = new Units();
				unit.setVisible(true);
				
			}
		});
		btnUnits.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
			}
		});
		btnUnits.setBounds(44, 46, 153, 46);
		btnUnits.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnUnits);
		
		
		final JButton btnReading = new JButton("READING");
		btnReading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Reading read = new Reading();
				read.setVisible(true);
			}
		});
		btnReading.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);			
				}
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
			
			}
		
		});
		btnReading.setBounds(273, 46, 153, 46);
		btnReading.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnReading);
		
		final JButton btnTests = new JButton("TESTS");
		btnTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Tests test = new Tests();
				test.setVisible(true);
			}
			//private void close() {
				// TODO Auto-generated method stub
			//}
		});
		btnTests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
			}
		});
		
		btnTests.setBounds(304, 142, 153, 46);
		btnTests.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnTests);
		
		final JButton btnDictionary = new JButton("DICTIONARY");
		btnDictionary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);
			}
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
			}
		});
		btnDictionary.setBounds(266, 250, 160, 46);
		btnDictionary.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			
				final JPanel panel = new JPanel();

				JOptionPane.showMessageDialog(panel, "Dictionary requires Internet Connection !!! ", "Message", JOptionPane.INFORMATION_MESSAGE);
				
				   try{
					
					String myURL ="http://tureng.com/" ;
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myURL)); }
					catch(Exception e){
						JOptionPane.showMessageDialog(null,e.getMessage());
					}
				
			}

			
		});
	
		btnDictionary.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnDictionary);
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\Kaynak\u00E7a-Haz\u0131rlama.jpg"));
		arkaplan.setBounds(0, 0, 484, 362);
		arkaplan.getSize();
		panel.add(arkaplan);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonColor = e.getComponent().getBackground();
				e.getComponent().setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(buttonColor);
			}
		});
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Help help = new Help();
				help.setVisible(true);
			}
			private void close() {
				// TODO Auto-generated method stub
			}
			
		});
		
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHelp.setBounds(44, 250, 160, 46);
		arkaplan.add(btnHelp);
		
		
		
		
		
		
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}


