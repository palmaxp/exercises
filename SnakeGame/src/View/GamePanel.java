package View;

import Model.Saracura;
import Model.Target;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
    public GamePanel(){
        this.saracura = new Saracura(5*20, 5*20);
        int x = new Random().nextInt(31);
        int y = new Random().nextInt(23);
        this.target = new Target(x*20, y*20);
        this.FPS = 1000 / 300;
        this.timer = new Timer(this.FPS, this);
    }
    private Saracura saracura;
    private Target target;
    private int FPS;
    private Timer timer;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.clearRect(1, 1, 640, 480);
        g.setColor(Color.darkGray);
        g.fillRect(1, 1, 640, 480);
        getSaracura().desenhar(g);
        target.desenhar(g);
    }

    public Saracura getSaracura() {
        return saracura;
    }
    public void setSaracura(Saracura Saracura) {
        this.saracura = Saracura;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public Timer getTimer() {
        return timer;
    } 

    public Target getTarget() {
        return target;
    }
}
