package Model;

import java.awt.Color;
import java.awt.Graphics;

public class SaracuraBody extends Node{
    public SaracuraBody(int x, int y){
        super(x,y);
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(Color.getHSBColor(234, 240, 64));
        g.fillRoundRect(this.getX(), this.getY(), Node.TAMANHO, Node.TAMANHO, 100, 10);
    }
}
   