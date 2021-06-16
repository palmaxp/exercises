package View;

public class TelaJogo extends TelaBase{

    public GamePanel gamePanel;
    
    public TelaJogo() {
        super("Tela Jogo");
        this.gamePanel = new GamePanel();
        this.gamePanel.setBounds(0,0,640,480);
        add(this.gamePanel);        
    }    
}
