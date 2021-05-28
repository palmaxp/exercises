package escola;

public class Professor extends Funcionario {
    public Professor(String departamento, String codigo, double salario, String nome, String cpf, String endereco) {
        super(codigo, salario, nome, cpf, endereco);
        this.departamento = departamento;
    }
    String departamento;
}