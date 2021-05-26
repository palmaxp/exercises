package herancapolimorfismo;

public class HerancaPolimorfismo {
    public static void oi(OperacaoMatematica op, double valorUm, double valorDois){
        op.Calcular(valorUm, valorDois);
    }
    
    public static void main(String[] args) {    
        oi(new Soma(), 1, 3);
        oi(new Subtracao(), 1, 3);
        oi(new Multiplicacao(), 1, 3);
        oi(new Divisao(), 1, 3);
        oi(new Potenciacao(), 1, 3);
    }
}
