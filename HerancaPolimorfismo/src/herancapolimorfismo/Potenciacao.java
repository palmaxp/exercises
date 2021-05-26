package herancapolimorfismo;

public class Potenciacao extends OperacaoMatematica{

    @Override
    public void Calcular(double valorUm, double valorDois) {
        double resultado = Math.pow(valorUm, valorDois);
        System.out.println("O resultado é " + resultado);
    }
    
}
