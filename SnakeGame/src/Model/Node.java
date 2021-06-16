package Model;

import java.awt.Graphics;

public abstract class Node {
    public static final int TAMANHO = 20;
    private int x;
    private int y;  

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public abstract void desenhar(Graphics g);
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }       
}
