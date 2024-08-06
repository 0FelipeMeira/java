package InterfaceLivre_Swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Tela extends JFrame {
    private final int screenWidth;
    private final int screenHeight;
    private final Button button;
    private final CloseBtn close;
    private final Random rnd = new Random();


    Tela(String title){
        /**
         * Method to start the game
         */
        
         // Config of the screen
        super(title);
        this.setBounds(0,0,250,250);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground( Color.WHITE );
        this.setUndecorated(true);
        this.setVisible(true);
        
        // Getting the width of the monitor
        this.screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        // Setting max pos to generate the button
        int newPosX = this.rnd.nextInt(screenWidth-100);
        int newPosY = this.rnd.nextInt(screenHeight-100);
        // Creating the button
        this.button = new Button(newPosX, newPosY );

        // Creating the close Buton - Somehow only show if you minimize the screen and open again       
        this.close = new CloseBtn();

        // Finish the game when the button is clicked
        this.button.addActionListener(e -> {
            this.finishGame();
        });

        // Start the game
        Game game = new Game(this, this.button, this.screenWidth, this.screenHeight);

        this.addKeyListener(game);
        this.add(close);
        this.add(this.button);
    }

    private void finishGame(){
        /**
         * Method to change all the screen to center and display finish messages
         *   only showed when button is clicked
         */
        // screen config
        this.setBounds((screenWidth-200)/2 , (screenHeight-200)/2, 200,200);

        // new labels
        Label text = new Label("Oh no, you found me,",25,-50);
        Label text2 = new Label("Let me try again!",25,-30);
        this.add(text);
        this.add(text2);
        
        // change button
        this.button.setBounds(25,100,150,50);
        this.button.setText("End Game");
        this.button.setIcon(new ImageIcon());
        
        // kill the app
        this.button.addActionListener(e -> System.exit(0));
        
        // hide close button
        this.close.setVisible(false);
    }
}