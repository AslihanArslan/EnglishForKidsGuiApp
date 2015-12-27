package EnglishForKids;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.ObjectInputStream.GetField;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit.FontFamilyAction;


public class Reading  {
	
	String story1 = "A lion was getting fed up of hunting. He called all animals and passed an order,\n\n " +
			"''Everyday one of you should come by yourself as my prey.''" +  "All animals started to obey this order.\n\n" +
			"It was the hare's day. The hare was very sad. As he was going to the lion's den, he came across an old well."+ 
			"He looked into it. It was very deep and dangerous. He made a plan to his mind.\n\n"+
			"The lion was very angry that no animal had come that day. The hare slowly came towards the lion." + 
			"The lion roared ''Why are you late?'' The hare humbly replied, ''Oh my way another lion chased me." +
			"I got away with much difficulty to give my life to you, Your Majesty.''\n\n" +
			"The lion was pleased with the hare. But the thought of another lion in the jungle made him angry. " + 
			"The lion roared ''Do you know where he lives?'' The hare replied ''Yes, Sir. Please come with me.''\n\n " +
			"The hare took the lion to the old well. He said ''Sir, that lion lives in this well''" +  
			"The lion peeped into the well. He mistook his reflection for another lion.\n\n " +
			"He roared and there was an echo." +
			" He thought that the other lion was roaring too and jumped into the well. That was the end of the lion. ";

	String storyAnt = "It was summer, hot and sunny, and, instead of working and preparing for winter, a Grasshopper preferred to dance, " +
					  "sing and play his violin at his leisure, not minding that these wonderful days will soon be over, that cold and rainy days will soon be near.\n\n" +
					  "On seeing a hardworking Ant passing by him, preparing for the hard winter that was to come one day, he invited him to join him and share his fun. \n\n" + 
	                  "'Unfortunately, I don’t have time for this'," + 
					  "the Ant answered, ''I must work hard, so that winter won’t find me without shelter and food.''\n\n"  +
					  "''Stop worrying so much, there is still plenty of time to prepare for winter. " +
	                  "Let’s sing and dance together, let’s laugh and enjoy life''.\n\n" +
	                  "But Ant was very wise and wouldn’t pay attention to the Grasshopper’s words and continued to work hard"+ 
	                  "and store food for the long winter that was to come."+
	                  "The winter came sooner than expected, and the Grasshopper found himself without home and without food.\n\n"+ 
	                  "He went to the Ant’s house and begged him for food and shelter." + 
	                  "''I'm sorry, but I can't help you'', the Ant said."+	 
	                  "''I only have room and food for me and my family, so go find help somewhere else. \n\n"+
	                  "''I should have followed Ant’s example in the summer'', the Grasshopper thought sadly." + 
	                  "''I would have been so happy now…''" ;
	
	String storyGOOse = "Once upon a time, a man and his wife had the good fortune to have a goose which laid a golden egg every day.\n\n"+ 
						"Lucky though they were, they soon began to think they were not getting rich fast enough.\n\n"+
						"They imagined that if the bird must be able to lay golden eggs, its insides must be made of gold."+
						"And they thought that if they could get all that precious metal at once, they would get mighty rich very soon.\n\n" +
						"So the man and his wife decided to kill the bird." +
						"However, upon cutting the goose open, they were shocked to find that its innards were like that of any other goose!" ;

String storyTortoise = "There once was a speedy hare who bragged about how fast he could run."+ 
					   "Tired of hearing him boast, Slow and Steady, the tortoise, challenged him to a race." +
					   "All the animals in the forest gathered to watch.\n\n" +
					   "Hare ran down the road for a while and then and paused to rest. " +
					   "He looked back at Slow and Steady and cried out,"+
					   "''How do you expect to win this race when you are walking along at your slow, slow pace?'' \n\n" +
					   "Hare stretched himself out alongside the road and fell asleep, thinking, ''There is plenty of time to relax.''"+
					   "Slow and Steady walked and walked. He never, ever stopped until he came to the finish line. \n\n"+
					   "The animals who were watching cheered so loudly for Tortoise, they woke up Hare." +
					   "Hare stretched and yawned and began to run again, but it was too late. Tortoise was over the line." ;

String storySnow = "Once upon a time there lived a lovely princess with fair skin and blue eyes."+ 
					"She was so fair that she was named Snow White.\n\n"+ 
					"Her mother died when Snow White was a baby and her father married again."+
					"This queen was very pretty but she was also very cruel.\n\n " +
					"The wicked stepmother wanted to be the most beautiful lady in the kingdom and " +
					"she would often ask her magic mirror, ''Mirror! Mirror on the wall! Who is the fairest of them all?''"+ 
					"And the magic mirror would say, ''You are, Your Majesty!'' \n\n " +
					"But one day, the mirror replied, ''Snow White is the fairest of them all!'' "+
					"The wicked queen was very angry and jealous of Snow White." + 
					"She ordered her huntsman to take Snow White to the forest and kill her.\n\n"+ 
					"'I want you to bring back her heart,' she ordered."+ 
					"But when the huntsman reached the forest with Snow White, he took pity on her and set her free."+ 
					"He killed a deer and took its heart to the wicked queen and told her that he had killed Snow White. \n\n"+ 
					"Snow White wandered in the forest all night, crying."+
					"When it was daylight, she came to a tiny cottage and went inside."+ 
					"There was nobody there, but she found seven plates on the table and seven tiny beds in the bedroom. " +
					"She cooked a wonderful meal and cleaned the house and tired, finally slept on one of the tiny beds. \n\n " +
					"At night, the seven dwarfs who lived in the cottage came home and found Snow White sleeping. " +
					"When she woke up and told them her story, the seven dwarfs asked her to stay with them. " +
					"When the dwarfs were away, Snow White would make delicious meals for them. \n\n " +
					"The dwarfs loved her and cared for her. Every morning, when they left the house, they instructed her never to open the door to strangers.\n\n"+
					"Meanwhile, in the palace, the wicked queen asked, ''Mirror! Mirror on the Who is the fairest of them''" +
					" The mirror replied, ''Snow White is the fairest of them all!" +
					"She lives with the seven dwarfs in the woods!''\n\n"+
					"The wicked stepmother was furious. " +
					"She was actually a witch knew how to make magic potions. " +
					"She now made a poisonous potion and dipped a shiny red apple into it. " +
					"Then she disguised herself as an old peasant woman and went to the woods with the apple.\n\n " +
					"She knocked on the cottage door and said ''Pretty little child! Let me in! Look what I have for you!''" +
					" White said, “I am so sorry, old lady, I cannot let you in! The seven dwarfs have told me not to talk to strangers!” " +
					"But then, Snow White saw the shiny red apple, and opened the door. \n\n " +
					"The wicked witch offered her the apple and when she took a bite poor Snow White fell into a deep sleep. " +
					"The wicked stepmother went back to the palace and asked the mirror, ''Mirror! Mirror on the wall! Who is the fairest of them all?'' \n\n " +
					"The mirror replied, ''You are, Your Majesty!'' and she was very happy."+
					"When the seven dwarfs came home to find Snow White lying on the floor, they were very upset. \n\n" +
					"They cried all night and then built a glass coffin for Snow White. " +
					"They kept the coffin in front of the cottage. " +
					"One day, Prince Charming was going past the cottage and he saw Snow White lying in the coffin.\n\n " +
					"He said to the dwarfs, ''My! My! She is so beautiful! " +
					"I would like to kiss her!'' And he did.\n\n"+ 
					"Immediately, Snow White opened her eyes. " +
					"She was alive again! The Prince and the seven dwarfs were very happy. " +
					"Prince Charming married Snow White and took her to his palace and lived happily ever after.\n\n"+
					"After that, Hare always reminded himself, ''Don't brag about your lightning pace, for Slow and Steady won the race!''";
	
