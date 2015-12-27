package EnglishForKids;
import java.awt.EventQueue;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.UIManager;

public class Tests extends JComponent {
	

	private JFrame frame;
	private JTextField textField;
	private	JButton btnAllScores ;
	private final ButtonGroup test1_1 = new ButtonGroup();
	private final ButtonGroup test1_2 = new ButtonGroup();
	private final ButtonGroup test1_3 = new ButtonGroup();
	private final ButtonGroup test1_4 = new ButtonGroup();
	private final ButtonGroup test1_5 = new ButtonGroup();
	private final ButtonGroup test2_1 = new ButtonGroup();
	private final ButtonGroup test2_2 = new ButtonGroup();
	private final ButtonGroup test2_3 = new ButtonGroup();
	private final ButtonGroup test2_4 = new ButtonGroup();
	private final ButtonGroup test2_5 = new ButtonGroup();
	private final ButtonGroup test3_1 = new ButtonGroup();
	private final ButtonGroup test3_2 = new ButtonGroup();
	private final ButtonGroup test3_3 = new ButtonGroup();
	private final ButtonGroup test3_4 = new ButtonGroup();
	private final ButtonGroup test3_5 = new ButtonGroup();
	private final ButtonGroup test4_1 = new ButtonGroup();
	private final ButtonGroup test4_2 = new ButtonGroup();
	private final ButtonGroup test4_3 = new ButtonGroup();
	private final ButtonGroup test4_4 = new ButtonGroup();
	private final ButtonGroup test4_5 = new ButtonGroup();
	private final ButtonGroup test4_6 = new ButtonGroup();
	private final ButtonGroup test4_7 = new ButtonGroup();
	private final ButtonGroup test5_1 = new ButtonGroup();
	private final ButtonGroup test5_2 = new ButtonGroup();
	private final ButtonGroup test5_3 = new ButtonGroup();
	private final ButtonGroup test5_4 = new ButtonGroup();
	private final ButtonGroup test5_5 = new ButtonGroup();
	private final ButtonGroup test5_6 = new ButtonGroup();
	private final ButtonGroup test5_7 = new ButtonGroup();
	private final ButtonGroup test6_1 = new ButtonGroup();
	private final ButtonGroup test6_2 = new ButtonGroup();
	private final ButtonGroup test6_3 = new ButtonGroup();
	private final ButtonGroup test6_4 = new ButtonGroup();
	private final ButtonGroup test6_5 = new ButtonGroup();
	private final ButtonGroup test6_6 = new ButtonGroup();
	
	Set<JRadioButton> correctOptions = new HashSet<JRadioButton>();
	Set<JRadioButton> correctOptions2 = new HashSet<JRadioButton>();
	Set<JRadioButton> correctOptions3 = new HashSet<JRadioButton>();
	Set<JRadioButton> correctOptions4 = new HashSet<JRadioButton>();
	Set<JRadioButton> correctOptions5 = new HashSet<JRadioButton>();
	Set<JRadioButton> correctOptions6 = new HashSet<JRadioButton>();
	
	Set<JRadioButton> uncorrectOptions = new HashSet<JRadioButton>();
	Set<JRadioButton> uncorrectOptions2 = new HashSet<JRadioButton>();
	Set<JRadioButton> uncorrectOptions3 = new HashSet<JRadioButton>();
	Set<JRadioButton> uncorrectOptions4 = new HashSet<JRadioButton>();
	Set<JRadioButton> uncorrectOptions5 = new HashSet<JRadioButton>();
	Set<JRadioButton> uncorrectOptions6 = new HashSet<JRadioButton>();
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tests window = new Tests();
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
	public Tests() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("English For Kids");
		frame.getContentPane().setBackground(new Color(255, 204, 51));
		frame.setBounds(50, 25, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("img/icon.jpg");
		frame.setIconImage(img.getImage());
	    
	    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
	    tabbedPane.setBackground(new Color(0, 255, 255));
	    frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
	    
	    final JPanel Test1 = new JPanel();
	    Test1.setMaximumSize(new Dimension(32767, 42767));
	    Test1.setBackground(Color.ORANGE);
	    Test1.setPreferredSize(new Dimension(350, 700));
	    JScrollPane jScrollPane = new JScrollPane(Test1);
	    tabbedPane.addTab("Test1", null, jScrollPane, null);
	    Test1.setLayout(null);
	    
	    final JLabel lblwhatIs = new JLabel("1)What ........ your name?");
	    lblwhatIs.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblwhatIs.setBounds(10, 11, 318, 23);
	    Test1.add(lblwhatIs);
	    
	    final JRadioButton one = new JRadioButton("is");
	    one.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    one.setBackground(Color.ORANGE);
	    one.setActionCommand("your");
	    one.setBounds(6, 32, 61, 23);
	    Test1.add(one);
		correctOptions.add(one);
		test1_1.add(one);
	    
	    JRadioButton two = new JRadioButton("am");
	    two.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    two.setBackground(Color.ORANGE);
	    two.setBounds(145, 32, 61, 23);
	    Test1.add(two);
	    test1_1.add(two);
	    uncorrectOptions.add(two);
	    
	    JRadioButton three = new JRadioButton("are");
	    three.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    three.setBackground(Color.ORANGE);
	    three.setBounds(267, 32, 61, 23);
	    Test1.add(three);
	    test1_1.add(three);
	    uncorrectOptions.add(three);
	    
	    JLabel lblhowOld = new JLabel("2)How old ....... you?");
	    lblhowOld.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblhowOld.setBounds(10, 62, 244, 23);
	    Test1.add(lblhowOld);
	   
	    
	    JRadioButton four = new JRadioButton("am");
	    four.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    four.setBackground(Color.ORANGE);
	    four.setBounds(10, 83, 53, 23);
	    Test1.add(four);
	    test1_2.add(four);
	    uncorrectOptions.add(four);
	    
	    JRadioButton five = new JRadioButton("is");
	    five.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    five.setBackground(Color.ORANGE);
	    five.setBounds(145, 83, 61, 23);
	    Test1.add(five);
	    test1_2.add(five);
	    uncorrectOptions.add(five);
	    
	    JRadioButton six = new JRadioButton("are");
	    six.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    six.setBackground(Color.ORANGE);
	    six.setBounds(272, 83, 53, 23);
	    Test1.add(six);
	    correctOptions.add(six);
	    test1_2.add(six);
	    
	    JLabel lblwhereDoYou = new JLabel("3)Where do you live?");
	    lblwhereDoYou.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblwhereDoYou.setBounds(10, 123, 244, 24);
	    Test1.add(lblwhereDoYou);
	    
	    JRadioButton seven = new JRadioButton("I am live in London.");
	    seven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seven.setBackground(Color.ORANGE);
	    seven.setBounds(10, 154, 170, 23);
	    Test1.add(seven);
	    test1_3.add(seven);
	    uncorrectOptions.add(seven);
	    
	    JRadioButton eight = new JRadioButton("I live in London.");
	    eight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eight.setBackground(Color.ORANGE);
	    eight.setBounds(182, 154, 146, 23);
	    Test1.add(eight);
	    correctOptions.add(eight);
	    test1_3.add(eight);
	    
	    JRadioButton nine = new JRadioButton("My live is London.");
	    nine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    nine.setBackground(Color.ORANGE);
	    nine.setBounds(330, 154, 170, 23);
	    Test1.add(nine);
	    test1_3.add(nine);
	    uncorrectOptions.add(one);
	    
	    JLabel lblareYouGerman = new JLabel("4)Are you German?");
	    lblareYouGerman.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblareYouGerman.setBounds(10, 295, 244, 29);
	    Test1.add(lblareYouGerman);
	    
	    JRadioButton ten = new JRadioButton("No. My are American.");
	    ten.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    ten.setBackground(Color.ORANGE);
	    ten.setBounds(10, 316, 179, 23);
	    Test1.add(ten);
	    test1_4.add(ten);
	    uncorrectOptions.add(ten);
	    
	    JRadioButton eleven = new JRadioButton(" No. I is American.");
	    eleven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eleven.setBackground(Color.ORANGE);
	    eleven.setBounds(191, 316, 165, 23);
	    Test1.add(eleven);
	    test1_4.add(eleven);
	    uncorrectOptions.add(eleven);
	    
	    JRadioButton twelve = new JRadioButton("No. I am American.");
	    twelve.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twelve.setBackground(Color.ORANGE);
	    twelve.setBounds(358, 316, 166, 23);
	    Test1.add(twelve);
	    correctOptions.add(twelve);
	    test1_1.add(twelve);
	    Test1.setPreferredSize(new Dimension(350, 600));
		tabbedPane.addTab("Test1", null, jScrollPane, null);
	    Test1.setLayout(null);
	    Test1.setLayout(null);
	    
	    final JButton Evaluate = new JButton("Evaluate");
	    Evaluate.setBackground(new Color(255, 69, 0));
	    Evaluate.setBounds(10, 563, 100, 23);
	    Test1.add(Evaluate);
	    
	    JButton Clear = new JButton("Clear");
	    Clear.setBackground(new Color(255, 69, 0));
	    Clear.setBounds(149, 563, 75, 23);
	    Test1.add(Clear);
	    
	    JLabel Result = new JLabel("Result:");
	    Result.setBounds(260, 567, 46, 14);
	    Test1.add(Result);
	    
	    textField = new JTextField();
	    textField.setBackground(new Color(255, 127, 80));
	    textField.setBounds(300, 564, 86, 20);
	    Test1.add(textField);
	    textField.setColumns(10);
	    
	    JLabel label_1 = new JLabel("New label");
	    label_1.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\icon100x100.png"));
	    label_1.setBounds(354, 6, 99, 100);
	    Test1.add(label_1);
	    
	    JLabel lblNewLabel_13 = new JLabel("New label");
	    lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\London_Bridge-icon.png"));
	    lblNewLabel_13.setBounds(62, 184, 103, 100);
	    Test1.add(lblNewLabel_13);
	    
	    JLabel lblNewLabel_14 = new JLabel("New label");
	    lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\london_icon_iii_by_luftie.png"));
	    lblNewLabel_14.setBounds(272, 184, 101, 93);
	    Test1.add(lblNewLabel_14);
	    
	    JLabel lblNewLabel = new JLabel("New label");
	    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\People_icon.png"));
	    lblNewLabel.setBounds(77, 346, 103, 77);
	    Test1.add(lblNewLabel);
	    
	    JLabel lblNewLabel_15 = new JLabel("5)..... you like to swim?");
	    lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblNewLabel_15.setBounds(10, 434, 244, 14);
	    Test1.add(lblNewLabel_15);
	    
	    JRadioButton thirteen = new JRadioButton("Do");
	    thirteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirteen.setBackground(Color.ORANGE);
	    thirteen.setBounds(10, 455, 61, 23);
	    Test1.add(thirteen);
	    correctOptions.add(thirteen);
	    test1_5.add(thirteen);
	    
	    JRadioButton fourteen = new JRadioButton("Are");
	    fourteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourteen.setBackground(Color.ORANGE);
	    fourteen.setBounds(163, 455, 61, 23);
	    Test1.add(fourteen);
	    test1_5.add(fourteen);
	    uncorrectOptions.add(fourteen);
	    
	    JRadioButton fifteen = new JRadioButton("Is");
	    fifteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fifteen.setBackground(Color.ORANGE);
	    fifteen.setBounds(275, 455, 53, 23);
	    Test1.add(fifteen);
	    test1_5.add(fifteen);
	    uncorrectOptions.add(fifteen);
	    
	    JLabel lblNewLabel_16 = new JLabel("New label");
	    lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\classyfishhh1_by_poniesandcompany-d848puu.png"));
	    lblNewLabel_16.setBounds(62, 485, 103, 67);
	    Test1.add(lblNewLabel_16);
	    
	    JLabel lblNewLabel_17 = new JLabel("New label");
	    lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test1\\4602457174.png"));
	    lblNewLabel_17.setBounds(367, 403, 103, 77);
	    Test1.add(lblNewLabel_17);
	    
	    JButton btnAllScores = new JButton("All Scores");
	    btnAllScores.setBackground(new Color(255, 140, 0));
	    btnAllScores.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    btnAllScores.setBounds(411, 563, 113, 23);
	    btnAllScores.setBackground(new Color(255, 69, 0));
	    Test1.add(btnAllScores);
	    Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test1_1.clearSelection();
				test1_2.clearSelection();
				test1_3.clearSelection();
				test1_4.clearSelection();
				test1_5.clearSelection();
				
				for (JRadioButton rdbn : correctOptions){
					rdbn.setForeground(new Color (51,51,51));
				}
				for (JRadioButton rdbn : uncorrectOptions){
					rdbn.setForeground(new Color (51,51,51));
				}
				textField.setText("");
				
			}
		});
		Evaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				for (JRadioButton rdbn : correctOptions){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result=result+10;
					}
					
				}
				for (Component comp : Test1.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult = Integer.toString(result);
				textField.setText(strResult);
				
				Date nowTime= new Date();
				
				
				
				String str="Test 1 ---- " +"Result: " +strResult + "----" + nowTime ;
				File file= new File("test1.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test1.txt",true));
					output.append(str);
					output.close();
					
					
