package EnglishForKids;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class FindColors extends JPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JList list;
	private BufferedImage image;
	private JTextField textField_8;
	private JTextField textField_9;

	ImageIcon img = new ImageIcon("img/tick.jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FindColors window = new FindColors();
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
	public FindColors() {
		
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img/icon.jpg"));
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setBounds(50, 25, 716, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		 try {                
	          image = ImageIO.read(new File("img/colors_2.jpg"));
	       } catch (IOException ex) {
	            // handle exception...
	       }

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
				Units unit = new Units();
				unit.setVisible(true);
			}
		});
		menuBar.add(mnUnits);

		JMenu mnReading = new JMenu("Reading");
		mnReading.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Reading read = new Reading();
				read.setVisible(true);
			}
		});

		menuBar.add(mnReading);

		JMenu mnGame = new JMenu("Game");
		mnGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Game game = new Game();
				game.setVisible(true);

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
				Tests test = new Tests();
				test.setVisible(true);

			}
		});
		menuBar.add(mnTests);

		JMenu mnDictonary = new JMenu("Dictonary");
		mnDictonary.addMouseListener(new MouseAdapter() {
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
		menuBar.add(mnDictonary);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(24, 44, 513, 349);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblRed = new JLabel("New label");
		lblRed.setIcon(new ImageIcon(FindColors.class.getResource("/img/colors_2.jpg")));
		lblRed.setBounds(10, 11, 490, 308);
		lblRed.setBackground(new Color(255, 0, 0));
		lblRed.setOpaque(true);
		panel.add(lblRed);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel.add(textField);
		textField.setBounds(20, 34, 91, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel.add(textField_1);
		textField_1.setBounds(250, 34, 91, 20);
		textField_1.setColumns(10);
		textField_1.setTransferHandler(new TextTransferHandler());
		
				textField_2 = new JTextField();
				textField_2.setEditable(false);
				panel.add(textField_2);
				textField_2.setBounds(386, 50, 98, 20);
				textField_2.setColumns(10);
				textField_2.setTransferHandler(new TextTransferHandler());
				
						textField_3 = new JTextField();
						textField_3.setEditable(false);
						panel.add(textField_3);
						textField_3.setBounds(289, 133, 91, 20);
						textField_3.setColumns(10);
						
								textField_4 = new JTextField();
								textField_4.setEditable(false);
								panel.add(textField_4);
								textField_4.setBounds(411, 181, 64, 20);
								textField_4.setColumns(10);
								
										textField_5 = new JTextField();
										textField_5.setEditable(false);
										panel.add(textField_5);
										textField_5.setBounds(359, 264, 98, 20);
										textField_5.setColumns(10);
										
												textField_6 = new JTextField();
												textField_6.setEditable(false);
												panel.add(textField_6);
												textField_6.setBounds(235, 250, 91, 20);
												textField_6.setColumns(10);
												
														textField_7 = new JTextField();
														textField_7.setEditable(false);
														panel.add(textField_7);
														textField_7.setBounds(99, 264, 91, 20);
														textField_7.setColumns(10);
														
														textField_8 = new JTextField();
														textField_8.setEditable(false);
														textField_8.setBounds(20, 206, 98, 20);
														panel.add(textField_8);
														textField_8.setColumns(10);
														
														textField_9 = new JTextField();
														textField_9.setEditable(false);
														textField_9.setBounds(136, 133, 98, 20);
														panel.add(textField_9);
														textField_9.setColumns(10);


		textField.setTransferHandler(new TextTransferHandler());
		textField_1.setTransferHandler(new TextTransferHandler());
		textField_2.setTransferHandler(new TextTransferHandler());
		textField_3.setTransferHandler(new TextTransferHandler());
		textField_4.setTransferHandler(new TextTransferHandler());
		textField_5.setTransferHandler(new TextTransferHandler());
		textField_6.setTransferHandler(new TextTransferHandler());
		textField_7.setTransferHandler(new TextTransferHandler());
		textField_8.setTransferHandler(new TextTransferHandler());
		textField_9.setTransferHandler(new TextTransferHandler());
							
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(526, 44, 164, 349);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		list = new JList();
		list.setBackground(new Color(245, 222, 179));
		list.setBounds(10, 11, 148, 208);
//		list.addMouseListener(new MouseAdapter() {
//			public void mouseReleased(java.awt.event.MouseEvent arg0) {
//				if (textField_1.getText().equalsIgnoreCase("item 1")) {
//					textField_1.setBackground(Color.GREEN);
//				} else {
//					textField_1.setBackground(Color.RED);
//				}
//				if (textField_2.getText().equalsIgnoreCase("item 2")) {
//					textField_2.setBackground(Color.GREEN);
//				} else {
//					textField_2.setBackground(Color.RED);
//				}
//			}
//		});
		list.setDragEnabled(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "WHITE", "ORANGE", "BLUE", "RED",	"YELLOW", "GREEN","GREY","PINK","BROWN" ,"BLACK"  };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		panel_1.add(list);
		
		JLabel lblNewLabel = new JLabel("Match the COLORS  and WORDS");
		lblNewLabel.setForeground(new Color(51, 102, 204));
		lblNewLabel.setFont(new Font("Kartika", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 21, 503, 22);
		frame.getContentPane().add(lblNewLabel);
	}
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }


	public void setVisible(boolean b) {
		frame.setVisible(b);

	}
	
	private class TextTransferHandler extends TransferHandler{
	    public boolean canImport(TransferHandler.TransferSupport info) {
	        // Check for String flavor
	        if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
	            return false;
	        }
	                
	        return true;
	   }			

	    public boolean importData(TransferHandler.TransferSupport info) {
	    	JTextField txt = (JTextField)info.getComponent();
	    	Transferable t = info.getTransferable();
	    	String data=null;
	    	try {
				data = (String) t.getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				return false;
			}
	    	txt.setText(data);
	    	
	    	int ugur=0;
	    	
	    	if (txt.equals(textField) && data.equalsIgnoreCase("RED")) {
				textField.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField) && !data.equalsIgnoreCase("RED")){
				textField.setBackground(Color.RED);
			}
			if (txt.equals(textField_1) && data.equalsIgnoreCase("BROWN")) {
				textField_1.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_1) && !data.equalsIgnoreCase("BROWN")){
				textField_1.setBackground(Color.RED);
			}
		
			if (txt.equals(textField_2) && data.equalsIgnoreCase("BLACK")) {
				textField_2.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_2) && !data.equalsIgnoreCase("BLACK")){
				textField_2.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_3) && data.equalsIgnoreCase("PINK")) {
				textField_3.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_3) && !data.equalsIgnoreCase("PINK")){
				textField_3.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_4) && data.equalsIgnoreCase("WHITE")) {
				textField_4.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_4) && !data.equalsIgnoreCase("WHITE")){
				textField_4.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_5) && data.equalsIgnoreCase("GREEN")) {
				textField_5.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_5) && !data.equalsIgnoreCase("GREEN")){
				textField_5.setBackground(Color.RED);
			}
			
						
			if (txt.equals(textField_6) && data.equalsIgnoreCase("BLUE")) {
				textField_6.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_6) && !data.equalsIgnoreCase("BLUE")){
				textField_6.setBackground(Color.RED);
			}
			if (txt.equals(textField_7) && data.equalsIgnoreCase("GREY")) {
				textField_7.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_7) && !data.equalsIgnoreCase("GREY")){
				textField_7.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_8) && data.equalsIgnoreCase("YELLOW")) {
				textField_8.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_8) && !data.equalsIgnoreCase("YELLOW")){
				textField_8.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_9) && data.equalsIgnoreCase("ORANGE")) {
				textField_9.setBackground(Color.GREEN);
				ugur++;
			} else if(txt.equals(textField_9) && !data.equalsIgnoreCase("ORANGE")){
				textField_9.setBackground(Color.RED);
			}
			
			if (ugur==1){
				
				final JPanel panel = new JPanel();
				
				JOptionPane.showMessageDialog(panel, "Congradulations !!! ", "Message", JOptionPane.INFORMATION_MESSAGE,img);
					
				
			}
			
			
	    	return true;
	    	
	    	
	    }	

	}
}

