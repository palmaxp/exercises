package View;

import Controller.TelaJogoController;

public class TelaJogo extends TelaBase{

    public GamePanel gamePanel;
    private TelaJogoController telinhajogo;
    
    public TelaJogo() {
        super("Tela Jogo");
        this.gamePanel = new GamePanel();
        this.gamePanel.setBounds(0,0,640,480);
        add(this.gamePanel);
        telinhajogo = new TelaJogoController(this);
        addKeyListener(telinhajogo);
        telinhajogo.iniciar();
    }    
}
