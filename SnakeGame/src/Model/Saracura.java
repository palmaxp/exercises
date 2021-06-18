package Model;

import java.awt.Graphics;
import java.util.ArrayList;

public class Saracura {    
    private ArrayList<Node> Saracura;
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int RIGHT = 3;
    public static final int LEFT = 4;
    
    public Saracura(int x, int y){
        Saracura = new ArrayList();
        SaracuraBody cabeca = new SaracuraBody(x, y);
        SaracuraBody corpo = new SaracuraBody(x-20, y);
        SaracuraBody rabo = new SaracuraBody(x-40, y);
        Saracura.add(cabeca);
        Saracura.add(corpo);
        Saracura.add(rabo);
    }
    public void crescerSaracura(){
        SaracuraBody newBody = (SaracuraBody)this.Saracura.get(this.Saracura.size() - 1);
        this.Saracura.add(new SaracuraBody(newBody.getX(), newBody.getY()));
    }
    public void desenhar(Graphics g){
        for (int i = 0; i < this.Saracura.size(); i++) {
            this.Saracura.get(i).desenhar(g);
        }
    }
    
    public void atualizar(int direcao){
        for (int i = this.Saracura.size() - 1; i > 0; i--) {
            this.Saracura.get(i).mover(this.Saracura.get(i-1).getX(), this.Saracura.get(i-1).getY());
        }

        switch(direcao){
            case UP:
                this.Saracura.get(0).setY(this.Saracura.get(0).getY() - Node.TAMANHO);
                break;
            case DOWN:
                this.Saracura.get(0).setY(this.Saracura.get(0).getY() + Node.TAMANHO);
                break;
            case RIGHT:
                this.Saracura.get(0).setX(this.Saracura.get(0).getX() + Node.TAMANHO);
                break;
            case LEFT:
                this.Saracura.get(0).setX(this.Saracura.get(0).getX() - Node.TAMANHO);
                break;
        }
    }

    public ArrayList<Node> getSaracura() {
        return Saracura;
    }
    public void setSaracura(ArrayList<Node> Saracura) {
        this.Saracura = Saracura;
    }  
    
}
