package ingresso;

public class Ingresso {
    public Ingresso(double valor){
        this.valor = valor;
    }
    double valor;

    public void imprimeValor(){
        System.out.println("O valor do ingresso é: " + this.valor);
    }
    
    public static void main(String[] args) {
        Normal n1 = new Normal(10);
        n1.mostrarIngresso();
        n1.imprimeValor();
        
        VIP v1 = new VIP(10);
        v1.imprimeValor();
        
        CamaroteInferior ci1 = new CamaroteInferior(10);
        ci1.camarote();
        ci1.imprimeValor();
        
        CamaroteSuperior cs1 = new CamaroteSuperior(10);
        cs1.imprimeValor();
    }    
}
