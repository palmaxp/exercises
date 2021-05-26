package herancapolimorfismo;

public class Multiplicacao extends OperacaoMatematica{

    @Override
    public void Calcular(double valorUm, double valorDois) {
        double resultado = valorUm * valorDois;
        System.out.println("O resultado é " + resultado);
    }    
}
