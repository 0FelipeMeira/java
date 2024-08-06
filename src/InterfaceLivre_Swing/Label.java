package InterfaceLivre_Swing;

import javax.swing.*;

public class Label extends JLabel {
    public Label(String text, int posX, int posY){
        /**
         * Class created to insert Label into the screen
         */
        super(text);
        this.setBounds(posX,posY,200,200);
    }
}
