package View;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class TelaBase extends JFrame{
    public TelaBase(String title){
        setSize(658, 521);
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/Assets/icon.png").getImage());
        setVisible(true);
    }
}
