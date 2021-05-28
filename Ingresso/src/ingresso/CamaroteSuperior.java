package ingresso;

public class CamaroteSuperior extends VIP{
    public CamaroteSuperior(double valor) {
        super(valor + 30);
    }
    @Override
    public void imprimeValor(){
        System.out.println("O valor do Camarote Superior é: " + this.valor);
    }
}
