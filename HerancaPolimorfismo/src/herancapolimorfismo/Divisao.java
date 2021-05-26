package herancapolimorfismo;

public class Divisao extends OperacaoMatematica{
    @Override
    public void Calcular(double valorUm, double valorDois) {
        if(valorUm == 0 || valorDois == 0){
            System.out.println("NAO PODE LOCO");
        }
        else {
        double resultado = valorUm / valorDois;
        System.out.println("O resultado é " + resultado);
        }
    }    
}
