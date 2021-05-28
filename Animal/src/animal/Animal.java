package animal;

public abstract class Animal {    
    public abstract void emitirSom();

    public static void main(String[] args) {
        Animal a[] = new Animal[10];

        a[0] = new Cachorro();
        a[1] = new Cavalo();
        a[2] = new Gato();
        a[3] = new Cachorro();
        a[4] = new Cavalo();
        a[5] = new Gato();
        a[6] = new Cachorro();
        a[7] = new Cavalo();
        a[8] = new Gato();
        a[9] = new Cachorro();

        for (int i = 0; i < a.length; i++) {
            a[i].emitirSom();
        }
    }
}

