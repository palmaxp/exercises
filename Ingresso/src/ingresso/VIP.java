package ingresso;

public class VIP extends Ingresso{
    public VIP(double valor) {
        super(valor + 50); 
    }
    @Override
    public void imprimeValor() {
        System.out.println("O valor do Ingresso VIP é: " + this.valor);
    }
}