//					FileWriter fileWriter= new FileWriter(file, false);
//					BufferedWriter bWriter= new BufferedWriter(fileWriter);
//					bWriter.write(str);
//					bWriter.newLine();
														
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						
						File fout=new File("test1.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
	
						
		
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				
				
			} }
			
		});
		
		
		
	    
	    
	    
	    
/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**/	    
	    
	    
	    final JPanel Test2 = new JPanel();
	    Test2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    Test2.setBackground(Color.PINK);
	    Test2.setLayout(null);
	    Test2.setPreferredSize(new Dimension(350, 700));
	    
	    JScrollPane scrollPane2 = new JScrollPane(Test2);
	    tabbedPane.addTab("Test2", null, scrollPane2, null);
	    
	 
	  
	    
	    JLabel label1 = new JLabel("1)Has black and orange stripe.");
	    label1.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label1.setBounds(6, 11, 342, 25);
	    Test2.add(label1);
	    
	    JRadioButton sixteen = new JRadioButton("tiger");
	    sixteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixteen.setBackground(Color.PINK);
	    sixteen.setActionCommand("your");
	    sixteen.setBounds(6, 32, 61, 23);
	    Test2.add(sixteen);
	    correctOptions2.add(sixteen);
	    test2_1.add(sixteen);
	    
	    JRadioButton seventeen = new JRadioButton("elephant");
	    seventeen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventeen.setBackground(Color.PINK);
	    seventeen.setBounds(139, 32, 91, 23);
	    Test2.add(seventeen);
	    test2_1.add(seventeen);
	    uncorrectOptions2.add(seventeen);
	    
	    JRadioButton eighteen = new JRadioButton("crocodile");
	    eighteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eighteen.setBackground(Color.PINK);
	    eighteen.setBounds(279, 32, 109, 23);
	    Test2.add(eighteen);
	    test2_1.add(eighteen);
	    uncorrectOptions2.add(eighteen);
	    
	    JLabel lblTig_1 = new JLabel("tig");
	    lblTig_1.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\tiger.png"));
	    lblTig_1.setBounds(16, 47, 46, 75);
	    Test2.add(lblTig_1);
	    
	    JLabel lblEl = new JLabel("el");
	    lblEl.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\e.png"));
	    lblEl.setBounds(149, 47, 57, 75);
	    Test2.add(lblEl);
	    
	    JLabel lblTig = new JLabel("tig");
	    lblTig.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\Crocodile-icon.png"));
	    lblTig.setBounds(289, 62, 89, 49);
	    Test2.add(lblTig);
	    
	    JLabel label2 = new JLabel("2)Has a long nose.");
	    label2.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label2.setBounds(10, 133, 175, 25);
	    Test2.add(label2);
	    
	    JRadioButton nineteen = new JRadioButton("elephant");
	    nineteen.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    nineteen.setBackground(Color.PINK);
	    nineteen.setBounds(10, 154, 109, 23);
	    Test2.add(nineteen);
	    correctOptions2.add(nineteen);
	    test2_2.add(nineteen);
	    
	    JRadioButton twenty = new JRadioButton("lion");
	    twenty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twenty.setBackground(Color.PINK);
	    twenty.setBounds(149, 154, 66, 23);
	    Test2.add(twenty);
	    test2_2.add(twenty);
	    uncorrectOptions2.add(twenty);
	    
	    JRadioButton twentyone = new JRadioButton("cow");
	    twentyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentyone.setBackground(Color.PINK);
	    twentyone.setBounds(279, 154, 97, 23);
	    Test2.add(twentyone);
	    test2_2.add(twentyone);
	    uncorrectOptions2.add(twentyone);
	    
	    JLabel lblCow = new JLabel("cow");
	    lblCow.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\Black_Holstein_Cow-icon.png"));
	    lblCow.setBounds(221, 172, 109, 94);
	    Test2.add(lblCow);
	    
	    JLabel label3 = new JLabel("3)The king of the animals");
	    label3.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label3.setBounds(10, 266, 221, 26);
	    Test2.add(label3);
	    
	    JRadioButton twentytwo = new JRadioButton("hippo");
	    twentytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentytwo.setBackground(Color.PINK);
	    twentytwo.setBounds(10, 299, 127, 23);
	    Test2.add(twentytwo);
	    test2_3.add(twentytwo);
	    uncorrectOptions2.add(twentytwo);
	    
	    JRadioButton twentythree = new JRadioButton("bee");
	    twentythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentythree.setBackground(Color.PINK);
	    twentythree.setBounds(149, 299, 103, 23);
	    Test2.add(twentythree);
	    test2_3.add(twentythree);
	    uncorrectOptions2.add(twentythree);
	    
	    JRadioButton twentytfour = new JRadioButton("lion");
	    twentytfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentytfour.setBackground(Color.PINK);
	    twentytfour.setBounds(288, 299, 134, 23);
	    Test2.add(twentytfour);
	    correctOptions2.add(twentytfour);
	    test2_3.add(twentytfour);
	    
	    JLabel label4 = new JLabel("4)Has no legs");
	    label4.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label4.setBounds(10, 441, 187, 25);
	    Test2.add(label4);
	    
	    JRadioButton twentytfive = new JRadioButton("tiger");
	    twentytfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentytfive.setBackground(Color.PINK);
	    twentytfive.setBounds(10, 476, 61, 23);
	    Test2.add(twentytfive);
	    test2_4.add(twentytfive);
	    uncorrectOptions2.add(twentytfive);
	    
	    JRadioButton twentytsix = new JRadioButton("snake");
	    twentytsix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentytsix.setBackground(Color.PINK);
	    twentytsix.setBounds(149, 473, 72, 23);
	    Test2.add(twentytsix);
	    correctOptions2.add(twentytsix);
	    test2_4.add(twentytsix);
	    
	    JRadioButton twentytseven = new JRadioButton("cat");
	    twentytseven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentytseven.setBackground(Color.PINK);
	    twentytseven.setBounds(295, 476, 83, 23);
	    Test2.add(twentytseven);
	    test2_4.add(twentytseven);
	    uncorrectOptions2.add(twentytseven);
	    
	    JLabel label5 = new JLabel("5)Grey and big, loves water.");
	    label5.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label5.setBounds(10, 591, 267, 19);
	    Test2.add(label5);
	    
	    JLabel lblNewLabel_1 = new JLabel("New label");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\e.png"));
	    lblNewLabel_1.setBounds(69, 184, 61, 70);
	    Test2.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("New label");
	    lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\hippo.png"));
	    lblNewLabel_2.setBounds(71, 331, 66, 75);
	    Test2.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_3 = new JLabel("New label");
	    lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\be-the-bee-icon-1.png"));
	    lblNewLabel_3.setBounds(203, 329, 92, 93);
	    Test2.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_4 = new JLabel("New label");
	    lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\Snake-icon (1).png"));
	    lblNewLabel_4.setBounds(69, 505, 97, 75);
	    Test2.add(lblNewLabel_4);
	    
	    JLabel lblNewLabel_5 = new JLabel("New label");
	    lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test2\\gamercat_icon1.gif"));
	    lblNewLabel_5.setBounds(255, 506, 97, 81);
	    Test2.add(lblNewLabel_5);
	    
	    JRadioButton twentyeight = new JRadioButton("hippo");
	    twentyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentyeight.setBackground(Color.PINK);
	    twentyeight.setBounds(10, 617, 72, 23);
	    Test2.add(twentyeight);
	    correctOptions2.add(twentyeight);
	    test2_5.add(twentyeight);
	    
	    JRadioButton twentynine = new JRadioButton("tiger");
	    twentynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    twentynine.setBackground(Color.PINK);
	    twentynine.setBounds(145, 617, 61, 23);
	    Test2.add(twentynine);
	    test2_5.add(twentynine);
	    uncorrectOptions2.add(twentynine);
	    
	    JRadioButton thirty = new JRadioButton("lion");
	    thirty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirty.setBackground(Color.PINK);
	    thirty.setBounds(296, 619, 109, 23);
	    Test2.add(thirty);
	    test2_5.add(thirty);
	    uncorrectOptions2.add(thirty);
	    
	    JButton btnEvaluate = new JButton("Evaluate");
	    btnEvaluate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int result2 = 0;
				for (JRadioButton rdbn : correctOptions2){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result2=result2+10;
					}
					
				}
				for (Component comp : Test2.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions2.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult2 = Integer.toString(result2);
				textField_2.setText(strResult2);
				
				Date nowTime= new Date();
				
				
				
				String str2="Test 2 ---- " +"Result: " +strResult2 + "----" + nowTime ;
				File file= new File("test2.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test2.txt",true));
					output.append(str2);
					output.close();
																
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						
						
						File fout=new File("test2.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str2) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
						
						
						
//						Writer output;
//						output=new BufferedWriter(new FileWriter("dosya1.txt",true));
//						output.write("New Line!!\n");
//						output.write("\n\n") ;
//						output.close();
						
//						FileWriter fileWriter= new FileWriter(file, false);
//						BufferedWriter bWriter= new BufferedWriter(fileWriter);
//						bWriter.write(str);
//						bWriter.newLine();
//						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    		
	    	} }
	    });
	    btnEvaluate.setBackground(Color.MAGENTA);
	    btnEvaluate.setBounds(10, 647, 89, 23);
	    Test2.add(btnEvaluate);
	    	    
	    JButton btnClear = new JButton("Clear");
	    btnClear.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for (JRadioButton rdbn : correctOptions2){
					rdbn.setForeground(new Color(51, 51, 51));
				}
	    		
	    		for (JRadioButton rdbn : uncorrectOptions2){
					rdbn.setForeground(new Color(51, 51, 51));
				}
				
				textField_2.setText("");
	    		
	    		
	    	}
	    });
	    btnClear.setBackground(Color.MAGENTA);
	    btnClear.setBounds(141, 647, 89, 23);
	    Test2.add(btnClear);
	    
	    JLabel lblResult = new JLabel("Result:");
	    lblResult.setBounds(266, 651, 46, 14);
	    Test2.add(lblResult);
	    
	    textField_2 = new JTextField();
	    textField_2.setBackground(new Color(255, 228, 196));
	    textField_2.setBounds(319, 649, 86, 20);
	    Test2.add(textField_2);
	    textField_2.setColumns(10);
	    
	    JButton button = new JButton("All Scores");
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    button.setBounds(430, 647, 113, 23);
	    button.setBackground(Color.MAGENTA);
	    Test2.add(button);
	  
