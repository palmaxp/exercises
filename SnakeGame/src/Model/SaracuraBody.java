package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class SaracuraBody extends Node{
    public SaracuraBody(int x, int y){
        super(x,y);
    }

    @Override
    public void desenhar(Graphics g){
        Random gerarCor = new Random();
        g.setColor(Color.getHSBColor(gerarCor.nextInt(256), gerarCor.nextInt(256), gerarCor.nextInt(256)));
        g.fillRoundRect(this.getX(), this.getY(), Node.TAMANHO, Node.TAMANHO, 100, 10);
    }
}
   