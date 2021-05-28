package ingresso;

public class CamaroteInferior extends VIP{
    public CamaroteInferior(double valor){
        super(valor);
    }
    public void camarote(){
        System.out.println("Camarote inferior");
    }    
    @Override
    public void imprimeValor(){
        System.out.println("O valor do Camarote Inferior é: " + this.valor);
    }
}