//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//	    

	    
	    final JPanel Test3 = new JPanel();
	    Test3.setBackground(new Color(102, 205, 170));
	    Test3.setLayout(null);
	    Test3.setPreferredSize(new Dimension(350, 700));
	    
	    JScrollPane scrollPane3 = new JScrollPane(Test3);
	    tabbedPane.addTab("Test3", null, scrollPane3, null);
	   
	    
	    JLabel label_12 = new JLabel("1)Which is the uncountable word?");
	    label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label_12.setBounds(10, 11, 318, 14);
	    Test3.add(label_12);
	    
	    JRadioButton thirtyone = new JRadioButton("salt");
	    thirtyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtyone.setBackground(new Color(102, 205, 170));
	    thirtyone.setActionCommand("your");
	    thirtyone.setBounds(6, 32, 61, 23);
	    Test3.add(thirtyone);
	    correctOptions3.add(thirtyone);
	    test3_1.add(thirtyone);
	    
	    JRadioButton thirtytwo = new JRadioButton("apple");
	    thirtytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtytwo.setBackground(new Color(102, 205, 170));
	    thirtytwo.setBounds(165, 32, 81, 23);
	    Test3.add(thirtytwo);
	    test3_1.add(thirtytwo);
	    uncorrectOptions3.add(thirtytwo);
	    
	    JRadioButton thirtythree = new JRadioButton("lollipop");
	    thirtythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtythree.setBackground(new Color(102, 205, 170));
	    thirtythree.setBounds(331, 32, 109, 23);
	    Test3.add(thirtythree);
	    test3_1.add(thirtythree);
	    uncorrectOptions3.add(thirtythree);
	    
	    JLabel label_14 = new JLabel("2)There are 3..............(apple).");
	    label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label_14.setBounds(10, 161, 292, 23);
	    Test3.add(label_14);
	    
	    JRadioButton thirtyfour = new JRadioButton("apple");
	    thirtyfour.setBackground(new Color(102, 205, 170));
	    thirtyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtyfour.setBounds(6, 191, 90, 23);
	    Test3.add(thirtyfour);
	    test3_2.add(thirtyfour);
	    uncorrectOptions3.add(thirtyfour);
	    
	    JRadioButton thirtyfive = new JRadioButton("apples");
	    thirtyfive.setBackground(new Color(102, 205, 170));
	    thirtyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtyfive.setBounds(181, 191, 90, 23);
	    Test3.add(thirtyfive);
	    correctOptions3.add(thirtyfive);
	    test3_2.add(thirtyfive);
	    
	    JRadioButton thirtysix = new JRadioButton("none of them");
	    thirtysix.setBackground(new Color(102, 205, 170));
	    thirtysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtysix.setBounds(331, 191, 134, 23);
	    Test3.add(thirtysix);
	    test3_2.add(thirtysix);
	    uncorrectOptions3.add(thirtysix);
	    
	    
	    JLabel label_16 = new JLabel("3)Which is the countable word?");
	    label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label_16.setBounds(10, 320, 280, 23);
	    Test3.add(label_16);
	    
	    JRadioButton thirtyseven = new JRadioButton("sugar");
	    thirtyseven.setBackground(new Color(102, 205, 170));
	    thirtyseven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtyseven.setBounds(6, 350, 127, 23);
	    Test3.add(thirtyseven);
	    test3_3.add(thirtyseven);
	    uncorrectOptions3.add(thirtyseven);
	    
	    JRadioButton thirtyeight = new JRadioButton("water");
	    thirtyeight.setBackground(new Color(102, 205, 170));
	    thirtyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtyeight.setBounds(181, 350, 103, 23);
	    Test3.add(thirtyeight);
	    test3_3.add(thirtyeight);
	    uncorrectOptions3.add(thirtyeight);
	    
	    JRadioButton thirtynine = new JRadioButton("box");
	    thirtynine.setBackground(new Color(102, 205, 170));
	    thirtynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    thirtynine.setBounds(331, 350, 134, 23);
	    Test3.add(thirtynine);
	    correctOptions3.add(thirtynine);
	    test3_3.add(thirtynine);
	   
	    JLabel label_18 = new JLabel("4)There ...... a lot of chairs.");
	    label_18.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label_18.setBounds(10, 459, 261, 14);
	    Test3.add(label_18);
	    
	    JRadioButton fourty = new JRadioButton("are");
	    fourty.setBackground(new Color(102, 205, 170));
	    fourty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourty.setBounds(10, 480, 61, 23);
	    Test3.add(fourty);
	    correctOptions3.add(fourty);
	    
	    JRadioButton fourtyone = new JRadioButton("is");
	    fourtyone.setBackground(new Color(102, 205, 170));
	    fourtyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtyone.setBounds(199, 480, 72, 23);
	    Test3.add(fourtyone);
	    test3_4.add(fourtyone);
	    uncorrectOptions3.add(fourtyone);
	    
	    
	    JRadioButton fourtytwo = new JRadioButton("am");
	    fourtytwo.setBackground(new Color(102, 205, 170));
	    fourtytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtytwo.setBounds(331, 480, 109, 23);
	    Test3.add(fourtytwo);
	    test3_4.add(fourtytwo);
	    uncorrectOptions3.add(thirtytwo);
	    
	    JLabel label_20 = new JLabel("5)Do you want to drink ......... water?");
	    label_20.setFont(new Font("Tahoma", Font.BOLD, 16));
	    label_20.setBounds(10, 593, 360, 19);
	    Test3.add(label_20);
	    
	    JRadioButton fourtythree = new JRadioButton("some");
	    fourtythree.setBackground(new Color(102, 205, 170));
	    fourtythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtythree.setBounds(10, 619, 72, 23);
	    Test3.add(fourtythree);
	    correctOptions3.add(fourtythree);
	    test3_5.add(fourtythree);
	    
	    JRadioButton fourtyfour = new JRadioButton("a little");
	    fourtyfour.setBackground(new Color(102, 205, 170));
	    fourtyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtyfour.setBounds(181, 619, 81, 23);
	    Test3.add(fourtyfour);
	    test3_5.add(fourtyfour);
	    uncorrectOptions3.add(fourtyfour);
	    
	    JRadioButton fourtyfive = new JRadioButton("a");
	    fourtyfive.setBackground(new Color(102, 205, 170));
	    fourtyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtyfive.setBounds(331, 619, 49, 23);
	    Test3.add(fourtyfive);
	    test3_5.add(fourtyfive);
	    uncorrectOptions3.add(fourtyfour);
	    
	    JLabel lblNewLabel_6 = new JLabel("New label");
	    lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\Salt-icon.png"));
	    lblNewLabel_6.setBounds(16, 56, 90, 100);
	    Test3.add(lblNewLabel_6);
	    
	    JLabel lblNewLabel_7 = new JLabel("New label");
	    lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\icon-apple.jpg"));
	    lblNewLabel_7.setBounds(196, 62, 89, 88);
	    Test3.add(lblNewLabel_7);
	    
	    JLabel lblNewLabel_8 = new JLabel("New label");
	    lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\Giant_Lollipop_Cookie_Tree-icon.png"));
	    lblNewLabel_8.setBounds(341, 62, 110, 94);
	    Test3.add(lblNewLabel_8);
	    
	    JLabel lblNewLabel_9 = new JLabel("New label");
	    lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\child-picking-apples-300x100.jpg"));
	    lblNewLabel_9.setBounds(78, 221, 292, 88);
	    Test3.add(lblNewLabel_9);
	    
	    JLabel label_3 = new JLabel("");
	    label_3.setIcon(new ImageIcon("img/test3/Grain_of_Sugar-icon.png"));
	    label_3.setBounds(72, 368, 103, 80);
	    Test3.add(label_3);
	    
	    JLabel lblNewLabel_10 = new JLabel("New label");
	    lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\6Mystery_Box-icon.png"));
	    lblNewLabel_10.setBounds(244, 362, 103, 106);
	    Test3.add(lblNewLabel_10);
	    
	    JLabel lblNewLabel_11 = new JLabel("New label");
	    lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test3\\Rocking_Chair-icon.png"));
	    lblNewLabel_11.setBounds(88, 484, 95, 98);
	    Test3.add(lblNewLabel_11);
	    
	    JButton btnEvaluate_1 = new JButton("Evaluate");
	    btnEvaluate_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		int result3 = 0;
				for (JRadioButton rdbn : correctOptions3){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result3=result3+10;
					}
					
				}
				for (Component comp : Test3.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions3.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult3 = Integer.toString(result3);
				textField_3.setText(strResult3);
				
				
				
				Date nowTime= new Date();
				
				
				
				String str3="Test 3 ---- " +"Result: " +strResult3 + "----" + nowTime ;
				File file= new File("test3.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test3.txt",true));
					output.append(str3);
					output.close();
					
					
