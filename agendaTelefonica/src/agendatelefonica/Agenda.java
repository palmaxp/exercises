package agendatelefonica;
import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList();
    
    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }
    public void removerContato(Contato contato){
        contatos.remove(contato);
    }
    public void mostrarContato(Contato contato){
        System.out.println(contato.nome);
        System.out.println(contato.telefone);
        System.out.println(contato.celular);
        System.out.println(contato.email);
    }
}
