package controledeemprestimos;
import java.util.ArrayList;

public class Emprestimo {
    ArrayList lista = new ArrayList();
    
    public void fazerEmprestimos(Pessoa pessoa, Livro livro){
        lista.add(pessoa + " " + livro);
    }
    public void mostrarEmprestimos(){
    }
}