//					FileWriter fileWriter= new FileWriter(file, false);
//					BufferedWriter bWriter= new BufferedWriter(fileWriter);
//					bWriter.write(str);
//					bWriter.newLine();
														
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						//PrintWriter writer = new PrintWriter();
						
						File fout=new File("test3.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str3) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
						
						
						
//						Writer output;
//						output=new BufferedWriter(new FileWriter("dosya1.txt",true));
//						output.write("New Line!!\n");
//						output.write("\n\n") ;
//						output.close();
						
//						FileWriter fileWriter= new FileWriter(file, false);
//						BufferedWriter bWriter= new BufferedWriter(fileWriter);
//						bWriter.write(str);
//						bWriter.newLine();
//						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
	    		
	    	}
	    });
	    btnEvaluate_1.setBackground(new Color(106, 90, 205));
	    btnEvaluate_1.setBounds(10, 649, 89, 23);
	    Test3.add(btnEvaluate_1);
	    
	    JButton btnClear_1 = new JButton("Clear");
	    btnClear_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for (JRadioButton rdbn : correctOptions3){
					rdbn.setForeground(new Color(51, 51, 51));
				}
	    		for (JRadioButton rdbn : uncorrectOptions3){
					rdbn.setForeground(new Color(51, 51, 51));
				}
				
				textField_3.setText("");
	    	}
	    });
	    btnClear_1.setBackground(new Color(106, 90, 205));
	    btnClear_1.setBounds(128, 649, 89, 23);
	    Test3.add(btnClear_1);
	    
	    JLabel lblResult_1 = new JLabel("Result:");
	    lblResult_1.setBounds(244, 649, 46, 14);
	    Test3.add(lblResult_1);
	    
	    textField_3 = new JTextField();
	    textField_3.setBackground(new Color(147, 112, 219));
	    textField_3.setBounds(285, 646, 86, 20);
	    Test3.add(textField_3);
	    textField_3.setColumns(10);
	    
	    JButton btnAllScores_1 = new JButton("All Scores");
	    btnAllScores_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    btnAllScores_1.setBackground(new Color(106, 90, 205));
	    btnAllScores_1.setBounds(400, 646, 113, 23);
	    Test3.add(btnAllScores_1);
	    
	    
