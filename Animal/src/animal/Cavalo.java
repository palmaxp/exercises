package animal;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade){
        super(nome, idade);
    } 
    @Override
    public void emitirSom() {
        System.out.println("Relinchar " + this.nome + " " + this.idade);
    }    
}
