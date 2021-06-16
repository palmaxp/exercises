package Model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Target extends Node{
    private ImageIcon target;
        
    public Target(int x, int y) {
        super(x, y);
        this.target = new ImageIcon("src/Assets/bolinha.png");
    }
    @Override
    public void desenhar(Graphics g) {
        g.drawImage(this.target.getImage(), getX(), getY(), Node.TAMANHO, Node.TAMANHO, null);
        g.setColor(Color.darkGray);
    }   
}