//**//**//**//**//**//**//**//**//***//**///**//////////////////////////////////////////////////////////////////////////
	    
	    final JPanel Test4 = new JPanel();
	    Test4.setBackground(new Color(240, 230, 140));
	    Test4.setLayout(null);
	    Test4.setPreferredSize(new Dimension(350, 700));
	    
	    JScrollPane scrollPane4 = new JScrollPane(Test4);
	    
	    JLabel lblw = new JLabel("1)Which one is the correct?");
	    lblw.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblw.setBounds(10, 11, 347, 14);
	    Test4.add(lblw);
	    
	    JRadioButton fourtysix = new JRadioButton("How much cheese can it eat?");
	    fourtysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtysix.setBackground(new Color(240, 230, 140));
	    fourtysix.setBounds(6, 32, 269, 23);
	    Test4.add(fourtysix);
	    test4_1.add(fourtysix);
	    uncorrectOptions4.add(fourtysix);
	    
	    
	    JRadioButton fourtyseven = new JRadioButton("How many cheese can you eat?");
	    fourtyseven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtyseven.setBackground(new Color(240, 230, 140));
	    fourtyseven.setBounds(6, 58, 269, 23);
	    Test4.add(fourtyseven);
	    correctOptions4.add(fourtyseven);
	    test4_1.add(fourtyseven);
	    
	    JRadioButton fourtyeight = new JRadioButton("How much cheese can eat they?");
	    fourtyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtyeight.setBackground(new Color(240, 230, 140));
	    fourtyeight.setBounds(6, 84, 269, 23);
	    Test4.add(fourtyeight);
	    test4_1.add(fourtyeight);
	    uncorrectOptions4.add(fourtyeight);
	    
	    JLabel lblyouSpeak = new JLabel("2)You .........  speak English.");
	    lblyouSpeak.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblyouSpeak.setBounds(10, 114, 236, 14);
	    Test4.add(lblyouSpeak);
	    
	    JRadioButton fourtynine = new JRadioButton("can");
	    fourtynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fourtynine.setBackground(new Color(240, 230, 140));
	    fourtynine.setBounds(6, 135, 52, 23);
	    Test4.add(fourtynine);
	    correctOptions4.add(fourtynine);
	    test4_2.add(fourtynine);
	   
	    
	    JRadioButton fifty = new JRadioButton("do");
	    fifty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fifty.setBackground(new Color(240, 230, 140));
	    fifty.setBounds(103, 135, 52, 23);
	    Test4.add(fifty);
	    test4_2.add(fifty);
	    uncorrectOptions4.add(fifty);
	    
	    JRadioButton fiftyone = new JRadioButton("am");
	    fiftyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftyone.setBackground(new Color(240, 230, 140));
	    fiftyone.setBounds(205, 135, 52, 23);
	    Test4.add(fiftyone);
	    test4_2.add(fiftyone);
	    uncorrectOptions4.add(fiftyone);
	    
	    JLabel lblwhichIsThe = new JLabel("3)Which is the correct?");
	    lblwhichIsThe.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblwhichIsThe.setBounds(10, 165, 347, 14);
	    Test4.add(lblwhichIsThe);
	    
	    JRadioButton fiftytwo = new JRadioButton("You can not tennis play.");
	    fiftytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftytwo.setBackground(new Color(240, 230, 140));
	    fiftytwo.setBounds(10, 186, 223, 23);
	    Test4.add(fiftytwo);
	    test4_3.add(fiftytwo);
	    uncorrectOptions4.add(fiftytwo);
	    
	    JRadioButton fiftythree = new JRadioButton("She can't tennis play.");
	    fiftythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftythree.setBackground(new Color(240, 230, 140));
	    fiftythree.setBounds(10, 212, 223, 23);
	    Test4.add(fiftythree);
	    test4_3.add(fiftythree);
	    uncorrectOptions4.add(fiftythree);
	    
	    JRadioButton fiftyfour = new JRadioButton("They can't play tennis.");
	    fiftyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftyfour.setBackground(new Color(240, 230, 140));
	    fiftyfour.setBounds(10, 238, 223, 23);
	    Test4.add(fiftyfour);
	    correctOptions4.add(fiftyfour);
	    test4_3.add(fiftyfour);
	    
	    JLabel lblfindTheCorrect = new JLabel("For 4 and 5 find the correct form.");
	    lblfindTheCorrect.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblfindTheCorrect.setBounds(10, 268, 347, 14);
	    Test4.add(lblfindTheCorrect);
	    
	    JLabel lblaBikeRidecan = new JLabel("4)a bike/ ride/can /she.");
	    lblaBikeRidecan.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblaBikeRidecan.setBounds(10, 291, 347, 14);
	    Test4.add(lblaBikeRidecan);
	    
	    JRadioButton fiftyfive = new JRadioButton("She a bike can ride.");
	    fiftyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftyfive.setBackground(new Color(240, 230, 140));
	    fiftyfive.setBounds(10, 306, 168, 23);
	    Test4.add(fiftyfive);
	    test4_4.add(fiftyfive);
	    uncorrectOptions4.add(fiftyfive);
	    
	    JRadioButton fiftysix = new JRadioButton("She can ride a bike.");
	    fiftysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftysix.setBackground(new Color(240, 230, 140));
	    fiftysix.setBounds(10, 332, 187, 23);
	    Test4.add(fiftysix);
	    correctOptions4.add(fiftysix);
	    test4_4.add(fiftysix);
	    
	    JRadioButton fiftysven = new JRadioButton("Can she a bike ride?");
	    fiftysven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftysven.setBackground(new Color(240, 230, 140));
	    fiftysven.setBounds(10, 358, 168, 23);
	    Test4.add(fiftysven);
	    test4_4.add(fiftysven);
	    uncorrectOptions4.add(fiftysven);
	    
	    JLabel lblpictureDrawCant = new JLabel("5)picture/draw/can't/i.");
	    lblpictureDrawCant.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblpictureDrawCant.setBounds(10, 388, 203, 14);
	    Test4.add(lblpictureDrawCant);
	    
	    JRadioButton fiftyeight = new JRadioButton("I can't draw a picture.");
	    fiftyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftyeight.setBackground(new Color(240, 230, 140));
	    fiftyeight.setBounds(10, 409, 203, 23);
	    Test4.add(fiftyeight);
	    correctOptions4.add(fiftyeight);
	    test4_5.add(fiftyeight);
	    
	    JRadioButton fiftynine = new JRadioButton("Can't i picture draw?");
	    fiftynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    fiftynine.setBackground(new Color(240, 230, 140));
	    fiftynine.setBounds(10, 435, 203, 23);
	    Test4.add(fiftynine);
	    test4_5.add(fiftynine);
	    uncorrectOptions4.add(fiftynine);
	    
	    JRadioButton sixty = new JRadioButton("picture i can't draw.");
	    sixty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixty.setBackground(new Color(240, 230, 140));
	    sixty.setBounds(10, 461, 203, 23);
	    Test4.add(sixty);
	    test4_5.add(sixty);
	    uncorrectOptions4.add(sixty);
	    
	    JButton btnEvaluate_2 = new JButton("Evaluate");
	    btnEvaluate_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int result4 = 0;
				for (JRadioButton rdbn : correctOptions4){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result4=result4+10;
					}
					
				}
				for (Component comp : Test4.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions4.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult4 = Integer.toString(result4);
				textField_4.setText(strResult4);
				
						
				Date nowTime= new Date();
				
				
				
				String str4="Test 4 ---- " +"Result: " +strResult4 + "----" + nowTime ;
				File file= new File("test4.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test4.txt",true));
					output.append(str4);
					output.close();
					
					
//					FileWriter fileWriter= new FileWriter(file, false);
//					BufferedWriter bWriter= new BufferedWriter(fileWriter);
//					bWriter.write(str);
//					bWriter.newLine();
														
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						//PrintWriter writer = new PrintWriter();
						
						File fout=new File("test4.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str4) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
						
						
						
//						Writer output;
//						output=new BufferedWriter(new FileWriter("dosya1.txt",true));
//						output.write("New Line!!\n");
//						output.write("\n\n") ;
//						output.close();
						
//						FileWriter fileWriter= new FileWriter(file, false);
//						BufferedWriter bWriter= new BufferedWriter(fileWriter);
//						bWriter.write(str);
//						bWriter.newLine();
//						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    		
	    		
	    	}}
	    });
	    btnEvaluate_2.setBackground(new Color(184, 134, 11));
	    btnEvaluate_2.setBounds(20, 648, 89, 23);
	    Test4.add(btnEvaluate_2);
	    
	    JButton btnClear_2 = new JButton("Clear");
	    btnClear_2.setBackground(new Color(184, 134, 11));
	    btnClear_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		for (JRadioButton rdbn : correctOptions4){
					rdbn.setForeground(new Color(51, 51, 51));
				}
	    		for (JRadioButton rdbn : uncorrectOptions4){
					rdbn.setForeground(new Color(51, 51, 51));
				}
				
				textField_4.setText("");
	    		
	    	}
	    });
	    btnClear_2.setBounds(144, 648, 89, 23);
	    Test4.add(btnClear_2);
	    
	    JLabel lblResult_2 = new JLabel("Result:");
	    lblResult_2.setBounds(261, 652, 46, 14);
	    Test4.add(lblResult_2);
	    
	    textField_4 = new JTextField();
	    textField_4.setBackground(new Color(255, 245, 238));
	    textField_4.setBounds(298, 649, 86, 20);
	    Test4.add(textField_4);
	    textField_4.setColumns(10);
	    
	    JLabel lblCanSpeak = new JLabel("6)I can speak English.   ....... language can you speak?");
	    lblCanSpeak.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblCanSpeak.setBounds(10, 491, 486, 23);
	    Test4.add(lblCanSpeak);
	    
	    JRadioButton sixtyone = new JRadioButton("What");
	    sixtyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtyone.setBackground(new Color(240, 230, 140));
	    sixtyone.setBounds(10, 512, 109, 23);
	    Test4.add(sixtyone);
	    correctOptions4.add(sixtyone);
	    test4_6.add(sixtyone);
	    
	    JRadioButton sixtytwo = new JRadioButton("Why");
	    sixtytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtytwo.setBackground(new Color(240, 230, 140));
	    sixtytwo.setBounds(10, 538, 109, 23);
	    Test4.add(sixtytwo);
	    test4_6.add(sixtytwo);
	    correctOptions4.add(sixtytwo);
	    
	    JRadioButton sixtythree = new JRadioButton("Who");
	    sixtythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtythree.setBackground(new Color(240, 230, 140));
	    sixtythree.setBounds(10, 564, 109, 23);
	    Test4.add(sixtythree);
	    test4_6.add(sixtythree);
	    uncorrectOptions4.add(sixtythree);
	    
	    JLabel lblcanYouSpeak = new JLabel("7)Can you speak English?");
	    lblcanYouSpeak.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblcanYouSpeak.setBounds(10, 594, 347, 17);
	    Test4.add(lblcanYouSpeak);
	    
	    JRadioButton sixtyfour = new JRadioButton("Yes I speak.");
	    sixtyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtyfour.setBackground(new Color(240, 230, 140));
	    sixtyfour.setBounds(10, 618, 109, 23);
	    Test4.add(sixtyfour);
	    test4_7.add(sixtyfour);
	    uncorrectOptions4.add(sixtyfour);
	    
	    JRadioButton sixtyfive = new JRadioButton("No, I not.");
	    sixtyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtyfive.setBackground(new Color(240, 230, 140));
	    sixtyfive.setBounds(144, 618, 109, 23);
	    Test4.add(sixtyfive);
	    test4_7.add(sixtyfive);
	    uncorrectOptions4.add(sixtyfive);
	    
	    JRadioButton sixtysix = new JRadioButton("Yes, i can.");
	    sixtysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtysix.setBackground(new Color(240, 230, 140));
	    sixtysix.setBounds(275, 618, 109, 23);
	    Test4.add(sixtysix);
	    correctOptions4.add(sixtysix);
	    test4_7.add(sixtysix);
	    
	    JLabel lblNewLabel_12 = new JLabel("New label");
	    lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test4\\TN_girl_drawing_art_05.jpg"));
	    lblNewLabel_12.setBounds(270, 388, 193, 96);
	    Test4.add(lblNewLabel_12);
	    
	    JLabel lblNewLabel_18 = new JLabel("New label");
	    lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test4\\little-girl-riding-a-bicycle_133065827.jpg"));
	    lblNewLabel_18.setBounds(304, 268, 127, 113);
	    Test4.add(lblNewLabel_18);
	    
	    JLabel lblNewLabel_19 = new JLabel("New label");
	    lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test4\\i6.gif"));
	    lblNewLabel_19.setBounds(315, 165, 97, 96);
	    Test4.add(lblNewLabel_19);
	    
	    JLabel lblNewLabel_20 = new JLabel("New label");
	    lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test4\\Spy_Mouse_icon.png"));
	    lblNewLabel_20.setBounds(312, 11, 151, 147);
	    Test4.add(lblNewLabel_20);
	    
	    JButton btnAllScores_2 = new JButton("All Scores");
	    btnAllScores_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    btnAllScores_2.setBounds(400, 648, 113, 23);
	    btnAllScores_2.setBackground(new Color(184, 134, 11));
	    Test4.add(btnAllScores_2);
	    tabbedPane.addTab("Test4", null, scrollPane4, null);
	    