	String[] stories={"---Select one stories---","The Lion and The Mouse","Snow White","The Hare and The Tortoise","The Ants and The Grasshopper",
	"The Goose with Golden Eggs"};
	private ItemHandler handler = new ItemHandler() ;
	
	JComboBox<String> comboBox;
	
	JFrame frame;
	JPanel panel ;
	Color labelColor,labelColor1;
	JTextArea txtArea ;
	JScrollPane scrollPane ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reading window = new Reading();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private void centerFrame(Reading window) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Reading() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * 
	 */
	
	
	private void initialize() {
		frame = new JFrame("English For Kids");
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("img/icon.jpg");
		frame.setIconImage(img.getImage());
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 204, 255));
		frame.setJMenuBar(menuBar);
		
		String[] stories={"---Select one stories---","The Lion and The Mouse","Snow White","The Hare and The Tortoise","The Ants and The Grasshopper",
		"The Goose with Golden Eggs"};
		
		comboBox = new JComboBox(stories);
		comboBox.setBackground(new Color(152, 251, 152));
		comboBox.setBounds(21, 0, 387, 48);
		
		 


		comboBox.setSelectedIndex(0);
		comboBox.addItemListener(handler);
		frame.getContentPane().setLayout(null);
		//frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(comboBox);
		
		scrollPane = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		scrollPane.setViewportBorder(null);
		
		scrollPane.setBounds(21, 65, 633, 443);
		frame.getContentPane().add(scrollPane);
		
		txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", Font.BOLD, 20));
		txtArea.setBackground(new Color(255, 165, 0));
		txtArea.setText("GOOD READING :)");
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		
		
		scrollPane.setViewportView(txtArea);
		
		
		

		
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
				
		
		
		mnReading.setOpaque(true);
		mnReading.setBackground(Color.GREEN);
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
				Tests test = new Tests();
				test.setVisible(true);
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

	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
	
	public void setVisible1(boolean v) {
		frame.setVisible(v);
		
	} 
	
	private class ItemHandler implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent event){
			JComboBox cb = (JComboBox) event.getSource();
			//if(event.getSource() == comboBox){
			String item = (String) cb.getSelectedItem();

				if(item.equalsIgnoreCase("The Lion and The Mouse")){
					txtArea.setText(story1);
					txtArea.setFont(new Font("Arial", Font.BOLD, 13));
				}else if(comboBox.getSelectedItem().equals("Snow White")){
					txtArea.setText(storySnow);
					txtArea.setFont(new Font("Arial", Font.BOLD, 13));
					
				}else if(comboBox.getSelectedItem().equals("The Hare and The Tortoise")){
					txtArea.setText(storyTortoise);
					txtArea.setFont(new Font("Arial", Font.BOLD, 13));
			
				}else if(comboBox.getSelectedItem().equals("The Ants and The Grasshopper")){
					txtArea.setText(storyAnt); 
					txtArea.setFont(new Font("Arial", Font.BOLD, 13));
				
				}else if(comboBox.getSelectedItem().equals("The Goose with Golden Eggs")){
					txtArea.setText(storyGOOse); 
					txtArea.setFont(new Font("Arial", Font.BOLD, 13));
				}else if(comboBox.getSelectedItem().equals("---Select one stories---")){
					txtArea.setText("GOOD READING :)");
					txtArea.setFont(new Font("Arial", Font.BOLD, 20));
				}
		
		}
	}
}
	
	





	
	
	
		

