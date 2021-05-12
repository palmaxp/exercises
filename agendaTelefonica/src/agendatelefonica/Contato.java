package agendatelefonica;

public class Contato {
    public Contato(
        String nome, 
        String telefone, 
        String celular, 
        String email
    ){
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;            
    }
    String nome;
    String telefone;
    String celular;
    String email;    
}