//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//
	    
	    
	    JPanel Test5 = new JPanel();
	    Test5.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
	    Test5.setBackground(new Color(199, 21, 133));
	    Test5.setLayout(null);
	    Test5.setPreferredSize(new Dimension(350, 700));
	    
	    JScrollPane scrollPane5 = new JScrollPane(Test5);
	    
	    JLabel lblchooseTheCorrect = new JLabel("1)Choose the correct one.");
	    lblchooseTheCorrect.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblchooseTheCorrect.setBounds(10, 11, 224, 14);
	    Test5.add(lblchooseTheCorrect);
	    
	    JRadioButton sixtyseven = new JRadioButton("She have got a new car.");
	    sixtyseven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtyseven.setBackground(new Color(199, 21, 133));
	    sixtyseven.setForeground(new Color(0, 0, 0));
	    sixtyseven.setBounds(10, 32, 242, 23);
	    Test5.add(sixtyseven);
	    test5_1.add(sixtyseven);
	    uncorrectOptions5.add(sixtyseven);
	    
	    JRadioButton sixtyeight = new JRadioButton("They have got a new car.");
	    sixtyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtyeight.setBackground(new Color(199, 21, 133));
	    sixtyeight.setForeground(new Color(0, 0, 0));
	    sixtyeight.setBounds(10, 58, 242, 23);
	    Test5.add(sixtyeight);
	    correctOptions5.add(sixtyeight);
	    test5_1.add(sixtyeight);
	    
	    JRadioButton sixtynine = new JRadioButton("We has got a new car.");
	    sixtynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    sixtynine.setBackground(new Color(199, 21, 133));
	    sixtynine.setForeground(new Color(0, 0, 0));
	    sixtynine.setBounds(10, 84, 242, 23);
	    Test5.add(sixtynine);
	    test5_1.add(sixtynine);
	    uncorrectOptions5.add(sixtynine);
	    
	    JLabel lblmarryA = new JLabel("2)Marry ........ a beautiful doll.");
	    lblmarryA.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblmarryA.setBounds(10, 114, 258, 23);
	    Test5.add(lblmarryA);
	    
	    JRadioButton seventy = new JRadioButton("has");
	    seventy.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventy.setBackground(new Color(199, 21, 133));
	    seventy.setForeground(new Color(0, 0, 0));
	    seventy.setBounds(6, 135, 52, 23);
	    Test5.add(seventy);
	    correctOptions5.add(seventy);
	    test5_2.add(seventy);
	    
	    JRadioButton seventyone = new JRadioButton("have");
	    seventyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventyone.setBackground(new Color(199, 21, 133));
	    seventyone.setForeground(new Color(0, 0, 0));
	    seventyone.setBounds(96, 135, 67, 23);
	    Test5.add(seventyone);
	    test5_2.add(seventyone);
	    uncorrectOptions5.add(seventyone);
	    
	    JRadioButton seventytwo = new JRadioButton("can");
	    seventytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventytwo.setBackground(new Color(199, 21, 133));
	    seventytwo.setForeground(new Color(0, 0, 0));
	    seventytwo.setBounds(201, 135, 67, 23);
	    Test5.add(seventytwo);
	    test5_2.add(seventytwo);
	    uncorrectOptions5.add(seventytwo);
	    
	    JLabel lblwhichIsThe_1 = new JLabel("3)Which is the correct?");
	    lblwhichIsThe_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblwhichIsThe_1.setBounds(12, 165, 222, 14);
	    Test5.add(lblwhichIsThe_1);
	    
	    JRadioButton seventythree = new JRadioButton("Why we got have a red dog?");
	    seventythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventythree.setBackground(new Color(199, 21, 133));
	    seventythree.setForeground(new Color(0, 0, 0));
	    seventythree.setBounds(6, 186, 266, 23);
	    Test5.add(seventythree);
	    test5_3.add(seventythree);
	    uncorrectOptions5.add(seventythree);
	    
	    JRadioButton seventyfour = new JRadioButton("Why they a red dog have got?");
	    seventyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventyfour.setBackground(new Color(199, 21, 133));
	    seventyfour.setForeground(new Color(0, 0, 0));
	    seventyfour.setBounds(6, 212, 266, 23);
	    Test5.add(seventyfour);
	    test5_3.add(seventyfour);
	    uncorrectOptions5.add(seventyfour);
	    
	    JRadioButton seventyfive = new JRadioButton("Why has she got a red dog?");
	    seventyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventyfive.setBackground(new Color(199, 21, 133));
	    seventyfive.setForeground(new Color(0, 0, 0));
	    seventyfive.setBounds(6, 238, 266, 23);
	    Test5.add(seventyfive);
	    correctOptions5.add(seventyfive);
	    test5_3.add(seventyfive);
	    
	    JLabel lblaHat = new JLabel("4)a hat/got/have/I");
	    lblaHat.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblaHat.setBounds(10, 268, 159, 23);
	    Test5.add(lblaHat);
	    
	    JRadioButton seventysix = new JRadioButton("I have a hat got.");
	    seventysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventysix.setBackground(new Color(199, 21, 133));
	    seventysix.setForeground(new Color(0, 0, 0));
	    seventysix.setBounds(6, 289, 145, 23);
	    Test5.add(seventysix);
	    test5_4.add(seventysix);
	    uncorrectOptions5.add(seventysix);
	    
	    JRadioButton seventyseven = new JRadioButton("I have got a hat.");
	    seventyseven.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventyseven.setBackground(new Color(199, 21, 133));
	    seventyseven.setForeground(new Color(0, 0, 0));
	    seventyseven.setBounds(6, 315, 145, 23);
	    Test5.add(seventyseven);
	    correctOptions5.add(seventyseven);
	    test5_4.add(seventyseven);
	    
	    JRadioButton seventyeight = new JRadioButton("Have got a hat I.");
	    seventyeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventyeight.setBackground(new Color(199, 21, 133));
	    seventyeight.setForeground(new Color(0, 0, 0));
	    seventyeight.setBounds(6, 341, 145, 23);
	    Test5.add(seventyeight);
	    test5_4.add(seventyeight);
	    uncorrectOptions5.add(seventyeight);
	    
	    JLabel lbltheyMilk = new JLabel("5)They ....... milk so they can't make a cake.");
	    lbltheyMilk.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lbltheyMilk.setBounds(10, 373, 368, 23);
	    Test5.add(lbltheyMilk);
	    
	    JRadioButton seventynine = new JRadioButton("have");
	    seventynine.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    seventynine.setBackground(new Color(199, 21, 133));
	    seventynine.setForeground(new Color(0, 0, 0));
	    seventynine.setBounds(6, 394, 67, 23);
	    Test5.add(seventynine);
	    test5_5.add(seventynine);
	    uncorrectOptions5.add(seventynine);
	    
	    JRadioButton eighty = new JRadioButton("has got");
	    eighty.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eighty.setBackground(new Color(199, 21, 133));
	    eighty.setForeground(new Color(0, 0, 0));
	    eighty.setBounds(121, 394, 113, 23);
	    Test5.add(eighty);
	    test5_5.add(eighty);
	    uncorrectOptions5.add(eighty);
	    
	    JRadioButton eightyone = new JRadioButton("haven't got");
	    eightyone.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightyone.setBackground(new Color(199, 21, 133));
	    eightyone.setForeground(new Color(0, 0, 0));
	    eightyone.setBounds(249, 394, 109, 23);
	    Test5.add(eightyone);
	    correctOptions5.add(eightyone);
	    test5_5.add(eightyone);
	    
	    JLabel lblSheBlonde = new JLabel("6)She ....... blonde hair but her brother ....... a black hair. ");
	    lblSheBlonde.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblSheBlonde.setBounds(10, 437, 486, 14);
	    Test5.add(lblSheBlonde);
	    
	    JRadioButton eightytwo = new JRadioButton("has/have");
	    eightytwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightytwo.setBackground(new Color(199, 21, 133));
	    eightytwo.setForeground(new Color(0, 0, 0));
	    eightytwo.setBounds(10, 456, 109, 23);
	    Test5.add(eightytwo);
	    test5_6.add(eightytwo);
	    uncorrectOptions5.add(eightytwo);
	    
	    JRadioButton eightythree = new JRadioButton("has/has");
	    eightythree.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightythree.setBackground(new Color(199, 21, 133));
	    eightythree.setForeground(new Color(0, 0, 0));
	    eightythree.setBounds(143, 456, 109, 23);
	    Test5.add(eightythree);
	    correctOptions5.add(eightythree);
	    test5_6.add(eightythree);
	    
	    JRadioButton eightyfour = new JRadioButton("has/hasn't got");
	    eightyfour.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightyfour.setBackground(new Color(199, 21, 133));
	    eightyfour.setForeground(new Color(0, 0, 0));
	    eightyfour.setBounds(249, 458, 139, 23);
	    Test5.add(eightyfour);
	    test5_6.add(eightyfour);
	    uncorrectOptions5.add(eightyfour);
	    
	    JLabel label = new JLabel("");
	    label.setBounds(168, 543, 46, 14);
	    Test5.add(label);
	    
	    JLabel lblNewLabel_22 = new JLabel("New label");
	    lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test5\\img_2560_2c.png"));
	    lblNewLabel_22.setBounds(70, 484, 99, 107);
	    Test5.add(lblNewLabel_22);
	    
	    JLabel lblNewLabel_23 = new JLabel("New label");
	    lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test5\\woman-with-glasses-black-hair-th.png"));
	    lblNewLabel_23.setBounds(259, 498, 109, 78);
	    Test5.add(lblNewLabel_23);
	    
	    JLabel lblYouGot = new JLabel("7)......... you got English book? No, I ............. .");
	    lblYouGot.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblYouGot.setBounds(10, 602, 258, 14);
	    Test5.add(lblYouGot);
	    
	    JRadioButton rdbtnHasHas = new JRadioButton("Has/ has");
	    rdbtnHasHas.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnHasHas.setBackground(new Color(199, 21, 133));
	    rdbtnHasHas.setForeground(new Color(0, 0, 0));
	    rdbtnHasHas.setBounds(10, 623, 113, 23);
	    Test5.add(rdbtnHasHas);
	    test5_7.add(rdbtnHasHas);
	    uncorrectOptions5.add(rdbtnHasHas);
	    
	    JRadioButton eightyfive = new JRadioButton("Have/ have");
	    eightyfive.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightyfive.setBackground(new Color(199, 21, 133));
	    eightyfive.setForeground(new Color(0, 0, 0));
	    eightyfive.setBounds(143, 623, 125, 23);
	    Test5.add(eightyfive);
	    test5_7.add(eightyfive);
	    uncorrectOptions5.add(eightyfive);
	    
	    JRadioButton eightysix = new JRadioButton("Have / haven't got");
	    eightysix.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    eightysix.setBackground(new Color(199, 21, 133));
	    eightysix.setForeground(new Color(0, 0, 0));
	    eightysix.setBounds(298, 623, 159, 23);
	    Test5.add(eightysix);
	    correctOptions5.add(eightysix);
	    test5_7.add(eightysix);
	    
	    JButton btnEvaluate_3 = new JButton("Evaluate");
	    btnEvaluate_3.setBackground(new Color(255, 105, 180));
	    btnEvaluate_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int result5 = 0;
				for (JRadioButton rdbn : correctOptions5){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result5=result5+10;
					}
					
				}
				for (Component comp : Test2.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions5.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult5 = Integer.toString(result5);
				textField_5.setText(strResult5);
				
			
				
				Date nowTime= new Date();
				
				
				
				String str5="Test 5 ---- " +"Result: " +strResult5 + "----" + nowTime ;
				File file= new File("test5.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test5.txt",true));
					output.append(str5);
					output.close();
					
					
