package mediaaluno;

public class MediaAluno {
    public MediaAluno(String nome) {
        this.nome = nome;
    }
    
    String nome;
    int notas[] = new int[3];
    
    public void adicionarNotas(int num1, int num2, int num3){
        System.out.println("Olá " + this.nome);
        int param[] = new int[3];
        param[0] = num1;
        param[1] = num2;
        param[2] = num3;
        for (int i = 0; i < notas.length; i++) {
            if(param[i] >= 0 && param[i] <= 100){
                System.out.println(notas[i] = param[i]);
            } else{
                notas[i] = 0;
                System.out.println("Erro. São aceitos apenas números entre 0 e 100");
            }
        }
    }
    public void calcularMedia(){
        int media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("A média é " + media);
    }
    
    public static void main(String[] args) {
        MediaAluno aluno1 = new MediaAluno("gilson");
        aluno1.adicionarNotas(3, 10, 10);
        aluno1.calcularMedia();
    }    
}