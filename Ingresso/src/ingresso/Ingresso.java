package ingresso;

public class Ingresso {
    double valor = 10;

    public void imprimeValor(){
        System.out.println(valor);
    }
    
    public static void main(String[] args) {
        new VIP().imprimeValor();
        new CamaroteInferior().camarote();
        new CamaroteInferior().imprimeValor();
        new CamaroteSuperior().imprimeValor();
    }    
}
