package livro;

public class Livro {
    public Livro(int id, String titulo, String autor, int codigo, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.preco = preco;
    }    
    int id;
    String titulo;
    String autor;
    int codigo;
    double preco;
    
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "Harry Potter", "JK", 1, 10.00);
        Livro livro2 = new Livro(2, "As armas da persuassão", "Robert C.", 2, 15.00);
        Livro livro3 = new Livro(3, "Pense e enriqueça", "Napoleon Hill", 3, 30.00);
        Livro livro4 = new Livro(4, "Mais esperto que o diabo", "Napoleon Hill", 4, 10.00);
        Livro livro5 = new Livro(5, "Pai rico Pai pobre", "Robert K.", 5, 20.00);
        Livro livro6 = new Livro(6, "Os segredos das mentes milionárias", "T. Harv Eker", 6, 10.00);
        Livro livro7 = new Livro(7, "O homem mais rico da babilônia", "Samuel Clason", 7, 100.00);
        Livro livro8 = new Livro(8, "Superando O Carcere Da Emoçao", "August Cury", 8, 90.00);
        Livro livro9 = new Livro(9, "Como fazer amigos e influenciar pessoas", "Dale Carnegie", 9, 15.00);
        Livro livro10 = new Livro(10, "Manual de persuasão do FBI", "Jack Schafer", 10, 25.00);
    }       
}
