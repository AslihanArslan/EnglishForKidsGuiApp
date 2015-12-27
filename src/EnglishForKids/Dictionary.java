package EnglishForKids;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Dictionary {

	private JFrame frame;
	ImageIcon icon = createImageIcon("img/connection.jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dictionary window = new Dictionary();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static ImageIcon createImageIcon(String path) {
		
		
		// TODO Auto-generated method stub
		java.net.URL imgURL = Dictionary.class.getResource(path );
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
	}

	/**
	 * Create the application.
	 */
	public Dictionary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JOptionPane.showMessageDialog(frame,
			    "Dictionary requires Internet Connection !!!",
			    "Message",
			    JOptionPane.INFORMATION_MESSAGE,
			    icon);
			try{
			
			String myURL ="http://tureng.com/" ;
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(myURL)); }
			catch(Exception e){
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
		

	}
}
