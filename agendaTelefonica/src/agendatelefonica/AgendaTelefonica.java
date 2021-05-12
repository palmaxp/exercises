package agendatelefonica;

public class AgendaTelefonica {    
    public static void main(String[] args) {
        Contato c1 = new Contato(
            "joao",
            "33685888",
            "47991920101",
            "email@gmail.com"
        );
        Contato c2 = new Contato(
            "pedro",
            "1111111",
            "222222",
            "pedroemail@gmail.com"
        );
        Agenda a1 = new Agenda();
        a1.adicionarContato(c1);
        a1.adicionarContato(c2);
        a1.removerContato(c1);
        a1.mostrarContato(c2);
    }
}
