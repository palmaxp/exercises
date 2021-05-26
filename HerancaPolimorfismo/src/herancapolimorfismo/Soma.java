package herancapolimorfismo;

public class Soma extends OperacaoMatematica{    
    @Override
    public void Calcular(double valorUm, double valorDois){
        double resultado = valorUm + valorDois;
        System.out.println("O valor da soma é " + resultado);
    }
}
