package InterfaceLivre_Swing;

import javax.swing.*;
import java.awt.*;

public class CloseBtn extends JButton {
    CloseBtn(){
        /**
         * Class to create a button to close the application
         */
        super("X");
        this.setBounds(10,10,45,45);
        this.setBackground(Color.RED);
        this.addActionListener( e -> System.exit(0));
    }
}