package pessoa;

public class Pessoa {

    public Pessoa(String nome, String dataNasc, double altura) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.altura = altura;
    }
    private String nome;
    private String dataNasc;
    private double altura;

    public void calcularIdade(int anoNasc){
        System.out.println(2021 - anoNasc);
    }
    public void imprimirInfo(){
        System.out.println(nome);
        System.out.println(dataNasc);
        System.out.println(altura);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public double getAltura() {
        return altura;
    }
    
    public static void main(String[] args) {
        Pessoa gilson = new Pessoa("gilson", "13/12/1855", 1.80);
        System.out.println(gilson.getNome());
        gilson.calcularIdade(2003);
        gilson.imprimirInfo();
    } 
}