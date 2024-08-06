package InterfaceLivre_Swing;

import javax.swing.*;
import java.util.Objects;

public class Button extends JButton {

    public Button(int x, int y) {
        /**
         * Class to create a Button with an icon into the screen 
         */
        this.setBounds(x,y,100,100);

        try {
            this.setIcon( new ImageIcon(Objects.requireNonNull(getClass().getResource("/InterfaceLivre_Swing/imgs/turtlegif.gif"))));
        }
        catch (Exception e ){
            e.printStackTrace();
        }

        this.setBorder(null);
    }

}
