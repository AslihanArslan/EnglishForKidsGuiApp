package EnglishForKids;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class FindNumbers extends JPanel {

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
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtTwelve;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField txtSixteen;
	private JTextField textField_40;
	private JTextField txtNineteen;
	private JTextField textField_42;
	private JTextField textField_43;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					FindNumbers window = new FindNumbers();
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
	public FindNumbers() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(50, 25, 586, 527);
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

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(28, 42, 325, 343);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(78, 3, 62, 20);
		panel.add(textField);
		textField.setColumns(10);
		textField.setTransferHandler(new TextTransferHandler());
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(78, 34, 62, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setTransferHandler(new TextTransferHandler());

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(78, 65, 62, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setTransferHandler(new TextTransferHandler());

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(78, 96, 62, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setTransferHandler(new TextTransferHandler());

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(78, 127, 62, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setTransferHandler(new TextTransferHandler());

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(78, 158, 62, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setTransferHandler(new TextTransferHandler());
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(78, 189, 62, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setTransferHandler(new TextTransferHandler());

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(12, 220, 56, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		textField_7.setTransferHandler(new TextTransferHandler());
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_8.setText("6 + 1 =");
		textField_8.setBounds(12, 3, 56, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setText("0 + 5 =");
		textField_9.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(12, 34, 56, 20);
		panel.add(textField_9);
		
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setText("3 - 2 =");
		textField_10.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_10.setColumns(10);
		textField_10.setBounds(12, 65, 56, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setText("2 + 4 =");
		textField_11.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(12, 96, 56, 20);
		panel.add(textField_11);
		
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setText("7 - 3 =");
		textField_12.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_12.setColumns(10);
		textField_12.setBounds(12, 127, 56, 20);
		panel.add(textField_12);
		
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setText("5 + 3 =");
		textField_13.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_13.setColumns(10);
		textField_13.setBounds(12, 158, 56, 20);
		panel.add(textField_13);
		textField_13.setTransferHandler(new TextTransferHandler());
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setText("7 + 2 =");
		textField_14.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_14.setColumns(10);
		textField_14.setBounds(12, 189, 56, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setText(" + 6 = 6");
		textField_15.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_15.setColumns(10);
		textField_15.setBounds(78, 220, 62, 20);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setText("5 - 3 =");
		textField_16.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_16.setColumns(10);
		textField_16.setBounds(12, 251, 56, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBounds(78, 251, 62, 20);
		panel.add(textField_17);
		textField_17.setColumns(10);
		textField_17.setTransferHandler(new TextTransferHandler());
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setText("1 + 2 =");
		textField_18.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_18.setColumns(10);
		textField_18.setBounds(12, 282, 56, 20);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setBounds(78, 282, 62, 20);
		panel.add(textField_19);
		textField_19.setColumns(10);
		textField_19.setTransferHandler(new TextTransferHandler());
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setText("8 + 2 =");
		textField_20.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_20.setColumns(10);
		textField_20.setBounds(12, 313, 56, 20);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(78, 313, 62, 20);
		panel.add(textField_21);
		textField_21.setTransferHandler(new TextTransferHandler());
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setText("11");
		textField_22.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_22.setColumns(10);
		textField_22.setBounds(171, 3, 32, 20);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(213, 3, 76, 20);
		panel.add(textField_23);
		textField_23.setTransferHandler(new TextTransferHandler());
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setText("15");
		textField_24.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_24.setColumns(10);
		textField_24.setBounds(171, 34, 32, 20);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(213, 34, 76, 20);
		panel.add(textField_25);
		textField_25.setTransferHandler(new TextTransferHandler());
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setText("17");
		textField_26.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_26.setColumns(10);
		textField_26.setBounds(171, 65, 32, 20);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(213, 65, 76, 20);
		panel.add(textField_27);
		textField_27.setTransferHandler(new TextTransferHandler());
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_28.setColumns(10);
		textField_28.setBounds(171, 96, 32, 20);
		panel.add(textField_28);
		textField_28.setTransferHandler(new TextTransferHandler());
		
		txtTwelve = new JTextField();
		txtTwelve.setEditable(false);
		txtTwelve.setFont(new Font("Kartika", Font.BOLD, 13));
		txtTwelve.setText("twelve");
		txtTwelve.setColumns(10);
		txtTwelve.setBounds(213, 96, 76, 20);
		panel.add(txtTwelve);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setText("13");
		textField_30.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_30.setColumns(10);
		textField_30.setBounds(171, 127, 32, 20);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(213, 127, 76, 20);
		panel.add(textField_31);
		textField_31.setTransferHandler(new TextTransferHandler());
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setText("14");
		textField_34.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_34.setColumns(10);
		textField_34.setBounds(171, 158, 32, 20);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(213, 158, 76, 20);
		panel.add(textField_35);
		textField_35.setTransferHandler(new TextTransferHandler());
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setText("18");
		textField_36.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_36.setColumns(10);
		textField_36.setBounds(171, 189, 32, 20);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(213, 189, 76, 20);
		panel.add(textField_37);
		textField_37.setTransferHandler(new TextTransferHandler());
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_38.setColumns(10);
		textField_38.setBounds(171, 220, 32, 20);
		panel.add(textField_38);
		textField_38.setTransferHandler(new TextTransferHandler());
		
		txtSixteen = new JTextField();
		txtSixteen.setEditable(false);
		txtSixteen.setFont(new Font("Kartika", Font.BOLD, 13));
		txtSixteen.setText("sixteen");
		txtSixteen.setColumns(10);
		txtSixteen.setBounds(213, 220, 76, 20);
		panel.add(txtSixteen);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_40.setColumns(10);
		textField_40.setBounds(171, 251, 32, 20);
		panel.add(textField_40);
		textField_40.setTransferHandler(new TextTransferHandler());
		
		txtNineteen = new JTextField();
		txtNineteen.setEditable(false);
		txtNineteen.setFont(new Font("Kartika", Font.BOLD, 13));
		txtNineteen.setText("nineteen");
		txtNineteen.setColumns(10);
		txtNineteen.setBounds(213, 251, 76, 20);
		panel.add(txtNineteen);
		
		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setText("20");
		textField_42.setFont(new Font("Kartika", Font.BOLD, 13));
		textField_42.setColumns(10);
		textField_42.setBounds(171, 282, 32, 20);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBounds(213, 282, 76, 20);
		panel.add(textField_43);
		textField_43.setTransferHandler(new TextTransferHandler());

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(380, 40, 158, 380);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
				list = new JList();
				list.setFont(new Font("Tahoma", Font.BOLD, 13));
				list.setBackground(new Color(244, 164, 96));
				panel_1.add(list, BorderLayout.CENTER);
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
							String[] values = new String[] { "zero","one", "two", "three",
									"four","five", "six","seven","eight","nine","ten","eleven","12","thirteen","fourteen","fifteen","16",
									"seventeen","eighteen","19","twenty"};

							public int getSize() {
								return values.length;
							}

							public Object getElementAt(int index) {
								return values[index];
							}
						});
						
						lblNewLabel = new JLabel("Fill in the blanks with the words ");
						lblNewLabel.setForeground(new Color(0, 0, 255));
						lblNewLabel.setFont(new Font("Kartika", Font.BOLD, 15));
						lblNewLabel.setBounds(28, 11, 325, 25);
						frame.getContentPane().add(lblNewLabel);

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
	    	if (txt.equals(textField) && data.equalsIgnoreCase("seven")) {
				textField.setBackground(Color.GREEN);
			} else if(txt.equals(textField) && !data.equalsIgnoreCase("seven")){
				textField.setBackground(Color.RED);
			}
			
	    	if (txt.equals(textField_1) && data.equalsIgnoreCase("five")) {
				textField_1.setBackground(Color.GREEN);
			} else if(txt.equals(textField_1) && !data.equalsIgnoreCase("five")){
				textField_1.setBackground(Color.RED);
			}
		
			if (txt.equals(textField_2) && data.equalsIgnoreCase("one")) {
				textField_2.setBackground(Color.GREEN);
			} else if(txt.equals(textField_2) && !data.equalsIgnoreCase("one")){
				textField_2.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_3) && data.equalsIgnoreCase("six")) {
				textField_3.setBackground(Color.GREEN);
			} else if(txt.equals(textField_3) && !data.equalsIgnoreCase("six")){
				textField_3.setBackground(Color.RED);
			}
			if (txt.equals(textField_4) && data.equalsIgnoreCase("four")) {
				textField_4.setBackground(Color.GREEN);
			} else if(txt.equals(textField_4) && !data.equalsIgnoreCase("four")){
				textField_4.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_5) && data.equalsIgnoreCase("eight")) {
				textField_5.setBackground(Color.GREEN);
			} else if(txt.equals(textField_5) && !data.equalsIgnoreCase("eight")){
				textField_5.setBackground(Color.RED);
			}
			if (txt.equals(textField_6) && data.equalsIgnoreCase("nine")) {
				textField_6.setBackground(Color.GREEN);
			} else if(txt.equals(textField_6) && !data.equalsIgnoreCase("nine")){
				textField_6.setBackground(Color.RED);
			}
			if (txt.equals(textField_7) && data.equalsIgnoreCase("zero")) {
				textField_7.setBackground(Color.GREEN);
			} else if(txt.equals(textField_7) && !data.equalsIgnoreCase("zero")){
				textField_7.setBackground(Color.RED);
			}
			if (txt.equals(textField_17) && data.equalsIgnoreCase("two")) {
				textField_17.setBackground(Color.GREEN);
			} else if(txt.equals(textField_17) && !data.equalsIgnoreCase("two")){
				textField_17.setBackground(Color.RED);
			}
			if (txt.equals(textField_19) && data.equalsIgnoreCase("three")) {
				textField_19.setBackground(Color.GREEN);
			} else if(txt.equals(textField_19) && !data.equalsIgnoreCase("three")){
				textField_19.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_21) && data.equalsIgnoreCase("ten")) {
				textField_21.setBackground(Color.GREEN);
			} else if(txt.equals(textField_21) && !data.equalsIgnoreCase("ten")){
				textField_21.setBackground(Color.RED);
			}
			
////////////////*****************************************//////////////////////////////////////////////
		  	if (txt.equals(textField_31) && data.equalsIgnoreCase("thirteen")) {
				textField_31.setBackground(Color.GREEN);
			} else if(txt.equals(textField_31) && !data.equalsIgnoreCase("thirteen")){
				textField_31.setBackground(Color.RED);
			}
			
	    	if (txt.equals(textField_35) && data.equalsIgnoreCase("fourteen")) {
				textField_35.setBackground(Color.GREEN);
			} else if(txt.equals(textField_35) && !data.equalsIgnoreCase("fourteen")){
				textField_35.setBackground(Color.RED);
			}
		
			if (txt.equals(textField_37) && data.equalsIgnoreCase("eighteen")) {
				textField_37.setBackground(Color.GREEN);
			} else if(txt.equals(textField_37) && !data.equalsIgnoreCase("eighteen")){
				textField_37.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_38) && data.equalsIgnoreCase("16")) {
				textField_38.setBackground(Color.GREEN);
			} else if(txt.equals(textField_38) && !data.equalsIgnoreCase("16")){
				textField_38.setBackground(Color.RED);
			}
			if (txt.equals(textField_40) && data.equalsIgnoreCase("19")) {
				textField_40.setBackground(Color.GREEN);
			} else if(txt.equals(textField_40) && !data.equalsIgnoreCase("19")){
				textField_40.setBackground(Color.RED);
			}
			
			if (txt.equals(textField_25) && data.equalsIgnoreCase("fifteen")) {
				textField_25.setBackground(Color.GREEN);
			} else if(txt.equals(textField_25) && !data.equalsIgnoreCase("fifteen")){
				textField_25.setBackground(Color.RED);
			}
			if (txt.equals(textField_27) && data.equalsIgnoreCase("seventeen")) {
				textField_27.setBackground(Color.GREEN);
			} else if(txt.equals(textField_27) && !data.equalsIgnoreCase("seventeen")){
				textField_27.setBackground(Color.RED);
			}
			if (txt.equals(textField_23) && data.equalsIgnoreCase("eleven")) {
				textField_23.setBackground(Color.GREEN);
			} else if(txt.equals(textField_23) && !data.equalsIgnoreCase("eleven")){
				textField_23.setBackground(Color.RED);
			}
			if (txt.equals(textField_28) && data.equalsIgnoreCase("12")) {
				textField_28.setBackground(Color.GREEN);
			} else if(txt.equals(textField_28) && !data.equalsIgnoreCase("12")){
				textField_28.setBackground(Color.RED);
			}
			if (txt.equals(textField_43) && data.equalsIgnoreCase("twenty")) {
				textField_43.setBackground(Color.GREEN);
			} else if(txt.equals(textField_43) && !data.equalsIgnoreCase("twenty")){
				textField_43.setBackground(Color.RED);
			}
			
			
	    	
	    	return true;

	    }	

	}
}
