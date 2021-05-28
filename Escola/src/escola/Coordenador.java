package escola;

public class Coordenador extends Funcionario {
    public Coordenador(String curso, String codigo, double salario, String nome, String cpf, String endereco) {
        super(codigo, salario, nome, cpf, endereco);
        this.curso = curso;
    }     
    String curso;
}
