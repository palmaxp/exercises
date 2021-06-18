package Controller;

import Model.Node;
import Model.Saracura;
import View.TelaJogo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaJogoController implements KeyListener, Runnable{
    private TelaJogo telinha;
    private boolean up;
    private boolean down;
    private boolean right;
    private boolean left;
    private boolean pause;
    private Thread loop;
    public Random gerador;
    public int a;
    public int velocidade;

    public TelaJogoController(TelaJogo tela) {
        this.telinha = tela;
        up = false;
        down = false;
        right = true;
        left = false;
        pause = true;
        loop = new Thread(this);
        velocidade = 200;
    }
    
    public void iniciar(){
        this.telinha.gamePanel.getSaracura().getSaracura().get(0).mover(5*20, 5*20);
        pause = false;
        this.telinha.gamePanel.getTimer().start();
        loop.start();
    }
    public void verificarColisao(Node a){
        if(a.getX() == 0 || a.getX() == (20*31) || a.getY() == 0 || a.getY() == (20*23)){
            pause = true;
            loop.interrupt();
        }
    }
    public void VerificarColisaoComida(Node a, Node b){
        if(a.getX() == b.getX() && a.getY() == b.getY()){
            this.telinha.gamePanel.getSaracura().crescerSaracura();
            int x = (new Random().nextInt(30) + 1);
            int y = (new Random().nextInt(22) + 1);
            this.telinha.gamePanel.getTarget().mover(x*20,y*20);
            this.velocidade -= 10;
        }
    }
    public void reiniciar(){
        this.telinha.gamePanel.getSaracura().getSaracura().get(0).mover(10 * 20, 5 * 20);
        pause = false;
        this.telinha.gamePanel.getTimer().start();
        up = false;
        down = false;
        left = false;
        right = true;
        loop = new Thread(this);
        loop.start();
    }
    
    public void VerificarColisaoCobrinha(Saracura a){
        ArrayList<Node> b = a.getSaracura();
        for (int i = 1; i < a.getSaracura().size() -1; i++){
        if (b.get(0).getX() == b.get(i).getX() && b.get(0).getY() == b.get(i).getY()){
            pause = true;
            loop.interrupt();
        }
    }        
    }
    
    private void atualizar(){
        if(up){
            this.telinha.gamePanel.getSaracura().atualizar(Saracura.UP);
        }
        else if(down){
            this.telinha.gamePanel.getSaracura().atualizar(Saracura.DOWN);
        }
        else if(right){
            this.telinha.gamePanel.getSaracura().atualizar(Saracura.RIGHT);
        }
        else if(left){
            this.telinha.gamePanel.getSaracura().atualizar(Saracura.LEFT);
        }
    }
    
    @Override
    public void run() {
        while(pause == false){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaJogoController.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.atualizar();
            this.verificarColisao(this.telinha.gamePanel.getSaracura().getSaracura().get(0));
            this.VerificarColisaoComida(this.telinha.gamePanel.getSaracura().getSaracura().get(0), this.telinha.gamePanel.getTarget());
            this.VerificarColisaoCobrinha(this.telinha.gamePanel.getSaracura());
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP && this.down == false){
            this.up = true;
            this.right = false;
            this.left = false;
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN && this.up == false){
            this.down = true;
            this.right = false;
            this.left = false;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && this.left == false){
            this.right = true;
            this.up = false;
            this.down = false;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT && this.right == false){
            this.left = true;
            this.up = false;
            this.down = false;
        }
        else if(e.getKeyCode() == KeyEvent.VK_R){
            this.reiniciar();
        }
        else if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }    
}
