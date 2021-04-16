package main;

public class Main {
    public static void main(String[] args) {
        funcionario f1 = new funcionario("rogerio", "educacao", 1000, "15/07/2003", "11673845900");
        funcionario f2 = new funcionario("gustavo", "administracao", 3000, "11/11/2001", "11673845900");
        System.out.println(f1.getNome());
        System.out.println(f1.getDepartamento());
        f1.setNome("joao");
        System.out.println(f1.getNome());
        f1.recebeAumento(1000);
    }    
}
