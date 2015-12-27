package EnglishForKids;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.reflect.Array;

public class Hangman extends JPanel implements ActionListener{

    static final int DEAD=13;   // amount of errors till loss
    private int errors;        // amount of errors
    private String message;   // error or victorie
    private String information; // information of the message
    private String rword;      // the rword
    private StringBuffer gword;// the gword
    private JButton bStart;      // Button "Restart"
    private JTextField tfLetter; // letter box
    private Font fnt;           // common font
    

    Hangman() {

        fnt = new Font( "Monospaced", 20, 20 );
        setFont(fnt);

        // Create textbox for guess letter
        tfLetter = new JTextField(4);
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        // Create buttons and labels

        bStart = new JButton("Restart");
        add(bStart);
        JLabel label = new JLabel("Guess a letter:");
        add(label);
        add(tfLetter);

        // Buttons are events:
        bStart.addActionListener(this);
        tfLetter.addActionListener(this);

        validate();

        // Start first game
        initGame();
        setPreferredSize(new Dimension(300,300));
        
    }

    public void initGame(){
    	

        /* Setting the errors to 0 */
        errors=0;


        /* Enter the wordslist, separated by a | here: */
        String str = "computer|radio|calculator|teacher|bureau|police|geometry|president|subject|country|enviroment|classroom|animals|province|month|politics|puzzle|instrument|kitchen|language|vampire|ghost|solution|service|software|virus25|security|phonenumber|expert|website|agreement|support|compatibility|advanced|search|triathlon|immediately|encyclopedia|endurance|distance|nature|history|organization|international|championship|government|popularity|thousand|feature|wetsuit|fitness|legendary|variation|equal|approximately|segment|priority|physics|branche|science|mathematics|lightning|dispersion|accelerator|detector|terminology|design|operation|foundation|application|prediction|reference|measurement|concept|perspective|overview|position|airplane|symmetry|dimension|toxic|algebra|illustration|classic|verification|citation|unusual|resource|analysis|license|comedy|screenplay|production|release|emphasis|director|trademark|vehicle|aircraft|experiment";
        String[] temp;

        /* delimiter */
        String delimiter = "\\|";

        /* given string will be split by the argument delimiter provided. */
        temp = str.split(delimiter);

        /* Setting the seed */
        Random randomGenerator = new Random();

        /* Generating random number */
        int randomInt = randomGenerator.nextInt(temp.length);
        rword = new String(temp[randomInt]);
        char positions[] = new char[rword.length()];
        for (int i=0; i<rword.length(); i++) {
                positions[i] = '-';
        }
        String s = new String(positions);
        gword = new StringBuffer(s);
        tfLetter.setText("");

        // Delete the messages
        message="";
        information = "";
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        // Draw the hangman
        int baseY = 250;

        if (errors >  0){    // ground
                g.drawLine(90, baseY,200,baseY);
        }
        if (errors >  1){    // bar up
                g.drawLine(125,baseY,125,baseY-100);
        }
        if (errors >  2){
                g.drawLine(110,baseY,125,baseY-15);
        }
        if (errors >  3){
                g.drawLine(140,baseY,125,baseY-15);
        }
        if (errors >  4){    // side bar
                g.drawLine(125,baseY-100,175,baseY-100);
        }
        if (errors >  5){
                g.drawLine(125,baseY-85,140,baseY-100);
        }
        if (errors >  6){    // rope
                g.drawLine(175,baseY-100,175,baseY-75);
        }
        if (errors >  7){    // body
                g.drawOval(170,baseY-75,10,12);
        }
        if (errors >  8){
                g.drawOval(170,baseY-65,15,25);
        }
        if (errors >  9){    // arms
                g.drawLine(160,baseY-65,170,baseY-60);
        }
        if (errors > 10){
                g.drawLine(183,baseY-60,193,baseY-65);
        }
        if (errors > 11){    // legs
                g.drawLine(165,baseY-30,170,baseY-45);
        }
        if (errors > 12){
                g.drawLine(183,baseY-45,193,baseY-30);
        }

        // Show the messages
        g.drawString( message, 40, baseY+25 );
        g.drawString( information, 25, baseY+45 );
        g.drawString( new String (gword), 110, 60);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bStart){
            initGame();
        }
        if (e.getSource().equals(tfLetter)){
            processTurn();
            // Delete the letter input box
            tfLetter.setText("");
            repaint();
        }
    }
    private void processTurn(){
        String s, t;
        char a;

        s = tfLetter.getText();
        a = s.charAt(0);

        if (!Character.isLetter(a)){
                  message="Only enter letters!";
                  return;
        }
        if (s.length()>1){
                  message="One letter at a time!";
                  return;
        }

        // Has the letter been guessed

        t = new String(gword);
        if (t.indexOf(s) != -1){
                message="Letter has already been guessed";
                return;
        }

        // If the letter doesn't occur in the rword

        if (rword.indexOf(s) == -1){
                message="";
                errors++;
                if (errors==DEAD){
                        message="You lost!";
                        information =
                              "Click on restart for another chance!";
                }

                return;
        }

        // Replace dots in gword with the found letter.

        for (int i=0; i<rword.length(); i++){
                if (rword.charAt(i) == a){
                        gword.setCharAt(i, a);
                }
        }
        t = new String(gword);

        // If all the dots have been filled, you win

        if (t.indexOf('.') == -1){
                message="You win!";
                return;
        }

        // Delete message

        message="";
            repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JPanel hangman = new Hangman();
                JOptionPane.showMessageDialog(null, hangman, "HANGMAN", JOptionPane.QUESTION_MESSAGE);
               
            }
        });
    }
}
