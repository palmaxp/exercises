package Model;

import java.awt.Graphics;
import java.util.ArrayList;

public class Saracura {    
    private ArrayList<Node> Saracura;
    
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

    public ArrayList<Node> getSaracura() {
        return Saracura;
    }
    public void setSaracura(ArrayList<Node> Saracura) {
        this.Saracura = Saracura;
    }  
    
}
