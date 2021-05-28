package animal;

public abstract class Animal {
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String nome;
    public int idade;
    
    public abstract void emitirSom();

    public static void main(String[] args) {
        Animal a[] = new Animal[6];

        a[0] = new Cachorro("Gilberto", 16);
        a[1] = new Cavalo("Cavalo Sapeca", 6);
        a[2] = new Gato("Morenao Sinistro", 33);
        a[3] = new Cachorro("Teixeira", 34);
        a[4] = new Cavalo("Banco de daos", 2);
        a[5] = new Gato("Gatao", 9);

        for (int i = 0; i < a.length; i++) {
            a[i].emitirSom();
        }
    }
}