//					FileWriter fileWriter= new FileWriter(file, false);
//					BufferedWriter bWriter= new BufferedWriter(fileWriter);
//					bWriter.write(str);
//					bWriter.newLine();
														
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						//PrintWriter writer = new PrintWriter();
						
						File fout=new File("test5.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str5) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
						
						
						
//						Writer output;
//						output=new BufferedWriter(new FileWriter("dosya1.txt",true));
//						output.write("New Line!!\n");
//						output.write("\n\n") ;
//						output.close();
						
//						FileWriter fileWriter= new FileWriter(file, false);
//						BufferedWriter bWriter= new BufferedWriter(fileWriter);
//						bWriter.write(str);
//						bWriter.newLine();
//						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    	}}
	    });
	    btnEvaluate_3.setBounds(10, 668, 89, 23);
	    Test5.add(btnEvaluate_3);
	    
	    JButton btnClear_3 = new JButton("Clear");
	    btnClear_3.setBackground(new Color(255, 105, 180));
	    btnClear_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for (JRadioButton rdbn : correctOptions5){
					rdbn.setForeground(new Color(51, 51, 51));
				}
	    		for (JRadioButton rdbn : uncorrectOptions5){
					rdbn.setForeground(new Color(51, 51, 51));
				}
				
				textField_5.setText("");
	    	}
	    	
	    });
	    btnClear_3.setBounds(143, 668, 89, 23);
	    Test5.add(btnClear_3);
	    
	    JLabel lblResult_3 = new JLabel("Result:");
	    lblResult_3.setForeground(Color.PINK);
	    lblResult_3.setBounds(259, 672, 46, 14);
	    Test5.add(lblResult_3);
	    
	    textField_5 = new JTextField();
	    textField_5.setBackground(new Color(255, 105, 180));
	    textField_5.setBounds(302, 669, 86, 20);
	    Test5.add(textField_5);
	    textField_5.setColumns(10);
	    
	    JLabel lblNewLabel_24 = new JLabel("New label");
	    lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test5\\4930951-car-icon.jpg"));
	    lblNewLabel_24.setBounds(282, 25, 99, 62);
	    Test5.add(lblNewLabel_24);
	    
	    JLabel lblNewLabel_25 = new JLabel("New label");
	    lblNewLabel_25.setIcon(new ImageIcon("C:\\Users\\asus\\workspace\\EnglishForKids1\\img\\test5\\More_2_Love_Dog-icon.png"));
	    lblNewLabel_25.setBounds(282, 165, 106, 96);
	    Test5.add(lblNewLabel_25);
	    
	    JButton btnAllScores_3 = new JButton("All Scores");
	    btnAllScores_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    btnAllScores_3.setBounds(430, 668, 113, 23);
	    btnAllScores_3.setBackground(new Color(255, 105, 180));
	    Test5.add(btnAllScores_3);
	    tabbedPane.addTab("Test5", null, scrollPane5, null);
	    
