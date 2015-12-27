package EnglishForKids;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;


public class Units {

	private JFrame frame;
	CardLayout card = new CardLayout();
	CardLayout card_1 = new CardLayout();
	CardLayout card_2 = new CardLayout();
	CardLayout card_3 = new CardLayout();
	private JTable table;
	private JTable table_1;
	private JTextField txtCommonNounsNameany;
	private JTextField txtProperNounsName;
	private JTextField txtWeUseIt;
	private JTextField txtItIsOne;
	private JTextField txtItIsOne_1;
	private JTextField txtItIsOne_2;
	private JTextField txtItIsOne_3;
	private JTextField txtItIsOne_4;
	private JTextField txtItIsOne_5;
	private JTextField txtIHaveGot;
	private JTextField txtSheHasGot;
	private JTextField txtYouCantSmoke;
	private JTextField txtHeCanSpeak;
	private JTextField txtMustYouLeave;
	private JTextField txtWeMustCall;
	private JTextField txtItMayRain;
	private JTextField txtMayGodBe;
	private JTextField txtYouAreVery;
	private JTextField txtIWouldTake;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Units window = new Units();
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
	public Units() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img/icon.jpg"));
		frame.setBounds(50, 25, 730, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		final JMenu mnUnits = new JMenu("Units");
		mnUnits.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				
			}
		});
		mnUnits.setOpaque(true);
		mnUnits.setBackground(Color.GREEN);
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
				Game game = new Game();
				game.setVisible(true);

			
			}
		});
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
	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBackground(new Color(255, 255, 153));
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		tabbedPane.addTab("Chapter 1", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 153));
		panel.add(panel_1);
		panel_1.setLayout(card);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "layout_1");
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 153));
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHelloWorld = new JLabel("HELLO WORLD!");
		lblHelloWorld.setBackground(new Color(255, 204, 153));
		lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblHelloWorld, BorderLayout.NORTH);
		
		JLabel lblSingularAndPlural = new JLabel("Singular and Plural");
		lblSingularAndPlural.setBackground(new Color(255, 204, 153));
		lblSingularAndPlural.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSingularAndPlural.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblSingularAndPlural, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 153));
		panel_2.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.setBackground(new Color(255, 204, 153));
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1,"layout_2");
			}
		});
		btnContinue.setHorizontalTextPosition(SwingConstants.RIGHT);
		panel_4.add(btnContinue, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 153));
		panel_6.setMaximumSize(new Dimension(500, 450));
		panel_2.add(panel_6, BorderLayout.CENTER);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] {120, 180};
		gbl_panel_6.rowHeights = new int[] {90, 90, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_6.rowWeights = new double[]{1.0, 1.0, 0.0};
		panel_6.setLayout(gbl_panel_6);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.gridheight = 3;
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.VERTICAL;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		panel_6.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnSingularWhenA = new JTextPane();
		txtpnSingularWhenA.setBackground(new Color(255, 255, 153));
		txtpnSingularWhenA.setEditable(false);
		txtpnSingularWhenA.setText("Singular\r\nWhen a countable noun is singular, we must use a word like a/an the my one before it.");
		panel_7.add(txtpnSingularWhenA, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 153));
		panel_7.add(panel_8, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] {80, 80};
		gbl_panel_8.rowHeights = new int[] {0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JLabel lblNewLabel = new JLabel("a ball");
		lblNewLabel.setBackground(new Color(255, 255, 153));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_8.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("an apple");
		lblNewLabel_2.setBackground(new Color(255, 255, 153));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel_8.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("the ball");
		lblNewLabel_1.setBackground(new Color(255, 255, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_8.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("the apple");
		lblNewLabel_6.setBackground(new Color(255, 255, 153));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_8.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("my ball");
		lblNewLabel_7.setBackground(new Color(255, 255, 102));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 2;
		panel_8.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("my apple");
		lblNewLabel_8.setBackground(new Color(255, 255, 102));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 2;
		panel_8.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("one ball");
		lblNewLabel_9.setBackground(new Color(255, 255, 102));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 3;
		panel_8.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("one apple");
		lblNewLabel_10.setBackground(new Color(255, 255, 102));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 3;
		panel_8.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 255, 102));
		label.setIcon(new ImageIcon("img/units/ball2.jpg"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		panel_8.add(label, gbc_label);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBackground(new Color(255, 255, 102));
		lblNewLabel_16.setIcon(new ImageIcon("img/units/apple.jpg"));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_16.gridx = 1;
		gbc_lblNewLabel_16.gridy = 4;
		panel_8.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.gridheight = 3;
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.fill = GridBagConstraints.VERTICAL;
		gbc_panel_9.gridx = 1;
		gbc_panel_9.gridy = 0;
		panel_6.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnPluralWhenA = new JTextPane();
		txtpnPluralWhenA.setBackground(new Color(255, 255, 153));
		txtpnPluralWhenA.setEditable(false);
		txtpnPluralWhenA.setText("Plural\r\nWhen a countable noun is a plural, we can use it alone.");
		panel_9.add(txtpnPluralWhenA, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 153));
		panel_9.add(panel_10, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[] {80, 80, 0};
		gbl_panel_10.rowHeights = new int[] {0, 0, 0, 0, -6, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JLabel lblNewLabel_3 = new JLabel("balls");
		lblNewLabel_3.setBackground(new Color(255, 255, 153));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		panel_10.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("apples");
		lblNewLabel_4.setBackground(new Color(255, 255, 153));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		panel_10.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("the balls");
		lblNewLabel_5.setBackground(new Color(255, 255, 153));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 1;
		panel_10.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("the apples");
		lblNewLabel_11.setBackground(new Color(255, 255, 153));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_11.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 1;
		panel_10.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("your balls");
		lblNewLabel_12.setBackground(new Color(255, 255, 102));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_12.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 2;
		panel_10.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("their apples");
		lblNewLabel_13.setBackground(new Color(255, 255, 102));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_13.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_13.gridx = 1;
		gbc_lblNewLabel_13.gridy = 2;
		panel_10.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("four balls");
		lblNewLabel_14.setBackground(new Color(255, 255, 102));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_14.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 0;
		gbc_lblNewLabel_14.gridy = 3;
		panel_10.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("five apples");
		lblNewLabel_15.setBackground(new Color(255, 255, 102));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_15.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_15.gridx = 1;
		gbc_lblNewLabel_15.gridy = 3;
		panel_10.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("img/units/balls.jpg"));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_17.gridx = 0;
		gbc_lblNewLabel_17.gridy = 4;
		panel_10.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon("img/units/apples2.jpg"));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 1;
		gbc_lblNewLabel_18.gridy = 4;
		panel_10.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 153));
		panel_1.add(panel_5, "layout_2");
		panel_5.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 153));
		panel_5.add(panel_11, BorderLayout.SOUTH);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.setBackground(new Color(255, 204, 153));
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1, "layout_1");
			}
		});
		panel_11.add(btnBack_1, BorderLayout.WEST);
		
		JButton btnContinue_1 = new JButton("CONTINUE");
		btnContinue_1.setBackground(new Color(255, 204, 153));
		btnContinue_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1, "layout_3");
			}
		});
		panel_11.add(btnContinue_1, BorderLayout.EAST);
		btnBack_1.setPreferredSize(btnContinue_1.getPreferredSize());
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 204, 153));
		panel_5.add(panel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_19 = new JLabel("Singular Nouns");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_19);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 153));
		panel_5.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 153));
		panel_13.add(panel_14, BorderLayout.NORTH);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_20 = new JLabel("When we are talking about one person, animal, place or thing, we use the singular form.");
		lblNewLabel_20.setBackground(new Color(255, 255, 153));
		panel_14.add(lblNewLabel_20, BorderLayout.NORTH);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.LEFT);
		
		JTree tree = new JTree();
		tree.setBackground(new Color(255, 255, 153));
		panel_14.add(tree, BorderLayout.CENTER);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("a / an before singular nouns") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					node_1 = new DefaultMutableTreeNode("a (Use a before words beginning with consonants)");
						node_2 = new DefaultMutableTreeNode("Example");
							node_2.add(new DefaultMutableTreeNode("a bear"));
							node_2.add(new DefaultMutableTreeNode("a child"));
							node_2.add(new DefaultMutableTreeNode("a mushroom"));
							node_2.add(new DefaultMutableTreeNode("a snake"));
							node_2.add(new DefaultMutableTreeNode("a zebra"));
						node_1.add(node_2);
					add(node_1);
					node_1 = new DefaultMutableTreeNode("an (Use an before words beginning with vowels)");
						node_2 = new DefaultMutableTreeNode("Example");
							node_2.add(new DefaultMutableTreeNode("an ant"));
							node_2.add(new DefaultMutableTreeNode("an elephant"));
							node_2.add(new DefaultMutableTreeNode("an iron"));
							node_2.add(new DefaultMutableTreeNode("an owl"));
							node_2.add(new DefaultMutableTreeNode("an umbrella"));
						node_1.add(node_2);
					add(node_1);
				}
			}
		));
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(255, 255, 153));
		panel_13.add(panel_31, BorderLayout.CENTER);
		GridBagLayout gbl_panel_31 = new GridBagLayout();
		gbl_panel_31.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_31.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_31.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_31.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_31.setLayout(gbl_panel_31);
		
		JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(255, 255, 153));
		label_5.setIcon(new ImageIcon("img/units/indir (3).jpg"));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 1;
		panel_31.add(label_5, gbc_label_5);
		
		JLabel label_11 = new JLabel("");
		label_11.setBackground(new Color(255, 255, 153));
		label_11.setIcon(new ImageIcon("img/units/indir (6).jpg"));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 1;
		panel_31.add(label_11, gbc_label_11);
		
		JLabel label_6 = new JLabel("");
		label_6.setBackground(new Color(255, 255, 153));
		label_6.setIcon(new ImageIcon("img/units/indir (4).jpg"));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 2;
		gbc_label_6.gridy = 1;
		panel_31.add(label_6, gbc_label_6);
		
		JLabel label_9 = new JLabel("");
		label_9.setBackground(new Color(255, 255, 153));
		label_9.setIcon(new ImageIcon("img/units/indir (7).jpg"));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 3;
		gbc_label_9.gridy = 1;
		panel_31.add(label_9, gbc_label_9);
		
		JLabel label_7 = new JLabel("");
		label_7.setBackground(new Color(255, 255, 153));
		label_7.setIcon(new ImageIcon("img/units/indir (2).jpg"));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 4;
		gbc_label_7.gridy = 1;
		panel_31.add(label_7, gbc_label_7);
		
		JLabel label_10 = new JLabel("");
		label_10.setBackground(new Color(255, 255, 153));
		label_10.setIcon(new ImageIcon("img/units/indir (5).jpg"));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 5;
		gbc_label_10.gridy = 1;
		panel_31.add(label_10, gbc_label_10);
		
		JLabel label_8 = new JLabel("");
		label_8.setBackground(new Color(255, 255, 153));
		label_8.setIcon(new ImageIcon("img/units/images (2).jpg"));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 6;
		gbc_label_8.gridy = 1;
		panel_31.add(label_8, gbc_label_8);
		
		JLabel lblABear = new JLabel("a bear");
		lblABear.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblABear = new GridBagConstraints();
		gbc_lblABear.insets = new Insets(0, 0, 0, 5);
		gbc_lblABear.gridx = 0;
		gbc_lblABear.gridy = 2;
		panel_31.add(lblABear, gbc_lblABear);
		
		JLabel lblABook = new JLabel("a book");
		lblABook.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblABook = new GridBagConstraints();
		gbc_lblABook.insets = new Insets(0, 0, 0, 5);
		gbc_lblABook.gridx = 1;
		gbc_lblABook.gridy = 2;
		panel_31.add(lblABook, gbc_lblABook);
		
		JLabel lblAMushroom = new JLabel("a mushroom");
		lblAMushroom.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblAMushroom = new GridBagConstraints();
		gbc_lblAMushroom.insets = new Insets(0, 0, 0, 5);
		gbc_lblAMushroom.gridx = 2;
		gbc_lblAMushroom.gridy = 2;
		panel_31.add(lblAMushroom, gbc_lblAMushroom);
		
		JLabel lblATeacher = new JLabel("a teacher");
		lblATeacher.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblATeacher = new GridBagConstraints();
		gbc_lblATeacher.insets = new Insets(0, 0, 0, 5);
		gbc_lblATeacher.gridx = 3;
		gbc_lblATeacher.gridy = 2;
		panel_31.add(lblATeacher, gbc_lblATeacher);
		
		JLabel lblAnElephant = new JLabel("an elephant");
		lblAnElephant.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblAnElephant = new GridBagConstraints();
		gbc_lblAnElephant.insets = new Insets(0, 0, 0, 5);
		gbc_lblAnElephant.gridx = 4;
		gbc_lblAnElephant.gridy = 2;
		panel_31.add(lblAnElephant, gbc_lblAnElephant);
		
		JLabel lblAnOwl = new JLabel("an owl");
		lblAnOwl.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblAnOwl = new GridBagConstraints();
		gbc_lblAnOwl.insets = new Insets(0, 0, 0, 5);
		gbc_lblAnOwl.gridx = 5;
		gbc_lblAnOwl.gridy = 2;
		panel_31.add(lblAnOwl, gbc_lblAnOwl);
		
		JLabel lblAnUmbrella = new JLabel("an umbrella");
		lblAnUmbrella.setBackground(new Color(255, 255, 153));
		GridBagConstraints gbc_lblAnUmbrella = new GridBagConstraints();
		gbc_lblAnUmbrella.gridx = 6;
		gbc_lblAnUmbrella.gridy = 2;
		panel_31.add(lblAnUmbrella, gbc_lblAnUmbrella);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 153));
		panel_1.add(panel_15, "layout_3");
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 153));
		panel_15.add(panel_16, BorderLayout.SOUTH);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack_2 = new JButton("BACK");
		btnBack_2.setBackground(new Color(255, 204, 153));
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(panel_1, "layout_2");
			}
		});
		panel_16.add(btnBack_2, BorderLayout.WEST);
		
		JButton btnContinue_2 = new JButton("CONTINUE");
		btnContinue_2.setBackground(new Color(255, 204, 153));
		btnContinue_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1, "layout_4");
			}
		});
		panel_16.add(btnContinue_2, BorderLayout.EAST);
		btnBack_2.setPreferredSize(btnContinue_2.getPreferredSize());
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 204, 153));
		panel_15.add(panel_17, BorderLayout.NORTH);
		
		JLabel lblSingularNouns = new JLabel("Singular Nouns");
		lblSingularNouns.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSingularNouns.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblSingularNouns);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 153));
		panel_15.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 153));
		panel_18.add(panel_19, BorderLayout.CENTER);
		GridBagLayout gbl_panel_19 = new GridBagLayout();
		gbl_panel_19.columnWidths = new int[]{150, 150, 150, 150, 0};
		gbl_panel_19.rowHeights = new int[]{75, 125, 0};
		gbl_panel_19.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_19.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_19.setLayout(gbl_panel_19);
		
		JTextPane txtpnUseAnIf = new JTextPane();
		txtpnUseAnIf.setEditable(false);
		txtpnUseAnIf.setBackground(new Color(255, 255, 153));
		txtpnUseAnIf.setText("Use an if the h is silent --> an hourglass");
		GridBagConstraints gbc_txtpnUseAnIf = new GridBagConstraints();
		gbc_txtpnUseAnIf.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnUseAnIf.fill = GridBagConstraints.BOTH;
		gbc_txtpnUseAnIf.gridx = 0;
		gbc_txtpnUseAnIf.gridy = 0;
		panel_19.add(txtpnUseAnIf, gbc_txtpnUseAnIf);
		
		JTextPane txtpnUseAIf = new JTextPane();
		txtpnUseAIf.setEditable(false);
		txtpnUseAIf.setBackground(new Color(255, 255, 153));
		txtpnUseAIf.setText("Use a if the h is pronounced --> a hammer");
		GridBagConstraints gbc_txtpnUseAIf = new GridBagConstraints();
		gbc_txtpnUseAIf.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnUseAIf.fill = GridBagConstraints.BOTH;
		gbc_txtpnUseAIf.gridx = 1;
		gbc_txtpnUseAIf.gridy = 0;
		panel_19.add(txtpnUseAIf, gbc_txtpnUseAIf);
		
		JTextPane txtpnWeUseA = new JTextPane();
		txtpnWeUseA.setEditable(false);
		txtpnWeUseA.setBackground(new Color(255, 255, 153));
		txtpnWeUseA.setText("We use a, not an,because  the vowel u in this word sounds like the word you --> a universe \r\n\r\n");
		GridBagConstraints gbc_txtpnWeUseA = new GridBagConstraints();
		gbc_txtpnWeUseA.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnWeUseA.fill = GridBagConstraints.BOTH;
		gbc_txtpnWeUseA.gridx = 2;
		gbc_txtpnWeUseA.gridy = 0;
		panel_19.add(txtpnWeUseA, gbc_txtpnWeUseA);
		
		JTextPane txtpnWeUseA_1 = new JTextPane();
		txtpnWeUseA_1.setEditable(false);
		txtpnWeUseA_1.setBackground(new Color(255, 255, 153));
		txtpnWeUseA_1.setText("We use a, not an,because  the vowel u in this word sounds like the word you --> a unicorn\r\n\r\n");
		GridBagConstraints gbc_txtpnWeUseA_1 = new GridBagConstraints();
		gbc_txtpnWeUseA_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnWeUseA_1.fill = GridBagConstraints.BOTH;
		gbc_txtpnWeUseA_1.gridx = 3;
		gbc_txtpnWeUseA_1.gridy = 0;
		panel_19.add(txtpnWeUseA_1, gbc_txtpnWeUseA_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img/units/indir.jpg"));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 1;
		panel_19.add(label_2, gbc_label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img/units/images.jpg"));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel_19.add(label_1, gbc_label_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("img/units/images (1).jpg"));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 1;
		panel_19.add(label_4, gbc_label_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("img/units/indir (1).jpg"));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 1;
		panel_19.add(label_3, gbc_label_3);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 153));
		panel_1.add(panel_20, "layout_4");
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 204, 153));
		panel_20.add(panel_21, BorderLayout.NORTH);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("Plural Nouns");
		lblNewLabel_21.setBackground(new Color(255, 204, 153));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(lblNewLabel_21);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(255, 255, 153));
		panel_21.add(panel_25, BorderLayout.SOUTH);
		
		JTextPane txtpnWhenWeAre = new JTextPane();
		txtpnWhenWeAre.setEditable(false);
		txtpnWhenWeAre.setBackground(new Color(255, 255, 153));
		panel_25.add(txtpnWhenWeAre);
		txtpnWhenWeAre.setText("When we are talking about more than one person, animal, place or thing, we use the plural form.");
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 153));
		panel_20.add(panel_22, BorderLayout.SOUTH);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack_3 = new JButton("BACK");
		btnBack_3.setBackground(new Color(255, 204, 153));
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1, "layout_3");
			}
		});
		panel_22.add(btnBack_3, BorderLayout.WEST);
		
		JButton btnContinue_3 = new JButton("CONTINUE");
		btnContinue_3.setBackground(new Color(255, 204, 153));
		btnContinue_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1, "layout_5");
			}
		});
		panel_22.add(btnContinue_3, BorderLayout.EAST);
		btnBack_3.setPreferredSize(btnContinue_3.getPreferredSize());
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 153));
		panel_20.add(panel_23, BorderLayout.CENTER);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 153));
		panel_23.add(panel_24, BorderLayout.CENTER);
		GridBagLayout gbl_panel_24 = new GridBagLayout();
		gbl_panel_24.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_24.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_24.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_24.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_24.setLayout(gbl_panel_24);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("img/units/images (4).jpg"));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 1;
		gbc_label_13.gridy = 0;
		panel_24.add(label_13, gbc_label_13);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("img/units/images (5).jpg"));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 3;
		gbc_label_15.gridy = 0;
		panel_24.add(label_15, gbc_label_15);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("img/units/indir (10).jpg"));
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 5;
		gbc_label_17.gridy = 0;
		panel_24.add(label_17, gbc_label_17);
		
		JLabel lblFish = new JLabel("fish");
		GridBagConstraints gbc_lblFish = new GridBagConstraints();
		gbc_lblFish.insets = new Insets(0, 0, 5, 5);
		gbc_lblFish.gridx = 1;
		gbc_lblFish.gridy = 1;
		panel_24.add(lblFish, gbc_lblFish);
		
		JLabel lblMice = new JLabel("mice");
		GridBagConstraints gbc_lblMice = new GridBagConstraints();
		gbc_lblMice.insets = new Insets(0, 0, 5, 5);
		gbc_lblMice.gridx = 3;
		gbc_lblMice.gridy = 1;
		panel_24.add(lblMice, gbc_lblMice);
		
		JLabel lblChildren = new JLabel("children");
		GridBagConstraints gbc_lblChildren = new GridBagConstraints();
		gbc_lblChildren.insets = new Insets(0, 0, 5, 5);
		gbc_lblChildren.gridx = 5;
		gbc_lblChildren.gridy = 1;
		panel_24.add(lblChildren, gbc_lblChildren);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("img/units/images (6).jpg"));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 2;
		panel_24.add(label_12, gbc_label_12);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("img/units/images (3).jpg"));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 2;
		gbc_label_14.gridy = 2;
		panel_24.add(label_14, gbc_label_14);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("img/units/indir (8).jpg"));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 4;
		gbc_label_16.gridy = 2;
		panel_24.add(label_16, gbc_label_16);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("img/units/indir (9).jpg"));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 6;
		gbc_label_18.gridy = 2;
		panel_24.add(label_18, gbc_label_18);
		
		JLabel lblRabbits = new JLabel("rabbits");
		GridBagConstraints gbc_lblRabbits = new GridBagConstraints();
		gbc_lblRabbits.insets = new Insets(0, 0, 5, 5);
		gbc_lblRabbits.gridx = 0;
		gbc_lblRabbits.gridy = 3;
		panel_24.add(lblRabbits, gbc_lblRabbits);
		
		JLabel lblSocks = new JLabel("socks");
		GridBagConstraints gbc_lblSocks = new GridBagConstraints();
		gbc_lblSocks.insets = new Insets(0, 0, 5, 5);
		gbc_lblSocks.gridx = 2;
		gbc_lblSocks.gridy = 3;
		panel_24.add(lblSocks, gbc_lblSocks);
		
		JLabel lblCows = new JLabel("cows");
		GridBagConstraints gbc_lblCows = new GridBagConstraints();
		gbc_lblCows.insets = new Insets(0, 0, 5, 5);
		gbc_lblCows.gridx = 4;
		gbc_lblCows.gridy = 3;
		panel_24.add(lblCows, gbc_lblCows);
		
		JLabel lblCages = new JLabel("cages");
		GridBagConstraints gbc_lblCages = new GridBagConstraints();
		gbc_lblCages.insets = new Insets(0, 0, 5, 5);
		gbc_lblCages.gridx = 6;
		gbc_lblCages.gridy = 3;
		panel_24.add(lblCages, gbc_lblCages);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(255, 255, 153));
		panel_1.add(panel_26, "layout_5");
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(255, 204, 153));
		panel_26.add(panel_27, BorderLayout.NORTH);
		
		JLabel lblPluralNouns = new JLabel("Plural Nouns");
		lblPluralNouns.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPluralNouns.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblPluralNouns);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 153));
		panel_26.add(panel_28, BorderLayout.SOUTH);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack_4 = new JButton("BACK");
		btnBack_4.setBackground(new Color(255, 204, 153));
		btnBack_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				card.show(panel_1, "layout_4");
		}
		});	
		panel_28.add(btnBack_4, BorderLayout.WEST);
		
		JButton btnContinue_4 = new JButton("CONTINUE");
		btnContinue_4.setBackground(new Color(255, 204, 153));
		btnContinue_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1,"layout_6");
			}
		});
		panel_28.add(btnContinue_4, BorderLayout.EAST);
		btnBack_4.setPreferredSize(btnContinue_4.getPreferredSize());
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 153));
		panel_26.add(panel_29, BorderLayout.CENTER);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnFormingThePlural = new JTextPane();
		txtpnFormingThePlural.setEditable(false);
		txtpnFormingThePlural.setBackground(new Color(255, 255, 153));
		txtpnFormingThePlural.setText("forming the plural\r\n\r\n1) most nouns are made plural by adding -s at the end --> eggs, tables, flowers\r\n\r\n2) nouns ending in s, ss, sh, ch, x take -es in the plural --> dresses, foxes, brushes\r\n\r\n3) some nouns ending in o take -s or -es to form the plural --> kangaroos, tomatoes\r\n\r\n4) nouns ending in a consonant+y drop the y end take -ies --> babies, cherries\r\n    nouns ending in a vowel+y take -s --> boys, turkeys, donkeys\r\n\r\n5) nouns ending in f or fe drop the f or fe and take -ves --> leaves, knives, wolves\r\n    some nouns ending in f or fe take only -s in the plural --> roofs, safes, giraffes\r\n\r\n6) some plural nouns change their form --> geese, feet, mice\r\n    some plural nouns are the same as the singular noun --> deer, fish, sheep\r\n    some nouns are always plural --> shorts, scissors, sunglasses");
		panel_29.add(txtpnFormingThePlural, BorderLayout.NORTH);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(255, 255, 153));
		panel_1.add(panel_30, "layout_6");
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(255, 204, 153));
		panel_30.add(panel_32, BorderLayout.NORTH);
		
		JLabel lblPluralNouns_1 = new JLabel("Plural Nouns");
		lblPluralNouns_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPluralNouns_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_32.add(lblPluralNouns_1);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(255, 255, 153));
		panel_30.add(panel_33, BorderLayout.SOUTH);
		panel_33.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack_5 = new JButton("BACK");
		btnBack_5.setBackground(new Color(255, 204, 153));
		btnBack_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_1,"layout_5");
			}
		});
		panel_33.add(btnBack_5, BorderLayout.WEST);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(255, 255, 153));
		panel_30.add(panel_34, BorderLayout.CENTER);
		GridBagLayout gbl_panel_34 = new GridBagLayout();
		gbl_panel_34.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_34.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_34.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_34.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_34.setLayout(gbl_panel_34);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("img/units/eggs.jpg"));
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 0;
		gbc_label_19.gridy = 0;
		panel_34.add(label_19, gbc_label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("img/units/trees.jpg"));
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.insets = new Insets(0, 0, 5, 5);
		gbc_label_20.gridx = 1;
		gbc_label_20.gridy = 0;
		panel_34.add(label_20, gbc_label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("img/units/boxes.jpg"));
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 2;
		gbc_label_21.gridy = 0;
		panel_34.add(label_21, gbc_label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("img/units/dress.jpg"));
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 3;
		gbc_label_22.gridy = 0;
		panel_34.add(label_22, gbc_label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("img/units/tomatoes.jpg"));
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 4;
		gbc_label_23.gridy = 0;
		panel_34.add(label_23, gbc_label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("img/units/potatoes.jpg"));
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 5;
		gbc_label_24.gridy = 0;
		panel_34.add(label_24, gbc_label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("img/units/kangaroos.png"));
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.insets = new Insets(0, 0, 5, 0);
		gbc_label_25.gridx = 6;
		gbc_label_25.gridy = 0;
		panel_34.add(label_25, gbc_label_25);
		
		JLabel lblEggs = new JLabel("eggs");
		GridBagConstraints gbc_lblEggs = new GridBagConstraints();
		gbc_lblEggs.insets = new Insets(0, 0, 5, 5);
		gbc_lblEggs.gridx = 0;
		gbc_lblEggs.gridy = 1;
		panel_34.add(lblEggs, gbc_lblEggs);
		
		JLabel lblTrees = new JLabel("trees");
		GridBagConstraints gbc_lblTrees = new GridBagConstraints();
		gbc_lblTrees.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrees.gridx = 1;
		gbc_lblTrees.gridy = 1;
		panel_34.add(lblTrees, gbc_lblTrees);
		
		JLabel lblBoxes = new JLabel("boxes");
		GridBagConstraints gbc_lblBoxes = new GridBagConstraints();
		gbc_lblBoxes.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoxes.gridx = 2;
		gbc_lblBoxes.gridy = 1;
		panel_34.add(lblBoxes, gbc_lblBoxes);
		
		JLabel lblDresses = new JLabel("dresses");
		GridBagConstraints gbc_lblDresses = new GridBagConstraints();
		gbc_lblDresses.insets = new Insets(0, 0, 5, 5);
		gbc_lblDresses.gridx = 3;
		gbc_lblDresses.gridy = 1;
		panel_34.add(lblDresses, gbc_lblDresses);
		
		JLabel lblTomatoes = new JLabel("tomatoes");
		GridBagConstraints gbc_lblTomatoes = new GridBagConstraints();
		gbc_lblTomatoes.insets = new Insets(0, 0, 5, 5);
		gbc_lblTomatoes.gridx = 4;
		gbc_lblTomatoes.gridy = 1;
		panel_34.add(lblTomatoes, gbc_lblTomatoes);
		
		JLabel lblPotatoes = new JLabel("potatoes");
		GridBagConstraints gbc_lblPotatoes = new GridBagConstraints();
		gbc_lblPotatoes.insets = new Insets(0, 0, 5, 5);
		gbc_lblPotatoes.gridx = 5;
		gbc_lblPotatoes.gridy = 1;
		panel_34.add(lblPotatoes, gbc_lblPotatoes);
		
		JLabel lblKangaroos = new JLabel("kangaroos");
		GridBagConstraints gbc_lblKangaroos = new GridBagConstraints();
		gbc_lblKangaroos.insets = new Insets(0, 0, 5, 0);
		gbc_lblKangaroos.gridx = 6;
		gbc_lblKangaroos.gridy = 1;
		panel_34.add(lblKangaroos, gbc_lblKangaroos);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("img/units/babies.jpg"));
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 0;
		gbc_label_26.gridy = 3;
		panel_34.add(label_26, gbc_label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon("img/units/monkeys.jpg"));
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 1;
		gbc_label_27.gridy = 3;
		panel_34.add(label_27, gbc_label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon("img/units/leaves.jpg"));
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 2;
		gbc_label_28.gridy = 3;
		panel_34.add(label_28, gbc_label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon("img/units/giraffes.jpg"));
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 3;
		gbc_label_29.gridy = 3;
		panel_34.add(label_29, gbc_label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon("img/units/feet.jpg"));
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 4;
		gbc_label_30.gridy = 3;
		panel_34.add(label_30, gbc_label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon("img/units/sheep.jpg"));
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.insets = new Insets(0, 0, 5, 5);
		gbc_label_31.gridx = 5;
		gbc_label_31.gridy = 3;
		panel_34.add(label_31, gbc_label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon("img/units/sunglasses.jpg"));
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.insets = new Insets(0, 0, 5, 0);
		gbc_label_32.gridx = 6;
		gbc_label_32.gridy = 3;
		panel_34.add(label_32, gbc_label_32);
		
		JLabel lblBabies = new JLabel("babies");
		GridBagConstraints gbc_lblBabies = new GridBagConstraints();
		gbc_lblBabies.insets = new Insets(0, 0, 0, 5);
		gbc_lblBabies.gridx = 0;
		gbc_lblBabies.gridy = 4;
		panel_34.add(lblBabies, gbc_lblBabies);
		
		JLabel lblMonkeys = new JLabel("monkeys");
		GridBagConstraints gbc_lblMonkeys = new GridBagConstraints();
		gbc_lblMonkeys.insets = new Insets(0, 0, 0, 5);
		gbc_lblMonkeys.gridx = 1;
		gbc_lblMonkeys.gridy = 4;
		panel_34.add(lblMonkeys, gbc_lblMonkeys);
		
		JLabel lblLeaves = new JLabel("leaves");
		GridBagConstraints gbc_lblLeaves = new GridBagConstraints();
		gbc_lblLeaves.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeaves.gridx = 2;
		gbc_lblLeaves.gridy = 4;
		panel_34.add(lblLeaves, gbc_lblLeaves);
		
		JLabel lblGiraffes = new JLabel("giraffes");
		GridBagConstraints gbc_lblGiraffes = new GridBagConstraints();
		gbc_lblGiraffes.insets = new Insets(0, 0, 0, 5);
		gbc_lblGiraffes.gridx = 3;
		gbc_lblGiraffes.gridy = 4;
		panel_34.add(lblGiraffes, gbc_lblGiraffes);
		
		JLabel lblFeet = new JLabel("feet");
		GridBagConstraints gbc_lblFeet = new GridBagConstraints();
		gbc_lblFeet.insets = new Insets(0, 0, 0, 5);
		gbc_lblFeet.gridx = 4;
		gbc_lblFeet.gridy = 4;
		panel_34.add(lblFeet, gbc_lblFeet);
		
		JLabel lblSheep = new JLabel("sheep");
		GridBagConstraints gbc_lblSheep = new GridBagConstraints();
		gbc_lblSheep.insets = new Insets(0, 0, 0, 5);
		gbc_lblSheep.gridx = 5;
		gbc_lblSheep.gridy = 4;
		panel_34.add(lblSheep, gbc_lblSheep);
		
		JLabel lblSunglasses = new JLabel("sunglasses");
		GridBagConstraints gbc_lblSunglasses = new GridBagConstraints();
		gbc_lblSunglasses.gridx = 6;
		gbc_lblSunglasses.gridy = 4;
		panel_34.add(lblSunglasses, gbc_lblSunglasses);
		
		final JPanel Chapter2 = new JPanel();
		Chapter2.setBackground(new Color(204, 255, 204));
	    Chapter2.setPreferredSize(new Dimension(350, 460));
	    JScrollPane jScrollPane = new JScrollPane(Chapter2);
	    Chapter2.setLayout(new BorderLayout(0, 0));
	    
	    final JPanel panel_35 = new JPanel();
	    panel_35.setBackground(new Color(204, 255, 204));
	    Chapter2.add(panel_35);
	    panel_35.setLayout(card_1);
	    
	    JPanel panel_36 = new JPanel();
	    panel_36.setBackground(new Color(204, 255, 204));
	    panel_35.add(panel_36, "layout_1");
	    panel_36.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_37 = new JPanel();
	    panel_37.setBackground(new Color(153, 255, 153));
	    panel_36.add(panel_37, BorderLayout.NORTH);
	    
	    JLabel lblVerbs = new JLabel("VERBS");
	    lblVerbs.setBackground(new Color(204, 255, 204));
	    lblVerbs.setHorizontalAlignment(SwingConstants.CENTER);
	    lblVerbs.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_37.add(lblVerbs);
	    
	    JPanel panel_38 = new JPanel();
	    panel_38.setBackground(new Color(204, 255, 204));
	    panel_36.add(panel_38, BorderLayout.SOUTH);
	    panel_38.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnContinue_6 = new JButton("CONTINUE");
	    btnContinue_6.setBackground(new Color(153, 255, 153));
	    btnContinue_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_1.show(panel_35,"layout_2");
			}
	    });
	    panel_38.add(btnContinue_6, BorderLayout.EAST);
	    tabbedPane.addTab("Chapter 2", null, jScrollPane, null);
	    
	    JPanel panel_39 = new JPanel();
	    panel_39.setBackground(new Color(204, 255, 204));
	    panel_36.add(panel_39, BorderLayout.CENTER);
	    GridBagLayout gbl_panel_39 = new GridBagLayout();
	    gbl_panel_39.columnWidths = new int[]{0, 0, 0};
	    gbl_panel_39.rowHeights = new int[]{0, 0, 0};
	    gbl_panel_39.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
	    gbl_panel_39.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
	    panel_39.setLayout(gbl_panel_39);
	    
	    JLabel lblRegularVerb = new JLabel("REGULAR VERB");
	    lblRegularVerb.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblRegularVerb.setBackground(new Color(204, 255, 204));
	    GridBagConstraints gbc_lblRegularVerb = new GridBagConstraints();
	    gbc_lblRegularVerb.insets = new Insets(0, 0, 5, 5);
	    gbc_lblRegularVerb.gridx = 0;
	    gbc_lblRegularVerb.gridy = 0;
	    panel_39.add(lblRegularVerb, gbc_lblRegularVerb);
	    
	    JLabel lblIrregularVerb = new JLabel("IRREGULAR VERB");
	    lblIrregularVerb.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblIrregularVerb.setBackground(new Color(204, 255, 204));
	    GridBagConstraints gbc_lblIrregularVerb = new GridBagConstraints();
	    gbc_lblIrregularVerb.insets = new Insets(0, 0, 5, 0);
	    gbc_lblIrregularVerb.gridx = 1;
	    gbc_lblIrregularVerb.gridy = 0;
	    panel_39.add(lblIrregularVerb, gbc_lblIrregularVerb);
	    
	    JTextPane txtpnInEnglishSome = new JTextPane();
	    txtpnInEnglishSome.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    txtpnInEnglishSome.setEditable(false);
	    txtpnInEnglishSome.setBackground(new Color(204, 255, 204));
	    txtpnInEnglishSome.setText("In English some verbs are regular and others are irregular depending on how they change with a tense.In the Past Simple, regular verbs change by adding an -ed, -d, or -ied.\r\n\r\nIf the verb ends in a consonant, we add -ed.\r\neg. start - started , finish - finished , work - worked\r\n\r\nIf a verb ends in -e, we simply add -d.\r\neg. live - lived , create - created , phone - phoned\r\n\r\nIf a verb ends in a consonant + y, we change the y to -ied.\r\neg. study - studied , marry - married , try - tried\r\n\r\nIf the verb ends in a vowel + y, we just add -ed.\r\neg. play - played , stay - stayed\r\n\r\nIf a verb ends in a consonant + vowel + consonant, we double the last consonant and add -ed.\r\neg. stop - stopped , rob - robbed\r\n");
	    GridBagConstraints gbc_txtpnInEnglishSome = new GridBagConstraints();
	    gbc_txtpnInEnglishSome.insets = new Insets(0, 0, 0, 5);
	    gbc_txtpnInEnglishSome.fill = GridBagConstraints.BOTH;
	    gbc_txtpnInEnglishSome.gridx = 0;
	    gbc_txtpnInEnglishSome.gridy = 1;
	    panel_39.add(txtpnInEnglishSome, gbc_txtpnInEnglishSome);
	    
	    JTextPane txtpnThereAreNo = new JTextPane();
	    txtpnThereAreNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    txtpnThereAreNo.setEditable(false);
	    txtpnThereAreNo.setBackground(new Color(204, 255, 204));
	    txtpnThereAreNo.setText("There are no rules for irregular verbs! You must learn them!\r\n\r\nbreak, broke, broken\r\ncut, cut, cut\r\nrun, ran, run\r\nmeet, met, met\r\ncome, came, come\r\nrepay, repaid, repaid\r\nswim, swam, swum\r\nbe was/were been");
	    GridBagConstraints gbc_txtpnThereAreNo = new GridBagConstraints();
	    gbc_txtpnThereAreNo.fill = GridBagConstraints.BOTH;
	    gbc_txtpnThereAreNo.gridx = 1;
	    gbc_txtpnThereAreNo.gridy = 1;
	    panel_39.add(txtpnThereAreNo, gbc_txtpnThereAreNo);
	    
	    JPanel panel_44 = new JPanel();
	    panel_44.setBackground(new Color(204, 255, 204));
	    panel_35.add(panel_44, "layout_2");
	    panel_44.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_45 = new JPanel();
	    panel_45.setBorder(new LineBorder(new Color(0, 0, 0)));
	    panel_45.setBackground(new Color(153, 255, 153));
	    panel_44.add(panel_45, BorderLayout.NORTH);
	    
	    JLabel lblRegularVerbs = new JLabel("REGULAR VERBS");
	    lblRegularVerbs.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblRegularVerbs.setBackground(new Color(153, 255, 153));
	    panel_45.add(lblRegularVerbs);
	    
	    JPanel panel_46 = new JPanel();
	    panel_46.setBackground(new Color(204, 255, 204));
	    panel_44.add(panel_46, BorderLayout.SOUTH);
	    panel_46.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_8 = new JButton("BACK");
	    btnBack_8.setBackground(new Color(153, 255, 153));
	    btnBack_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_1.show(panel_35,"layout_1");
				}
		});
	    panel_46.add(btnBack_8, BorderLayout.WEST);
	    
	    JButton btnContinue_8 = new JButton("CONTINUE");
	    btnContinue_8.setBackground(new Color(153, 255, 153));
	    btnContinue_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_1.show(panel_35,"layout_3");
				}
		});
	    panel_46.add(btnContinue_8, BorderLayout.EAST);
	    btnBack_8.setPreferredSize(btnContinue_8.getPreferredSize());
	    
	    JPanel panel_47 = new JPanel();
	    panel_47.setBackground(new Color(204, 255, 204));
	    panel_44.add(panel_47, BorderLayout.CENTER);
	    panel_47.setLayout(new BorderLayout(0, 0));
	    
	    table_1 = new JTable();
	    table_1.setBackground(new Color(204, 255, 204));
	    table_1.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		{"Present Tense","Past Tense","Past Participle"},
	    		{"ask","asked","asked"},
	    		{"clean","cleaned","cleaned"},
	    		{"cook","cooked","cooked"},
	    		{"fill","filled","filled"},
	    		{"help","helped","helped"},
	    		{"laugh","laughed","laughed"},
	    		{"learn","learned","learned"},
	    		{"like","liked","liked"},
	    		{"live","lived","lived"},
	    		{"look","looked","looked"},
	    		{"open","opened","opened"},
	    		{"owe","owed","owed"},
	    		{"play","played","played"},
	    		{"receive","received","received"},
	    		{"show","showed","showed"},
	    		{"smoke","smoked","smoked"},
	    		{"stay","stayed","stayed"},
	    		{"talk","talked","talked"},
	    		{"translate","translated","translated"},
	    		{"use","used","used"},
	    		{"walk","walked","walked"},
	    		{"wash","washed","washed"},
	    	},
	    	new String[] {
	    		"Present Tense", "Past Tense","Past Participle"
	    	}
	    ));
	    panel_47.add(table_1, BorderLayout.CENTER);
	    
	    JPanel panel_40 = new JPanel();
	    panel_40.setBackground(new Color(204, 255, 204));
	    panel_35.add(panel_40, "layout_3");
	    panel_40.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_41 = new JPanel();
	    panel_41.setBackground(new Color(153, 255, 153));
	    panel_41.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    panel_40.add(panel_41, BorderLayout.NORTH);
	    
	    JLabel lblIrregularVerbs = new JLabel("IRREGULAR VERBS");
	    lblIrregularVerbs.setFont(new Font("Tahoma", Font.BOLD, 13));
	    panel_41.add(lblIrregularVerbs);
	    
	    JPanel panel_42 = new JPanel();
	    panel_40.add(panel_42, BorderLayout.CENTER);
	    panel_42.setLayout(new BorderLayout(0, 0));
	    
	    table = new JTable(3,96);
	    table.setBackground(new Color(204, 255, 204));
	    table.setBorder(new LineBorder(new Color(204, 255, 204), 1, true));
	    table.setPreferredScrollableViewportSize(new Dimension(400, 200));
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		{"Infinitive (Present)", "Simple Past Tense", "Past Participle"},
	    		{"am/is/are", "was/were", "been"},
	    		{"become", "became", "become"},
	    		{"come","came","come"},
	    		{"do","did","done"},
	    		{"draw","drew","drawn"},   		
	    		{"drive","drove","driven"},
	    		{"eat","ate","eaten"},
	    		{"feel","felt","felt"},
	    		{"fly","flew","flown"},
	    		{"forget","forgot","forgotten/forgot"},
	    		{"get","got","gotten/got"},
	    		{"have","had","had"},
	    		{"know","knew","known"},
	    		{"learn","learnt/learned","learnt/learned"},
	    		{"meet","met","met"},
	    		{"put","put","put"},
	    		{"quit","quit","quit"},
	    		{"read","read","read"},
	    		{"sleep","slept","slept"},
	    		{"speak","spoke","spoken"},
	    		{"swim","swam","swum"},
	    		{"take","took","taken"},
	    		{"understand","understood","understood"},
	    		{"write","wrote","written"},
    	},
	    	new String[] {
	    		"Infinitive (Present)", "Simple Past Tense", "Past Participle"
	    	}
	    ));
	    panel_42.add(table, BorderLayout.CENTER);
	    
	    JPanel panel_43 = new JPanel();
	    panel_43.setBackground(new Color(204, 255, 204));
	    panel_40.add(panel_43, BorderLayout.SOUTH);
	    panel_43.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_7 = new JButton("BACK");
	    btnBack_7.setBackground(new Color(153, 255, 153));
	    btnBack_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_1.show(panel_35,"layout_2");
				}
		});
	    panel_43.add(btnBack_7, BorderLayout.WEST);
	    
	    JPanel panel_48 = new JPanel();
	    tabbedPane.addTab("Chapter 3", null, panel_48, null);
	    panel_48.setLayout(new BorderLayout(0, 0));
	    
	    final JPanel panel_49 = new JPanel();
	    panel_48.add(panel_49);
	    panel_49.setLayout(card_2);
	    
	    JPanel panel_50 = new JPanel();
	    panel_49.add(panel_50, "layout_1");
	    panel_50.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_51 = new JPanel();
	    panel_51.setBackground(new Color(175, 238, 238));
	    panel_50.add(panel_51, BorderLayout.NORTH);
	    
	    JLabel lblCountableNouns = new JLabel("COUNTABLE NOUNS");
	    lblCountableNouns.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_51.add(lblCountableNouns);
	    
	    JPanel panel_52 = new JPanel();
	    panel_52.setBackground(new Color(224, 255, 255));
	    panel_50.add(panel_52, BorderLayout.SOUTH);
	    panel_52.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_9 = new JButton("BACK");
	    btnBack_9.setEnabled(false);
	    btnBack_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	    
	    btnBack_9.setBackground(new Color(175, 238, 238));
	    panel_52.add(btnBack_9, BorderLayout.WEST);
	    
	    JButton btnContinue_9 = new JButton("CONTINUE");
	    btnContinue_9.setBackground(new Color(175, 238, 238));
	    btnContinue_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_2.show(panel_49,"layout_2");
				}
		});
	    btnBack_9.setPreferredSize(btnContinue_9.getPreferredSize());
	    panel_52.add(btnContinue_9, BorderLayout.EAST);
	    
	    JPanel panel_53 = new JPanel();
	    panel_53.setBackground(new Color(224, 255, 255));
	    panel_50.add(panel_53, BorderLayout.CENTER);
	    panel_53.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_54 = new JPanel();
	    panel_53.add(panel_54, BorderLayout.NORTH);
	    panel_54.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane txtpnCountableNounsName = new JTextPane();
	    txtpnCountableNounsName.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    txtpnCountableNounsName.setEditable(false);
	    txtpnCountableNounsName.setBackground(new Color(224, 255, 255));
	    txtpnCountableNounsName.setText("Countable nouns name anything that we can count\r\nCountable nouns can be singular or plural\r\nYou can use some and any with countable nouns\r\nUse how many to ask questions\r\n");
	    panel_54.add(txtpnCountableNounsName);
	    
	    JPanel panel_55 = new JPanel();
	    panel_55.setBackground(new Color(224, 255, 255));
	    panel_53.add(panel_55, BorderLayout.SOUTH);
	    GridBagLayout gbl_panel_55 = new GridBagLayout();
	    gbl_panel_55.columnWidths = new int[]{0, 0, 0, 0, 0};
	    gbl_panel_55.rowHeights = new int[]{0, 0, 0, 0, 0};
	    gbl_panel_55.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    gbl_panel_55.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    panel_55.setLayout(gbl_panel_55);
	    
	    JLabel label_33 = new JLabel("");
	    label_33.setIcon(new ImageIcon("img/units/books.jpg"));
	    GridBagConstraints gbc_label_33 = new GridBagConstraints();
	    gbc_label_33.insets = new Insets(0, 0, 5, 5);
	    gbc_label_33.gridx = 0;
	    gbc_label_33.gridy = 1;
	    panel_55.add(label_33, gbc_label_33);
	    
	    JLabel label_34 = new JLabel("");
	    label_34.setIcon(new ImageIcon("img/units/bottles.jpg"));
	    GridBagConstraints gbc_label_34 = new GridBagConstraints();
	    gbc_label_34.insets = new Insets(0, 0, 5, 5);
	    gbc_label_34.gridx = 1;
	    gbc_label_34.gridy = 1;
	    panel_55.add(label_34, gbc_label_34);
	    
	    JLabel label_35 = new JLabel("");
	    label_35.setIcon(new ImageIcon("img/units/chairs.jpg"));
	    GridBagConstraints gbc_label_35 = new GridBagConstraints();
	    gbc_label_35.insets = new Insets(0, 0, 5, 5);
	    gbc_label_35.gridx = 2;
	    gbc_label_35.gridy = 1;
	    panel_55.add(label_35, gbc_label_35);
	    
	    JLabel label_36 = new JLabel("");
	    label_36.setIcon(new ImageIcon("img/units/ducks.jpg"));
	    GridBagConstraints gbc_label_36 = new GridBagConstraints();
	    gbc_label_36.insets = new Insets(0, 0, 5, 0);
	    gbc_label_36.gridx = 3;
	    gbc_label_36.gridy = 1;
	    panel_55.add(label_36, gbc_label_36);
	    
	    JLabel lblBooks = new JLabel("books");
	    GridBagConstraints gbc_lblBooks = new GridBagConstraints();
	    gbc_lblBooks.insets = new Insets(0, 0, 5, 5);
	    gbc_lblBooks.gridx = 0;
	    gbc_lblBooks.gridy = 2;
	    panel_55.add(lblBooks, gbc_lblBooks);
	    
	    JLabel lblBottles = new JLabel("bottles");
	    GridBagConstraints gbc_lblBottles = new GridBagConstraints();
	    gbc_lblBottles.insets = new Insets(0, 0, 5, 5);
	    gbc_lblBottles.gridx = 1;
	    gbc_lblBottles.gridy = 2;
	    panel_55.add(lblBottles, gbc_lblBottles);
	    
	    JLabel lblChairs = new JLabel("chairs");
	    GridBagConstraints gbc_lblChairs = new GridBagConstraints();
	    gbc_lblChairs.insets = new Insets(0, 0, 5, 5);
	    gbc_lblChairs.gridx = 2;
	    gbc_lblChairs.gridy = 2;
	    panel_55.add(lblChairs, gbc_lblChairs);
	    
	    JLabel lblDucks = new JLabel("ducks");
	    GridBagConstraints gbc_lblDucks = new GridBagConstraints();
	    gbc_lblDucks.insets = new Insets(0, 0, 5, 0);
	    gbc_lblDucks.gridx = 3;
	    gbc_lblDucks.gridy = 2;
	    panel_55.add(lblDucks, gbc_lblDucks);
	    
	    JLabel lblForExampleWe = new JLabel("For example, we can count...");
	    lblForExampleWe.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    panel_53.add(lblForExampleWe, BorderLayout.WEST);
	    
	    JPanel panel_56 = new JPanel();
	    panel_56.setBackground(new Color(224, 255, 255));
	    panel_49.add(panel_56, "layout_2");
	    panel_56.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_57 = new JPanel();
	    panel_57.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_57.setBackground(new Color(175, 238, 238));
	    panel_56.add(panel_57, BorderLayout.NORTH);
	    
	    JLabel lblUncountableNouns = new JLabel("UNCOUNTABLE NOUNS");
	    lblUncountableNouns.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_57.add(lblUncountableNouns);
	    
	    JPanel panel_58 = new JPanel();
	    panel_58.setBackground(new Color(224, 255, 255));
	    panel_56.add(panel_58, BorderLayout.SOUTH);
	    panel_58.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_10 = new JButton("BACK");
	    btnBack_10.setBackground(new Color(175, 238, 238));
		btnBack_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_2.show(panel_49,"layout_1");
				}
		});

	    panel_58.add(btnBack_10, BorderLayout.WEST);
	    
	    JButton btnContinue_10 = new JButton("CONTINUE");
	    btnContinue_10.setBackground(new Color(175, 238, 238));
	    btnBack_10.setPreferredSize(btnContinue_10.getPreferredSize());
	    panel_58.add(btnContinue_10, BorderLayout.EAST);
	    
	    JPanel panel_59 = new JPanel();
	    panel_59.setBackground(new Color(224, 255, 255));
	    panel_56.add(panel_59, BorderLayout.CENTER);
	    panel_59.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_60 = new JPanel();
	    panel_59.add(panel_60, BorderLayout.NORTH);
	    panel_60.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane txtpnUncountableNounsAre = new JTextPane();
	    txtpnUncountableNounsAre.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    txtpnUncountableNounsAre.setEditable(false);
	    txtpnUncountableNounsAre.setBackground(new Color(224, 255, 255));
	    txtpnUncountableNounsAre.setText("Uncountable nouns are words for things that we can't count\r\nUncountable nouns can only be singular\r\nYou can use some and any with uncountable nouns\r\nUse how much to ask questions\r\nUncountable nouns can be made countable ");
	    panel_60.add(txtpnUncountableNounsAre, BorderLayout.NORTH);
	    
	    JPanel panel_61 = new JPanel();
	    panel_61.setBackground(new Color(224, 255, 255));
	    panel_59.add(panel_61, BorderLayout.SOUTH);
	    GridBagLayout gbl_panel_61 = new GridBagLayout();
	    gbl_panel_61.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
	    gbl_panel_61.rowHeights = new int[]{0, 98, 23, 22, 0};
	    gbl_panel_61.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    gbl_panel_61.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    panel_61.setLayout(gbl_panel_61);
	    
	    JLabel label_37 = new JLabel("");
	    label_37.setIcon(new ImageIcon("img/units/bread.jpg"));
	    GridBagConstraints gbc_label_37 = new GridBagConstraints();
	    gbc_label_37.insets = new Insets(0, 0, 5, 5);
	    gbc_label_37.gridx = 0;
	    gbc_label_37.gridy = 1;
	    panel_61.add(label_37, gbc_label_37);
	    
	    JLabel label_38 = new JLabel("");
	    label_38.setIcon(new ImageIcon("img/units/snow.jpg"));
	    GridBagConstraints gbc_label_38 = new GridBagConstraints();
	    gbc_label_38.insets = new Insets(0, 0, 5, 5);
	    gbc_label_38.gridx = 1;
	    gbc_label_38.gridy = 1;
	    panel_61.add(label_38, gbc_label_38);
	    
	    JLabel label_39 = new JLabel("");
	    label_39.setIcon(new ImageIcon("img/units/chocolate.jpg"));
	    GridBagConstraints gbc_label_39 = new GridBagConstraints();
	    gbc_label_39.insets = new Insets(0, 0, 5, 5);
	    gbc_label_39.gridx = 2;
	    gbc_label_39.gridy = 1;
	    panel_61.add(label_39, gbc_label_39);
	    
	    JLabel label_40 = new JLabel("");
	    label_40.setIcon(new ImageIcon("img/units/love.jpg"));
	    GridBagConstraints gbc_label_40 = new GridBagConstraints();
	    gbc_label_40.insets = new Insets(0, 0, 5, 5);
	    gbc_label_40.gridx = 3;
	    gbc_label_40.gridy = 1;
	    panel_61.add(label_40, gbc_label_40);
	    
	    JLabel label_41 = new JLabel("");
	    label_41.setIcon(new ImageIcon("img/units/water.jpg"));
	    GridBagConstraints gbc_label_41 = new GridBagConstraints();
	    gbc_label_41.insets = new Insets(0, 0, 5, 0);
	    gbc_label_41.gridx = 4;
	    gbc_label_41.gridy = 1;
	    panel_61.add(label_41, gbc_label_41);
	    
	    JLabel lblBread = new JLabel("bread");
	    GridBagConstraints gbc_lblBread = new GridBagConstraints();
	    gbc_lblBread.insets = new Insets(0, 0, 0, 5);
	    gbc_lblBread.gridx = 0;
	    gbc_lblBread.gridy = 2;
	    panel_61.add(lblBread, gbc_lblBread);
	    
	    JLabel lblSnow = new JLabel("snow");
	    GridBagConstraints gbc_lblSnow = new GridBagConstraints();
	    gbc_lblSnow.insets = new Insets(0, 0, 0, 5);
	    gbc_lblSnow.gridx = 1;
	    gbc_lblSnow.gridy = 2;
	    panel_61.add(lblSnow, gbc_lblSnow);
	    
	    JLabel lblChocolate = new JLabel("chocolate");
	    GridBagConstraints gbc_lblChocolate = new GridBagConstraints();
	    gbc_lblChocolate.insets = new Insets(0, 0, 0, 5);
	    gbc_lblChocolate.gridx = 2;
	    gbc_lblChocolate.gridy = 2;
	    panel_61.add(lblChocolate, gbc_lblChocolate);
	    
	    JLabel lblLove = new JLabel("love");
	    GridBagConstraints gbc_lblLove = new GridBagConstraints();
	    gbc_lblLove.insets = new Insets(0, 0, 0, 5);
	    gbc_lblLove.gridx = 3;
	    gbc_lblLove.gridy = 2;
	    panel_61.add(lblLove, gbc_lblLove);
	    
	    JLabel lblWater = new JLabel("water");
	    GridBagConstraints gbc_lblWater = new GridBagConstraints();
	    gbc_lblWater.gridx = 4;
	    gbc_lblWater.gridy = 2;
	    panel_61.add(lblWater, gbc_lblWater);
	    
	    JLabel lblForExampleWe_1 = new JLabel("For example, we cannot count...");
	    lblForExampleWe_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    lblForExampleWe_1.setBackground(new Color(255, 255, 255));
	    panel_59.add(lblForExampleWe_1, BorderLayout.CENTER);
	    
	    final JPanel panel_68 = new JPanel();
	    panel_68.setBackground(new Color(255, 228, 181));
	    panel_68.setPreferredSize(new Dimension(350, 630));
	    JScrollPane jScrollPane_1 = new JScrollPane(panel_68);
	    panel_68.setLayout(new BorderLayout(0, 0));
	    
	    final JPanel panel_70 = new JPanel();
	    panel_70.setBackground(new Color(255, 228, 181));
	    panel_68.add(panel_70);
	    panel_70.setLayout(card_3);
	    
	    JPanel panel_62 = new JPanel();
	    panel_62.setBackground(new Color(255, 228, 181));
	    panel_70.add(panel_62, "layout_1");
	    panel_62.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_63 = new JPanel();
	    panel_63.setBackground(new Color(255, 228, 181));
	    panel_62.add(panel_63, BorderLayout.SOUTH);
	    panel_63.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_11 = new JButton("BACK");
	    btnBack_11.setBackground(new Color(244, 164, 96));
	    panel_63.add(btnBack_11, BorderLayout.WEST);
	    
	    JButton btnContinue_11 = new JButton("CONTINUE");
	    btnContinue_11.setBackground(new Color(244, 164, 96));
		btnContinue_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_3.show(panel_70,"layout_2");
				}
		});

	    btnBack_11.setPreferredSize(btnContinue_11.getPreferredSize());
	    panel_63.add(btnContinue_11, BorderLayout.EAST);
	    
	    JPanel panel_64 = new JPanel();
	    panel_64.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_64.setBackground(new Color(244, 164, 96));
	    panel_62.add(panel_64, BorderLayout.NORTH);
	    
	    JLabel lblCommonNouns = new JLabel("COMMON NOUNS");
	    lblCommonNouns.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblCommonNouns.setBackground(new Color(244, 164, 96));
	    panel_64.add(lblCommonNouns);
	    
	    JPanel panel_65 = new JPanel();
	    panel_65.setBackground(new Color(255, 228, 181));
	    panel_62.add(panel_65, BorderLayout.CENTER);
	    GridBagLayout gbl_panel_65 = new GridBagLayout();
	    gbl_panel_65.columnWidths = new int[]{0, 0};
	    gbl_panel_65.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_65.columnWeights = new double[]{1.0, Double.MIN_VALUE};
	    gbl_panel_65.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	    panel_65.setLayout(gbl_panel_65);
	    
	    txtCommonNounsNameany = new JTextField();
	    txtCommonNounsNameany.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    txtCommonNounsNameany.setEditable(false);
	    txtCommonNounsNameany.setBackground(new Color(255, 228, 181));
	    txtCommonNounsNameany.setText("Common nouns name any person, animal, place, thing or idea.Usually, they start with small letters.");
	    GridBagConstraints gbc_txtCommonNounsNameany = new GridBagConstraints();
	    gbc_txtCommonNounsNameany.insets = new Insets(0, 0, 5, 0);
	    gbc_txtCommonNounsNameany.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCommonNounsNameany.gridx = 0;
	    gbc_txtCommonNounsNameany.gridy = 0;
	    panel_65.add(txtCommonNounsNameany, gbc_txtCommonNounsNameany);
	    txtCommonNounsNameany.setColumns(10);
	    
	    JLabel lblNewLabel_22 = new JLabel("PEOPLE --> Some common nouns tell us what people do.");
	    lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    lblNewLabel_22.setHorizontalAlignment(SwingConstants.LEFT);
	    GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
	    gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_22.gridx = 0;
	    gbc_lblNewLabel_22.gridy = 1;
	    panel_65.add(lblNewLabel_22, gbc_lblNewLabel_22);
	    
	    JLabel lblNewLabel_23 = new JLabel("ANIMALS --> These common nouns are words for animals.");
	    lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
	    gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_23.gridx = 0;
	    gbc_lblNewLabel_23.gridy = 2;
	    panel_65.add(lblNewLabel_23, gbc_lblNewLabel_23);
	    
	    JLabel lblNewLabel_24 = new JLabel("PLACES --> These common nouns are words for places.\r\n");
	    lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
	    gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_24.gridx = 0;
	    gbc_lblNewLabel_24.gridy = 3;
	    panel_65.add(lblNewLabel_24, gbc_lblNewLabel_24);
	    
	    JLabel lblNewLabel_25 = new JLabel("THINGS --> These common nouns are words for things.");
	    lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
	    gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_25.gridx = 0;
	    gbc_lblNewLabel_25.gridy = 4;
	    panel_65.add(lblNewLabel_25, gbc_lblNewLabel_25);
	    
	    JPanel panel_66 = new JPanel();
	    panel_66.setBackground(new Color(255, 228, 181));
	    GridBagConstraints gbc_panel_66 = new GridBagConstraints();
	    gbc_panel_66.fill = GridBagConstraints.BOTH;
	    gbc_panel_66.gridx = 0;
	    gbc_panel_66.gridy = 5;
	    panel_65.add(panel_66, gbc_panel_66);
	    GridBagLayout gbl_panel_66 = new GridBagLayout();
	    gbl_panel_66.columnWidths = new int[]{0, 0, 0, 0};
	    gbl_panel_66.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_66.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
	    gbl_panel_66.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    panel_66.setLayout(gbl_panel_66);
	    
	    JLabel label_42 = new JLabel("");
	    label_42.setIcon(new ImageIcon("img/units/doctor.jpg"));
	    GridBagConstraints gbc_label_42 = new GridBagConstraints();
	    gbc_label_42.insets = new Insets(0, 0, 5, 5);
	    gbc_label_42.gridx = 0;
	    gbc_label_42.gridy = 0;
	    panel_66.add(label_42, gbc_label_42);
	    
	    JLabel label_43 = new JLabel("");
	    label_43.setIcon(new ImageIcon("img/units/farmer.jpg"));
	    GridBagConstraints gbc_label_43 = new GridBagConstraints();
	    gbc_label_43.insets = new Insets(0, 0, 5, 5);
	    gbc_label_43.gridx = 1;
	    gbc_label_43.gridy = 0;
	    panel_66.add(label_43, gbc_label_43);
	    
	    JLabel label_44 = new JLabel("");
	    label_44.setIcon(new ImageIcon("img/units/policeman.jpg"));
	    GridBagConstraints gbc_label_44 = new GridBagConstraints();
	    gbc_label_44.insets = new Insets(0, 0, 5, 0);
	    gbc_label_44.gridx = 2;
	    gbc_label_44.gridy = 0;
	    panel_66.add(label_44, gbc_label_44);
	    
	    JLabel lblDoctor = new JLabel("doctor");
	    GridBagConstraints gbc_lblDoctor = new GridBagConstraints();
	    gbc_lblDoctor.insets = new Insets(0, 0, 5, 5);
	    gbc_lblDoctor.gridx = 0;
	    gbc_lblDoctor.gridy = 1;
	    panel_66.add(lblDoctor, gbc_lblDoctor);
	    
	    JLabel lblFarmer = new JLabel("farmer");
	    GridBagConstraints gbc_lblFarmer = new GridBagConstraints();
	    gbc_lblFarmer.insets = new Insets(0, 0, 5, 5);
	    gbc_lblFarmer.gridx = 1;
	    gbc_lblFarmer.gridy = 1;
	    panel_66.add(lblFarmer, gbc_lblFarmer);
	    
	    JLabel lblPoliceman = new JLabel("policeman");
	    GridBagConstraints gbc_lblPoliceman = new GridBagConstraints();
	    gbc_lblPoliceman.insets = new Insets(0, 0, 5, 0);
	    gbc_lblPoliceman.gridx = 2;
	    gbc_lblPoliceman.gridy = 1;
	    panel_66.add(lblPoliceman, gbc_lblPoliceman);
	    
	    JLabel label_45 = new JLabel("");
	    label_45.setIcon(new ImageIcon("img/units/indir (3).jpg"));
	    GridBagConstraints gbc_label_45 = new GridBagConstraints();
	    gbc_label_45.insets = new Insets(0, 0, 5, 5);
	    gbc_label_45.gridx = 0;
	    gbc_label_45.gridy = 2;
	    panel_66.add(label_45, gbc_label_45);
	    
	    JLabel label_46 = new JLabel("");
	    label_46.setIcon(new ImageIcon("img/units/indir (5).jpg"));
	    GridBagConstraints gbc_label_46 = new GridBagConstraints();
	    gbc_label_46.insets = new Insets(0, 0, 5, 5);
	    gbc_label_46.gridx = 1;
	    gbc_label_46.gridy = 2;
	    panel_66.add(label_46, gbc_label_46);
	    
	    JLabel label_53 = new JLabel("");
	    label_53.setIcon(new ImageIcon("img/units/indir (2).jpg"));
	    GridBagConstraints gbc_label_53 = new GridBagConstraints();
	    gbc_label_53.insets = new Insets(0, 0, 5, 0);
	    gbc_label_53.gridx = 2;
	    gbc_label_53.gridy = 2;
	    panel_66.add(label_53, gbc_label_53);
	    
	    JLabel lblElephant = new JLabel("elephant");
	    GridBagConstraints gbc_lblElephant = new GridBagConstraints();
	    gbc_lblElephant.insets = new Insets(0, 0, 5, 0);
	    gbc_lblElephant.gridx = 2;
	    gbc_lblElephant.gridy = 3;
	    panel_66.add(lblElephant, gbc_lblElephant);
	    
	    JLabel lblBeach = new JLabel("beach");
	    GridBagConstraints gbc_lblBeach = new GridBagConstraints();
	    gbc_lblBeach.insets = new Insets(0, 0, 5, 5);
	    gbc_lblBeach.gridx = 0;
	    gbc_lblBeach.gridy = 5;
	    panel_66.add(lblBeach, gbc_lblBeach);
	    
	    JLabel lblBook = new JLabel("book");
	    GridBagConstraints gbc_lblBook = new GridBagConstraints();
	    gbc_lblBook.insets = new Insets(0, 0, 5, 5);
	    gbc_lblBook.gridx = 1;
	    gbc_lblBook.gridy = 7;
	    panel_66.add(lblBook, gbc_lblBook);
	    
	    JLabel label_52 = new JLabel("");
	    label_52.setIcon(new ImageIcon("img/units/indir (6).jpg"));
	    GridBagConstraints gbc_label_52 = new GridBagConstraints();
	    gbc_label_52.insets = new Insets(0, 0, 5, 5);
	    gbc_label_52.gridx = 1;
	    gbc_label_52.gridy = 6;
	    panel_66.add(label_52, gbc_label_52);
	    
	    JLabel lblDress = new JLabel("dress");
	    GridBagConstraints gbc_lblDress = new GridBagConstraints();
	    gbc_lblDress.insets = new Insets(0, 0, 5, 0);
	    gbc_lblDress.gridx = 2;
	    gbc_lblDress.gridy = 7;
	    panel_66.add(lblDress, gbc_lblDress);
	    
	    JLabel label_51 = new JLabel("");
	    label_51.setIcon(new ImageIcon("img/units/dress.jpg"));
	    GridBagConstraints gbc_label_51 = new GridBagConstraints();
	    gbc_label_51.insets = new Insets(0, 0, 5, 0);
	    gbc_label_51.gridx = 2;
	    gbc_label_51.gridy = 6;
	    panel_66.add(label_51, gbc_label_51);
	    
	    JLabel lblRestaurant = new JLabel("restaurant");
	    GridBagConstraints gbc_lblRestaurant = new GridBagConstraints();
	    gbc_lblRestaurant.insets = new Insets(0, 0, 5, 0);
	    gbc_lblRestaurant.gridx = 2;
	    gbc_lblRestaurant.gridy = 5;
	    panel_66.add(lblRestaurant, gbc_lblRestaurant);
	    
	    JLabel label_50 = new JLabel("");
	    label_50.setIcon(new ImageIcon("img/units/restaurant.jpg"));
	    GridBagConstraints gbc_label_50 = new GridBagConstraints();
	    gbc_label_50.insets = new Insets(0, 0, 5, 0);
	    gbc_label_50.gridx = 2;
	    gbc_label_50.gridy = 4;
	    panel_66.add(label_50, gbc_label_50);
	    
	    JLabel lblCity = new JLabel("city");
	    GridBagConstraints gbc_lblCity = new GridBagConstraints();
	    gbc_lblCity.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCity.gridx = 1;
	    gbc_lblCity.gridy = 5;
	    panel_66.add(lblCity, gbc_lblCity);
	    
	    JLabel label_49 = new JLabel("");
	    label_49.setIcon(new ImageIcon("img/units/city.png"));
	    GridBagConstraints gbc_label_49 = new GridBagConstraints();
	    gbc_label_49.insets = new Insets(0, 0, 5, 5);
	    gbc_label_49.gridx = 1;
	    gbc_label_49.gridy = 4;
	    panel_66.add(label_49, gbc_label_49);
	    
	    JLabel lblSock = new JLabel("sock");
	    GridBagConstraints gbc_lblSock = new GridBagConstraints();
	    gbc_lblSock.insets = new Insets(0, 0, 5, 5);
	    gbc_lblSock.gridx = 0;
	    gbc_lblSock.gridy = 7;
	    panel_66.add(lblSock, gbc_lblSock);
	    
	    JLabel label_48 = new JLabel("");
	    label_48.setIcon(new ImageIcon("img/units/images (3).jpg"));
	    GridBagConstraints gbc_label_48 = new GridBagConstraints();
	    gbc_label_48.insets = new Insets(0, 0, 5, 5);
	    gbc_label_48.gridx = 0;
	    gbc_label_48.gridy = 6;
	    panel_66.add(label_48, gbc_label_48);
	    
	    JLabel label_47 = new JLabel("");
	    label_47.setIcon(new ImageIcon("img/units/þbeach.jpg"));
	    GridBagConstraints gbc_label_47 = new GridBagConstraints();
	    gbc_label_47.insets = new Insets(0, 0, 5, 5);
	    gbc_label_47.gridx = 0;
	    gbc_label_47.gridy = 4;
	    panel_66.add(label_47, gbc_label_47);
	    
	    JLabel lblBear = new JLabel("bear");
	    GridBagConstraints gbc_lblBear = new GridBagConstraints();
	    gbc_lblBear.insets = new Insets(0, 0, 5, 5);
	    gbc_lblBear.gridx = 0;
	    gbc_lblBear.gridy = 3;
	    panel_66.add(lblBear, gbc_lblBear);
	    
	    JLabel lblOwl = new JLabel("owl");
	    GridBagConstraints gbc_lblOwl = new GridBagConstraints();
	    gbc_lblOwl.insets = new Insets(0, 0, 5, 5);
	    gbc_lblOwl.gridx = 1;
	    gbc_lblOwl.gridy = 3;
	    panel_66.add(lblOwl, gbc_lblOwl);
	    
	    JLabel label_54 = new JLabel("");
	    label_54.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\units\\beach.jpg"));
	    GridBagConstraints gbc_label_54 = new GridBagConstraints();
	    gbc_label_54.insets = new Insets(0, 0, 0, 5);
	    gbc_label_54.gridx = 0;
	    gbc_label_54.gridy = 4;
	    panel_66.add(label_54, gbc_label_54);
	    
	    JPanel panel_67 = new JPanel();
	    panel_70.add(panel_67, "layout_2");
	    panel_67.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_69 = new JPanel();
	    panel_69.setBackground(new Color(255, 228, 181));
	    panel_67.add(panel_69, BorderLayout.SOUTH);
	    panel_69.setLayout(new BorderLayout(0, 0));
	    
	    JButton btnBack_12 = new JButton("BACK");
	    btnBack_12.setBackground(new Color(244, 164, 96));
		btnBack_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_3.show(panel_70,"layout_1");
				}
		});
	    panel_69.add(btnBack_12, BorderLayout.WEST);
	    
	    JButton btnContinue_12 = new JButton("CONTINUE");
	    btnContinue_12.setBackground(new Color(244, 164, 96));
	    btnBack_12.setPreferredSize(btnContinue_12.getPreferredSize());
	    panel_69.add(btnContinue_12, BorderLayout.EAST);
	    
	    JPanel panel_71 = new JPanel();
	    panel_71.setBackground(new Color(244, 164, 96));
	    panel_67.add(panel_71, BorderLayout.NORTH);
	    
	    JLabel lblProperNouns = new JLabel("PROPER NOUNS");
	    lblProperNouns.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_71.add(lblProperNouns);
	    
	    JPanel panel_72 = new JPanel();
	    panel_72.setBackground(new Color(255, 228, 181));
	    panel_67.add(panel_72, BorderLayout.CENTER);
	    GridBagLayout gbl_panel_72 = new GridBagLayout();
	    gbl_panel_72.columnWidths = new int[]{0, 0};
	    gbl_panel_72.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_72.columnWeights = new double[]{1.0, Double.MIN_VALUE};
	    gbl_panel_72.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	    panel_72.setLayout(gbl_panel_72);
	    
	    txtProperNounsName = new JTextField();
	    txtProperNounsName.setEditable(false);
	    txtProperNounsName.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    txtProperNounsName.setBackground(new Color(255, 228, 181));
	    txtProperNounsName.setText("Proper nouns name specific people, places, things and ideas.They begin with capital letters.");
	    GridBagConstraints gbc_txtProperNounsName = new GridBagConstraints();
	    gbc_txtProperNounsName.insets = new Insets(0, 0, 5, 0);
	    gbc_txtProperNounsName.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtProperNounsName.gridx = 0;
	    gbc_txtProperNounsName.gridy = 0;
	    panel_72.add(txtProperNounsName, gbc_txtProperNounsName);
	    txtProperNounsName.setColumns(10);
	    
	    JLabel lblNamesOfPeople = new JLabel("Names of people --> The names of particular people are proper nouns.");
	    lblNamesOfPeople.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNamesOfPeople = new GridBagConstraints();
	    gbc_lblNamesOfPeople.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNamesOfPeople.gridx = 0;
	    gbc_lblNamesOfPeople.gridy = 1;
	    panel_72.add(lblNamesOfPeople, gbc_lblNamesOfPeople);
	    
	    JLabel lblNewLabel_26 = new JLabel("Days, months, holidays --> The names of days,months and holidays are proper nouns too.");
	    lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
	    gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_26.gridx = 0;
	    gbc_lblNewLabel_26.gridy = 2;
	    panel_72.add(lblNewLabel_26, gbc_lblNewLabel_26);
	    
	    JLabel lblNewLabel_27 = new JLabel("Countries and cities --> The names of countries and cities are also proper nouns.");
	    lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
	    gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_27.gridx = 0;
	    gbc_lblNewLabel_27.gridy = 3;
	    panel_72.add(lblNewLabel_27, gbc_lblNewLabel_27);
	    
	    JLabel lblNewLabel_28 = new JLabel("Famous places and buildings --> The names of famous places and buildings are proper nouns.");
	    lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
	    gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNewLabel_28.gridx = 0;
	    gbc_lblNewLabel_28.gridy = 4;
	    panel_72.add(lblNewLabel_28, gbc_lblNewLabel_28);
	    
	    JLabel lblExamples = new JLabel("Examples");
	    lblExamples.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    lblExamples.setHorizontalAlignment(SwingConstants.LEFT);
	    GridBagConstraints gbc_lblExamples = new GridBagConstraints();
	    gbc_lblExamples.insets = new Insets(0, 0, 5, 0);
	    gbc_lblExamples.gridx = 0;
	    gbc_lblExamples.gridy = 5;
	    panel_72.add(lblExamples, gbc_lblExamples);
	    
	    JPanel panel_73 = new JPanel();
	    panel_73.setBackground(new Color(255, 228, 181));
	    GridBagConstraints gbc_panel_73 = new GridBagConstraints();
	    gbc_panel_73.fill = GridBagConstraints.BOTH;
	    gbc_panel_73.gridx = 0;
	    gbc_panel_73.gridy = 6;
	    panel_72.add(panel_73, gbc_panel_73);
	    GridBagLayout gbl_panel_73 = new GridBagLayout();
	    gbl_panel_73.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_73.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_73.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    gbl_panel_73.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    panel_73.setLayout(gbl_panel_73);
	    
	    JLabel lblMustafaKemalAtatrk = new JLabel("Mustafa Kemal Atat\u00FCrk");
	    GridBagConstraints gbc_lblMustafaKemalAtatrk = new GridBagConstraints();
	    gbc_lblMustafaKemalAtatrk.insets = new Insets(0, 0, 5, 5);
	    gbc_lblMustafaKemalAtatrk.gridx = 0;
	    gbc_lblMustafaKemalAtatrk.gridy = 0;
	    panel_73.add(lblMustafaKemalAtatrk, gbc_lblMustafaKemalAtatrk);
	    
	    JLabel lblAlbertEinstein = new JLabel("Albert Einstein");
	    GridBagConstraints gbc_lblAlbertEinstein = new GridBagConstraints();
	    gbc_lblAlbertEinstein.insets = new Insets(0, 0, 5, 5);
	    gbc_lblAlbertEinstein.gridx = 3;
	    gbc_lblAlbertEinstein.gridy = 0;
	    panel_73.add(lblAlbertEinstein, gbc_lblAlbertEinstein);
	    
	    JLabel lblNapoleonBonaparte = new JLabel("Napoleon Bonaparte");
	    GridBagConstraints gbc_lblNapoleonBonaparte = new GridBagConstraints();
	    gbc_lblNapoleonBonaparte.insets = new Insets(0, 0, 5, 0);
	    gbc_lblNapoleonBonaparte.gridx = 6;
	    gbc_lblNapoleonBonaparte.gridy = 0;
	    panel_73.add(lblNapoleonBonaparte, gbc_lblNapoleonBonaparte);
	    
	    JLabel lblMonday = new JLabel("monday");
	    GridBagConstraints gbc_lblMonday = new GridBagConstraints();
	    gbc_lblMonday.insets = new Insets(0, 0, 5, 5);
	    gbc_lblMonday.gridx = 0;
	    gbc_lblMonday.gridy = 1;
	    panel_73.add(lblMonday, gbc_lblMonday);
	    
	    JLabel lblFriday = new JLabel("friday");
	    GridBagConstraints gbc_lblFriday = new GridBagConstraints();
	    gbc_lblFriday.insets = new Insets(0, 0, 5, 5);
	    gbc_lblFriday.gridx = 1;
	    gbc_lblFriday.gridy = 1;
	    panel_73.add(lblFriday, gbc_lblFriday);
	    
	    JLabel lblMarch = new JLabel("march");
	    GridBagConstraints gbc_lblMarch = new GridBagConstraints();
	    gbc_lblMarch.insets = new Insets(0, 0, 5, 5);
	    gbc_lblMarch.gridx = 2;
	    gbc_lblMarch.gridy = 1;
	    panel_73.add(lblMarch, gbc_lblMarch);
	    
	    JLabel lblAugust = new JLabel("august");
	    GridBagConstraints gbc_lblAugust = new GridBagConstraints();
	    gbc_lblAugust.insets = new Insets(0, 0, 5, 5);
	    gbc_lblAugust.gridx = 3;
	    gbc_lblAugust.gridy = 1;
	    panel_73.add(lblAugust, gbc_lblAugust);
	    
	    JLabel lblChristmas = new JLabel("christmas");
	    GridBagConstraints gbc_lblChristmas = new GridBagConstraints();
	    gbc_lblChristmas.insets = new Insets(0, 0, 5, 5);
	    gbc_lblChristmas.gridx = 4;
	    gbc_lblChristmas.gridy = 1;
	    panel_73.add(lblChristmas, gbc_lblChristmas);
	    
	    JLabel lblHallowen = new JLabel("hallowen");
	    GridBagConstraints gbc_lblHallowen = new GridBagConstraints();
	    gbc_lblHallowen.insets = new Insets(0, 0, 5, 5);
	    gbc_lblHallowen.gridx = 5;
	    gbc_lblHallowen.gridy = 1;
	    panel_73.add(lblHallowen, gbc_lblHallowen);
	    
	    JLabel lblEaster = new JLabel("easter");
	    GridBagConstraints gbc_lblEaster = new GridBagConstraints();
	    gbc_lblEaster.insets = new Insets(0, 0, 5, 0);
	    gbc_lblEaster.gridx = 6;
	    gbc_lblEaster.gridy = 1;
	    panel_73.add(lblEaster, gbc_lblEaster);
	    
	    JLabel lblTurkey = new JLabel("Turkey");
	    GridBagConstraints gbc_lblTurkey = new GridBagConstraints();
	    gbc_lblTurkey.insets = new Insets(0, 0, 5, 5);
	    gbc_lblTurkey.gridx = 0;
	    gbc_lblTurkey.gridy = 2;
	    panel_73.add(lblTurkey, gbc_lblTurkey);
	    
	    JLabel lblSaharaDesert = new JLabel("Sahara Desert");
	    GridBagConstraints gbc_lblSaharaDesert = new GridBagConstraints();
	    gbc_lblSaharaDesert.insets = new Insets(0, 0, 5, 5);
	    gbc_lblSaharaDesert.gridx = 0;
	    gbc_lblSaharaDesert.gridy = 3;
	    panel_73.add(lblSaharaDesert, gbc_lblSaharaDesert);
	    tabbedPane.addTab("Chapter 4", null, jScrollPane_1, null);
	    
	    final JPanel Chapter5 = new JPanel();
	    Chapter5.setBackground(new Color(72, 209, 204));
	    Chapter5.setMaximumSize(new Dimension(32767, 42767));
	    Chapter5.setPreferredSize(new Dimension(350, 500));
	    JScrollPane jScrollPane_2 = new JScrollPane(Chapter5);
	    tabbedPane.addTab("Chapter 5", null, jScrollPane_2, null);
	    Chapter5.setLayout(null);
	    
	    JTextPane txtpnBeIsA = new JTextPane();
	    txtpnBeIsA.setBounds(40, 29, 626, 471);
	    txtpnBeIsA.setEditable(false);
	    txtpnBeIsA.setBackground(new Color(72, 209, 204));
	    txtpnBeIsA.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    txtpnBeIsA.setText("BE is a very important verb!\r\nIt says what I am, what you are or what something is.\r\n\r\nPERSONAL PRONOUNS\r\n\r\nPronouns replace nouns.They are usually short words.\r\nThere are several types of pronouns.\r\n\r\nThe words I,you,he,she,it,we,they are called personal pronouns.\r\n\r\nWe use them in place of the nouns representing people,animal,places or things.\r\n\r\nExample=\r\n\r\nI am Tom.\t\t\t\t\r\nThey are friends.\t\t\t\t\t\r\nIt is not grey.\t\t\t\t\t\t\t\r\nI'm not fifteen years old.\r\nWho are you?\r\nWhat is it?\r\nWhen is your birthday?\r\nHow are you?\r\n\r\n\r\nSingular = I, you,he,she,it\r\nPlural = we, you, they");
	   
	    Chapter5.add(txtpnBeIsA);
	    
	    JPanel panel_74 = new JPanel();
	    panel_74.setBounds(0, 0, 626, 29);
	    panel_74.setBackground(new Color(100, 149, 237));
	    Chapter5.add(panel_74);
	    
	    JLabel lblBe = new JLabel("BE");
	    lblBe.setFont(new Font("Tahoma", Font.BOLD, 15));
	    panel_74.add(lblBe);
	    
	    JPanel panel_75 = new JPanel();
	    panel_75.setBackground(new Color(255, 182, 193));
	    tabbedPane.addTab("Chapter 6", null, panel_75, null);
	    GridBagLayout gbl_panel_75 = new GridBagLayout();
	    gbl_panel_75.columnWidths = new int[]{89, 537, 0};
	    gbl_panel_75.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    gbl_panel_75.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
	    gbl_panel_75.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	    panel_75.setLayout(gbl_panel_75);
	    
	    JLabel lblHaveGothasGot = new JLabel("HAVE GOT/HAS GOT");
	    lblHaveGothasGot.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblHaveGothasGot = new GridBagConstraints();
	    gbc_lblHaveGothasGot.anchor = GridBagConstraints.EAST;
	    gbc_lblHaveGothasGot.insets = new Insets(0, 0, 5, 5);
	    gbc_lblHaveGothasGot.gridx = 0;
	    gbc_lblHaveGothasGot.gridy = 0;
	    panel_75.add(lblHaveGothasGot, gbc_lblHaveGothasGot);
	    
	    txtWeUseIt = new JTextField();
	    txtWeUseIt.setEditable(false);
	    txtWeUseIt.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtWeUseIt.setBackground(new Color(255, 228, 225));
	    txtWeUseIt.setText("We use it to say that something belongs to someone.");
	    GridBagConstraints gbc_txtWeUseIt = new GridBagConstraints();
	    gbc_txtWeUseIt.insets = new Insets(0, 0, 5, 0);
	    gbc_txtWeUseIt.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtWeUseIt.gridx = 1;
	    gbc_txtWeUseIt.gridy = 0;
	    panel_75.add(txtWeUseIt, gbc_txtWeUseIt);
	    txtWeUseIt.setColumns(10);
	    
	    JLabel lblCancant = new JLabel("CAN/CAN'T");
	    lblCancant.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblCancant = new GridBagConstraints();
	    gbc_lblCancant.anchor = GridBagConstraints.EAST;
	    gbc_lblCancant.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCancant.gridx = 0;
	    gbc_lblCancant.gridy = 1;
	    panel_75.add(lblCancant, gbc_lblCancant);
	    
	    txtItIsOne = new JTextField();
	    txtItIsOne.setEditable(false);
	    txtItIsOne.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne.setBackground(new Color(255, 228, 225));
	    txtItIsOne.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne = new GridBagConstraints();
	    gbc_txtItIsOne.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne.gridx = 1;
	    gbc_txtItIsOne.gridy = 1;
	    panel_75.add(txtItIsOne, gbc_txtItIsOne);
	    txtItIsOne.setColumns(10);
	    
	    JLabel lblMustmustnt = new JLabel("MUST/MUSTN'T");
	    lblMustmustnt.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblMustmustnt = new GridBagConstraints();
	    gbc_lblMustmustnt.anchor = GridBagConstraints.EAST;
	    gbc_lblMustmustnt.insets = new Insets(0, 0, 5, 5);
	    gbc_lblMustmustnt.gridx = 0;
	    gbc_lblMustmustnt.gridy = 2;
	    panel_75.add(lblMustmustnt, gbc_lblMustmustnt);
	    
	    txtItIsOne_1 = new JTextField();
	    txtItIsOne_1.setEditable(false);
	    txtItIsOne_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne_1.setBackground(new Color(255, 228, 225));
	    txtItIsOne_1.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne_1 = new GridBagConstraints();
	    gbc_txtItIsOne_1.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne_1.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne_1.gridx = 1;
	    gbc_txtItIsOne_1.gridy = 2;
	    panel_75.add(txtItIsOne_1, gbc_txtItIsOne_1);
	    txtItIsOne_1.setColumns(10);
	    
	    JLabel lblMaymayNot = new JLabel("MAY/MAY NOT");
	    lblMaymayNot.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblMaymayNot = new GridBagConstraints();
	    gbc_lblMaymayNot.insets = new Insets(0, 0, 5, 5);
	    gbc_lblMaymayNot.anchor = GridBagConstraints.EAST;
	    gbc_lblMaymayNot.gridx = 0;
	    gbc_lblMaymayNot.gridy = 3;
	    panel_75.add(lblMaymayNot, gbc_lblMaymayNot);
	    
	    txtItIsOne_2 = new JTextField();
	    txtItIsOne_2.setEditable(false);
	    txtItIsOne_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne_2.setBackground(new Color(255, 228, 225));
	    txtItIsOne_2.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne_2 = new GridBagConstraints();
	    gbc_txtItIsOne_2.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne_2.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne_2.gridx = 1;
	    gbc_txtItIsOne_2.gridy = 3;
	    panel_75.add(txtItIsOne_2, gbc_txtItIsOne_2);
	    txtItIsOne_2.setColumns(10);
	    
	    JLabel lblShould = new JLabel("SHOULD");
	    lblShould.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblShould = new GridBagConstraints();
	    gbc_lblShould.anchor = GridBagConstraints.EAST;
	    gbc_lblShould.insets = new Insets(0, 0, 5, 5);
	    gbc_lblShould.gridx = 0;
	    gbc_lblShould.gridy = 4;
	    panel_75.add(lblShould, gbc_lblShould);
	    
	    txtItIsOne_3 = new JTextField();
	    txtItIsOne_3.setEditable(false);
	    txtItIsOne_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne_3.setBackground(new Color(255, 228, 225));
	    txtItIsOne_3.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne_3 = new GridBagConstraints();
	    gbc_txtItIsOne_3.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne_3.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne_3.gridx = 1;
	    gbc_txtItIsOne_3.gridy = 4;
	    panel_75.add(txtItIsOne_3, gbc_txtItIsOne_3);
	    txtItIsOne_3.setColumns(10);
	    
	    JLabel lblWould = new JLabel("WOULD");
	    lblWould.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblWould = new GridBagConstraints();
	    gbc_lblWould.anchor = GridBagConstraints.EAST;
	    gbc_lblWould.insets = new Insets(0, 0, 5, 5);
	    gbc_lblWould.gridx = 0;
	    gbc_lblWould.gridy = 5;
	    panel_75.add(lblWould, gbc_lblWould);
	    
	    txtItIsOne_4 = new JTextField();
	    txtItIsOne_4.setEditable(false);
	    txtItIsOne_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne_4.setBackground(new Color(255, 228, 225));
	    txtItIsOne_4.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne_4 = new GridBagConstraints();
	    gbc_txtItIsOne_4.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne_4.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne_4.gridx = 1;
	    gbc_txtItIsOne_4.gridy = 5;
	    panel_75.add(txtItIsOne_4, gbc_txtItIsOne_4);
	    txtItIsOne_4.setColumns(10);
	    
	    JLabel lblCould = new JLabel("COULD");
	    lblCould.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblCould = new GridBagConstraints();
	    gbc_lblCould.anchor = GridBagConstraints.EAST;
	    gbc_lblCould.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCould.gridx = 0;
	    gbc_lblCould.gridy = 6;
	    panel_75.add(lblCould, gbc_lblCould);
	    
	    txtItIsOne_5 = new JTextField();
	    txtItIsOne_5.setEditable(false);
	    txtItIsOne_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItIsOne_5.setBackground(new Color(255, 228, 225));
	    txtItIsOne_5.setText("It is one of the most commonly used modal verbs.");
	    GridBagConstraints gbc_txtItIsOne_5 = new GridBagConstraints();
	    gbc_txtItIsOne_5.insets = new Insets(0, 0, 5, 0);
	    gbc_txtItIsOne_5.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItIsOne_5.gridx = 1;
	    gbc_txtItIsOne_5.gridy = 6;
	    panel_75.add(txtItIsOne_5, gbc_txtItIsOne_5);
	    txtItIsOne_5.setColumns(10);
	    
	    JLabel lblExample = new JLabel("Example:");
	    lblExample.setFont(new Font("Tahoma", Font.BOLD, 13));
	    GridBagConstraints gbc_lblExample = new GridBagConstraints();
	    gbc_lblExample.insets = new Insets(0, 0, 5, 5);
	    gbc_lblExample.gridx = 0;
	    gbc_lblExample.gridy = 7;
	    panel_75.add(lblExample, gbc_lblExample);
	    
	    JPanel panel_76 = new JPanel();
	    panel_76.setBackground(new Color(255, 182, 193));
	    GridBagConstraints gbc_panel_76 = new GridBagConstraints();
	    gbc_panel_76.fill = GridBagConstraints.BOTH;
	    gbc_panel_76.gridx = 1;
	    gbc_panel_76.gridy = 8;
	    panel_75.add(panel_76, gbc_panel_76);
	    GridBagLayout gbl_panel_76 = new GridBagLayout();
	    gbl_panel_76.columnWidths = new int[]{280, 280, 0};
	    gbl_panel_76.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
	    gbl_panel_76.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
	    gbl_panel_76.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    panel_76.setLayout(gbl_panel_76);
	    
	    txtIHaveGot = new JTextField();
	    txtIHaveGot.setEditable(false);
	    txtIHaveGot.setBackground(new Color(255, 228, 225));
	    txtIHaveGot.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtIHaveGot.setText("I have got a car.");
	    GridBagConstraints gbc_txtIHaveGot = new GridBagConstraints();
	    gbc_txtIHaveGot.insets = new Insets(0, 0, 5, 5);
	    gbc_txtIHaveGot.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtIHaveGot.gridx = 0;
	    gbc_txtIHaveGot.gridy = 0;
	    panel_76.add(txtIHaveGot, gbc_txtIHaveGot);
	    txtIHaveGot.setColumns(10);
	    
	    txtSheHasGot = new JTextField();
	    txtSheHasGot.setEditable(false);
	    txtSheHasGot.setBackground(new Color(255, 228, 225));
	    txtSheHasGot.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtSheHasGot.setText("She has got blue eyes.");
	    GridBagConstraints gbc_txtSheHasGot = new GridBagConstraints();
	    gbc_txtSheHasGot.insets = new Insets(0, 0, 5, 0);
	    gbc_txtSheHasGot.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtSheHasGot.gridx = 1;
	    gbc_txtSheHasGot.gridy = 0;
	    panel_76.add(txtSheHasGot, gbc_txtSheHasGot);
	    txtSheHasGot.setColumns(10);
	    
	    txtHeCanSpeak = new JTextField();
	    txtHeCanSpeak.setEditable(false);
	    txtHeCanSpeak.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtHeCanSpeak.setBackground(new Color(255, 228, 225));
	    txtHeCanSpeak.setText("He can speak English.");
	    GridBagConstraints gbc_txtHeCanSpeak = new GridBagConstraints();
	    gbc_txtHeCanSpeak.insets = new Insets(0, 0, 5, 5);
	    gbc_txtHeCanSpeak.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtHeCanSpeak.gridx = 0;
	    gbc_txtHeCanSpeak.gridy = 1;
	    panel_76.add(txtHeCanSpeak, gbc_txtHeCanSpeak);
	    txtHeCanSpeak.setColumns(10);
	    
	    txtYouCantSmoke = new JTextField();
	    txtYouCantSmoke.setEditable(false);
	    txtYouCantSmoke.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtYouCantSmoke.setBackground(new Color(255, 228, 225));
	    txtYouCantSmoke.setText("You can't smoke here.");
	    GridBagConstraints gbc_txtYouCantSmoke = new GridBagConstraints();
	    gbc_txtYouCantSmoke.insets = new Insets(0, 0, 5, 0);
	    gbc_txtYouCantSmoke.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtYouCantSmoke.gridx = 1;
	    gbc_txtYouCantSmoke.gridy = 1;
	    panel_76.add(txtYouCantSmoke, gbc_txtYouCantSmoke);
	    txtYouCantSmoke.setColumns(10);
	    
	    txtMustYouLeave = new JTextField();
	    txtMustYouLeave.setEditable(false);
	    txtMustYouLeave.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtMustYouLeave.setBackground(new Color(255, 228, 225));
	    txtMustYouLeave.setText("Must you leave so soon?");
	    GridBagConstraints gbc_txtMustYouLeave = new GridBagConstraints();
	    gbc_txtMustYouLeave.insets = new Insets(0, 0, 5, 5);
	    gbc_txtMustYouLeave.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtMustYouLeave.gridx = 0;
	    gbc_txtMustYouLeave.gridy = 2;
	    panel_76.add(txtMustYouLeave, gbc_txtMustYouLeave);
	    txtMustYouLeave.setColumns(10);
	    
	    txtWeMustCall = new JTextField();
	    txtWeMustCall.setEditable(false);
	    txtWeMustCall.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtWeMustCall.setBackground(new Color(255, 228, 225));
	    txtWeMustCall.setText("We must call the police.");
	    GridBagConstraints gbc_txtWeMustCall = new GridBagConstraints();
	    gbc_txtWeMustCall.insets = new Insets(0, 0, 5, 0);
	    gbc_txtWeMustCall.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtWeMustCall.gridx = 1;
	    gbc_txtWeMustCall.gridy = 2;
	    panel_76.add(txtWeMustCall, gbc_txtWeMustCall);
	    txtWeMustCall.setColumns(10);
	    
	    txtItMayRain = new JTextField();
	    txtItMayRain.setEditable(false);
	    txtItMayRain.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtItMayRain.setBackground(new Color(255, 228, 225));
	    txtItMayRain.setText("It may rain today.");
	    GridBagConstraints gbc_txtItMayRain = new GridBagConstraints();
	    gbc_txtItMayRain.insets = new Insets(0, 0, 5, 5);
	    gbc_txtItMayRain.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtItMayRain.gridx = 0;
	    gbc_txtItMayRain.gridy = 3;
	    panel_76.add(txtItMayRain, gbc_txtItMayRain);
	    txtItMayRain.setColumns(10);
	    
	    txtMayGodBe = new JTextField();
	    txtMayGodBe.setEditable(false);
	    txtMayGodBe.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtMayGodBe.setBackground(new Color(255, 228, 225));
	    txtMayGodBe.setText("May god be with you?");
	    GridBagConstraints gbc_txtMayGodBe = new GridBagConstraints();
	    gbc_txtMayGodBe.insets = new Insets(0, 0, 5, 0);
	    gbc_txtMayGodBe.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtMayGodBe.gridx = 1;
	    gbc_txtMayGodBe.gridy = 3;
	    panel_76.add(txtMayGodBe, gbc_txtMayGodBe);
	    txtMayGodBe.setColumns(10);
	    
	    txtYouAreVery = new JTextField();
	    txtYouAreVery.setEditable(false);
	    txtYouAreVery.setBackground(new Color(255, 228, 225));
	    txtYouAreVery.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtYouAreVery.setText("You shouldn't be so selfish.");
	    GridBagConstraints gbc_txtYouAreVery = new GridBagConstraints();
	    gbc_txtYouAreVery.insets = new Insets(0, 0, 0, 5);
	    gbc_txtYouAreVery.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtYouAreVery.gridx = 0;
	    gbc_txtYouAreVery.gridy = 4;
	    panel_76.add(txtYouAreVery, gbc_txtYouAreVery);
	    txtYouAreVery.setColumns(10);
	    
	    txtIWouldTake = new JTextField();
	    txtIWouldTake.setEditable(false);
	    txtIWouldTake.setBackground(new Color(255, 228, 225));
	    txtIWouldTake.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtIWouldTake.setText("Would you like a piece of cake?");
	    GridBagConstraints gbc_txtIWouldTake = new GridBagConstraints();
	    gbc_txtIWouldTake.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtIWouldTake.gridx = 1;
	    gbc_txtIWouldTake.gridy = 4;
	    panel_76.add(txtIWouldTake, gbc_txtIWouldTake);
	    txtIWouldTake.setColumns(10);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
		// TODO Auto-generated method stub
		
	}
	public void setVisible1(boolean v) {
		frame.setVisible(v);
		// TODO Auto-generated method stub
		
	}
}
