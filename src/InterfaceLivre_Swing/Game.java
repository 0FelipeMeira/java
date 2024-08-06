package InterfaceLivre_Swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {
    private final Tela tela;
    private final Button btn;
    private final int screenHeight;
    private final int screemWidth;

    public Game(Tela tela, Button btn, int screenWidth, int screenHeight){
        /**
         * Class created to start the game logic
        */
        
        this.btn = btn;
        this.tela = tela;
        this.screemWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        /**
         * Method called every time a key of the keyboard is pressed
         * and if is 'W','S','A','D' or one of the arrow keys, call the move method
         */
        // WASD and Arrows Keys
        switch (e.getKeyCode()) {
            case 37, 38, 39, 40, 65, 68, 87, 83 -> move(e.getKeyCode());
        }
    }
    private void move(int keyCode){
        /**
         * Method used to move the screen:
         *  - Every time a movement key is pressed, move the screen
         * for that specific direction and moves the button towards it
         */
        switch (keyCode) {
            // Move left: Left arrow or 'A'
            case 37, 65 -> {
                if (this.tela.getX() > 0) {
                    this.tela.setLocation(this.tela.getX() - 20, this.tela.getY());
                    this.btn.setLocation(this.btn.getX()+20, this.btn.getY());
                }
            }
            // Move Up: Up arrow or 'W'
            case 38, 87 -> {
                if (this.tela.getY() > 0) {
                    this.tela.setLocation(this.tela.getX(), this.tela.getY() - 20);
                    this.btn.setLocation(this.btn.getX(), this.btn.getY() + 20);
                }
            }
            // Move Right: Right arrow or 'D'
            case 39, 68 -> {
                if (this.tela.getX() + this.tela.getWidth() < this.screemWidth) {
                    this.tela.setLocation(this.tela.getX() + 20, this.tela.getY());
                    this.btn.setLocation(this.btn.getX() - 20, this.btn.getY());
                }
            }
            // Move Down: Down arrow or 'S'
            case 40, 83 -> {
                if (this.tela.getY() + this.tela.getHeight() < this.screenHeight) {
                    this.tela.setLocation(this.tela.getX(), this.tela.getY() + 20);
                    this.btn.setLocation(this.btn.getX(), this.btn.getY() - 20);
                }
            }
        }
    }

    // methods implemented by the interface 'KeyListener', but dont need to be used
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