//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//
	    final JPanel Test6 = new JPanel();
	    Test6.setBackground(new Color(135, 206, 235));
	    Test6.setLayout(null);
	    Test6.setPreferredSize(new Dimension(350, 700));
	    
	    JScrollPane scrollPane6 = new JScrollPane(Test6);
	    
	    JLabel lbleveryoneLikesAn = new JLabel("1)Everyone likes an ....... person.");
	    lbleveryoneLikesAn.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lbleveryoneLikesAn.setBackground(new Color(25, 25, 112));
	    lbleveryoneLikesAn.setBounds(10, 11, 329, 14);
	    Test6.add(lbleveryoneLikesAn);
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("honest");
	    rdbtnNewRadioButton.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton.setBounds(6, 32, 109, 23);
	    Test6.add(rdbtnNewRadioButton);
	    correctOptions6.add(rdbtnNewRadioButton);
	    test6_1.add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("honestly");
	    rdbtnNewRadioButton_1.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_1.setBounds(132, 32, 109, 23);
	    Test6.add(rdbtnNewRadioButton_1);
	    test6_1.add(rdbtnNewRadioButton_1);
	    uncorrectOptions6.add(rdbtnNewRadioButton_1);
	    
	    JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("sad");
	    rdbtnNewRadioButton_2.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_2.setBounds(276, 34, 109, 23);
	    Test6.add(rdbtnNewRadioButton_2);
	    test6_1.add(rdbtnNewRadioButton_2);
	    uncorrectOptions6.add(rdbtnNewRadioButton_2);
	    
	    JLabel lblNewLabel_26 = new JLabel("2)Bob wasn't thinking ..............");
	    lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblNewLabel_26.setBounds(10, 72, 275, 23);
	    Test6.add(lblNewLabel_26);
	    
	    JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("clear");
	    rdbtnNewRadioButton_3.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_3.setBounds(10, 113, 109, 23);
	    Test6.add(rdbtnNewRadioButton_3);
	    test6_2.add(rdbtnNewRadioButton_3);
	    uncorrectOptions6.add(rdbtnNewRadioButton_3);
	    
	    JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("clearly");
	    rdbtnNewRadioButton_4.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_4.setBounds(132, 113, 109, 23);
	    Test6.add(rdbtnNewRadioButton_4);
	    correctOptions6.add(rdbtnNewRadioButton_4);
	    test6_2.add(rdbtnNewRadioButton_4);
	    
	    JRadioButton rdbtnHappy = new JRadioButton("happy");
	    rdbtnHappy.setBackground(new Color(135, 206, 235));
	    rdbtnHappy.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnHappy.setBounds(295, 113, 109, 23);
	    Test6.add(rdbtnHappy);
	    test6_2.add(rdbtnNewRadioButton_4);
	    uncorrectOptions6.add(rdbtnNewRadioButton_4);
	    
	    JLabel lblthatIsA = new JLabel("3)That is a ............. animal.");
	    lblthatIsA.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblthatIsA.setBounds(10, 146, 289, 23);
	    Test6.add(lblthatIsA);
	    
	    JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("real strange");
	    rdbtnNewRadioButton_5.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_5.setBounds(10, 176, 109, 23);
	    Test6.add(rdbtnNewRadioButton_5);
	    test6_3.add(rdbtnNewRadioButton_5);
	    uncorrectOptions6.add(rdbtnNewRadioButton_5);
	    
	    JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("really strange");
	    rdbtnNewRadioButton_6.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_6.setBounds(132, 176, 132, 23);
	    Test6.add(rdbtnNewRadioButton_6);
	    correctOptions6.add(rdbtnNewRadioButton_6);
	    test6_3.add(rdbtnNewRadioButton_6);
	    
	    JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("relative");
	    rdbtnNewRadioButton_7.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_7.setBounds(295, 176, 109, 23);
	    Test6.add(rdbtnNewRadioButton_7);
	    test6_3.add(rdbtnNewRadioButton_7);
	    uncorrectOptions6.add(rdbtnNewRadioButton_7);
	    
	    JLabel lblsaraSings = new JLabel("4)Sara sings ................ well.");
	    lblsaraSings.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblsaraSings.setBounds(10, 215, 316, 23);
	    Test6.add(lblsaraSings);
	    
	    JRadioButton rdbtnRelative = new JRadioButton("relative");
	    rdbtnRelative.setBackground(new Color(135, 206, 235));
	    rdbtnRelative.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnRelative.setBounds(10, 245, 109, 23);
	    Test6.add(rdbtnRelative);
	    test6_4.add(rdbtnRelative);
	    uncorrectOptions6.add(rdbtnRelative);
	    
	    JRadioButton rdbtnRelatively = new JRadioButton("relatively");
	    rdbtnRelatively.setBackground(new Color(135, 206, 235));
	    rdbtnRelatively.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnRelatively.setBounds(132, 245, 109, 23);
	    Test6.add(rdbtnRelatively);
	    correctOptions6.add(rdbtnRelatively);
	    test6_4.add(rdbtnRelatively);
	    
	    JLabel lblyouSpeakEnglish = new JLabel("5)You speak English ...............");
	    lblyouSpeakEnglish.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblyouSpeakEnglish.setBounds(10, 275, 275, 23);
	    Test6.add(lblyouSpeakEnglish);
	    
	    JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("very well");
	    rdbtnNewRadioButton_8.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_8.setBounds(10, 305, 105, 23);
	    Test6.add(rdbtnNewRadioButton_8);
	    correctOptions6.add(rdbtnNewRadioButton_8);
	    test6_5.add(rdbtnNewRadioButton_8);
	    
	    JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("very good");
	    rdbtnNewRadioButton_9.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_9.setBounds(132, 305, 109, 23);
	    Test6.add(rdbtnNewRadioButton_9);
	    test6_5.add(rdbtnNewRadioButton_9);
	    uncorrectOptions6.add(rdbtnNewRadioButton_9);
	    
	    JLabel lblNewLabel_27 = new JLabel("6)The police  ................. inspected the car.");
	    lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblNewLabel_27.setBounds(10, 335, 375, 28);
	    Test6.add(lblNewLabel_27);
	    
	    JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("complete");
	    rdbtnNewRadioButton_10.setBackground(new Color(135, 206, 235));
	    rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnNewRadioButton_10.setBounds(10, 370, 109, 23);
	    Test6.add(rdbtnNewRadioButton_10);
	    test6_6.add(rdbtnNewRadioButton_10);
	    uncorrectOptions6.add(rdbtnNewRadioButton_10);
	    
	    JRadioButton rdbtnCompletely = new JRadioButton("completely");
	    rdbtnCompletely.setBackground(new Color(135, 206, 235));
	    rdbtnCompletely.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnCompletely.setBounds(132, 370, 109, 23);
	    Test6.add(rdbtnCompletely);
	    correctOptions6.add(rdbtnCompletely);
	    test6_6.add(rdbtnCompletely);
	    
	    JButton btnEvaluate_4 = new JButton("Evaluate");
	    btnEvaluate_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		int result6 = 0;
				for (JRadioButton rdbn : correctOptions6){
					rdbn.setForeground(new Color(50, 20, 50));
					if (rdbn.isSelected()){
						rdbn.setForeground(new Color(50,205,50));
						
						result6=result6+10;
					}
					
				}
				for (Component comp : Test6.getComponents()){
					if (comp instanceof JRadioButton){
						JRadioButton rdbtn = (JRadioButton) comp;
						if (rdbtn.isSelected() && (!correctOptions6.contains(rdbtn))){
							rdbtn.setForeground(Color.RED);
						}
					}
					
				}
				
				
				String strResult6 = Integer.toString(result6);
				textField_6.setText(strResult6);
				
				
				
				Date nowTime= new Date();
				
				
				
				String str6="Test 6 ---- " +"Result: " +strResult6 + "----" + nowTime ;
				File file= new File("test1.txt") ;
				
				BufferedWriter bWriter;
				
				if(!file.exists()) {
					try {
					file.createNewFile();
					Writer output;
					output=new BufferedWriter(new FileWriter("test6.txt",true));
					output.append(str6);
					output.close();
					
					
//					FileWriter fileWriter= new FileWriter(file, false);
//					BufferedWriter bWriter= new BufferedWriter(fileWriter);
//					bWriter.write(str);
//					bWriter.newLine();
														
				}  
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				else{
														
					try {
						//PrintWriter writer = new PrintWriter();
						
						File fout=new File("test6.txt");
						FileOutputStream fos = new FileOutputStream(fout);
						BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(fos)));
								
						bw.write(str6) ;
						System.lineSeparator();
						
						bw.close();
						System.lineSeparator();
						
						
						
						
//						Writer output;
//						output=new BufferedWriter(new FileWriter("dosya1.txt",true));
//						output.write("New Line!!\n");
//						output.write("\n\n") ;
//						output.close();
						
//						FileWriter fileWriter= new FileWriter(file, false);
//						BufferedWriter bWriter= new BufferedWriter(fileWriter);
//						bWriter.write(str);
//						bWriter.newLine();
//						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    		
	    	}
				}
	    });
	    btnEvaluate_4.setBackground(new Color(255, 0, 0));
	    btnEvaluate_4.setBounds(26, 424, 89, 23);
	    Test6.add(btnEvaluate_4);
	    
	    JButton btnClear_4 = new JButton("Clear");
	    btnClear_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for (JRadioButton rdbn : correctOptions6){
					rdbn.setForeground(new Color(51, 51, 51));
				}
	    		for (JRadioButton rdbn : uncorrectOptions6){
					rdbn.setForeground(new Color(51, 51, 51));
				}
								
				textField_6.setText("");
	    		
	    	}
	    });
	    btnClear_4.setBackground(new Color(255, 0, 0));
	    btnClear_4.setBounds(152, 424, 89, 23);
	    Test6.add(btnClear_4);
	    
	    JLabel lblResult_4 = new JLabel("Result:");
	    lblResult_4.setBounds(276, 428, 46, 14);
	    Test6.add(lblResult_4);
	    
	    textField_6 = new JTextField();
	    textField_6.setBackground(new Color(255, 127, 80));
	    textField_6.setBounds(314, 425, 86, 20);
	    Test6.add(textField_6);
	    textField_6.setColumns(10);
	    
	    JButton btnNewButton = new JButton("All Scores");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	
	    		
	    		try{
	    			JFrame frame1 = new JFrame("*** All Tests Scores ***");
	    			frame1.setBounds(300,300,350,230);
		    		JTextArea ta = new JTextArea();
		    		
	    			
	    			File f= new File("test1.txt");
	    			FileReader fr = new FileReader(f);
	    			BufferedReader br = new BufferedReader(fr);
	    			String line1 = br.readLine();
	    			
	    			File f2= new File("test2.txt");
	    			FileReader fr2 = new FileReader(f2);
	    			BufferedReader br2 = new BufferedReader(fr2);
	    			String line2 = br2.readLine();
	    			
	    			File f3= new File("test3.txt");
	    			FileReader fr3 = new FileReader(f3);
	    			BufferedReader br3 = new BufferedReader(fr3);
	    			String line3 = br3.readLine();
	    			
	    			File f4= new File("test4.txt");
	    			FileReader fr4 = new FileReader(f4);
	    			BufferedReader br4 = new BufferedReader(fr4);
	    			String line4 = br4.readLine();
	    			
	    			File f5= new File("test5.txt");
	    			FileReader fr5 = new FileReader(f5);
	    			BufferedReader br5 = new BufferedReader(fr5);
	    			String line5 = br5.readLine();
	    			
	    			File f6= new File("test6.txt");
	    			FileReader fr6 = new FileReader(f6);
	    			BufferedReader br6 = new BufferedReader(fr6);
	    			String line6 = br6.readLine();
	    			
	    			ta.setText(line1 +"\n\n" + line2+"\n\n"+line3 +"\n\n" + line4+"\n\n"+line5 +"\n\n" + line6);
	    			frame1.getContentPane().add(ta);
		    		frame1.setVisible(true);
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    btnNewButton.setBounds(420, 424, 113, 23);
	    btnNewButton.setBackground(new Color(255, 0, 0));
	    Test6.add(btnNewButton);
	    tabbedPane.addTab("Test6", null, scrollPane6, null);
//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//

//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//

//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//***////***//**//**//**//**//**//
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setBackground(new Color(204, 204, 255));
	    frame.getContentPane().add(menuBar, BorderLayout.NORTH);
	    
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
			public void mouseClicked(MouseEvent e) {
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
				Game game= new Game();
				game.setVisible(true);
			
			}
		});
		menuBar.add(mnGame);
		
		JMenu mnTests = new JMenu("Tests");
		mnTests.setOpaque(true);
		mnTests.setBackground(Color.GREEN);
		mnTests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		menuBar.add(mnTests);
		
		JMenu mnDictionary = new JMenu("Dictionary");
		mnDictionary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					final JPanel panel = new JPanel();

					JOptionPane.showMessageDialog(panel, "Dictionary requires Internet Connection !!! ", "Message", JOptionPane.INFORMATION_MESSAGE);
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
		
	}
	public void setVisible1(boolean v) {
		frame.setVisible(v);
		
	} 
	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}



