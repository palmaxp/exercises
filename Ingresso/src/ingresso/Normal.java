package ingresso;

public class Normal extends Ingresso{
    public Normal(double valor){
        super(valor);
    }
    public void mostrarIngresso(){
        System.out.println("Ingresso normal");
    }
    @Override
    public void imprimeValor() {
        System.out.println("O valor do ingresso normal é: " + this.valor);
    }
    
    
}
