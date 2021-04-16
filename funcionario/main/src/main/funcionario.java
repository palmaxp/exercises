package main;

public class funcionario {

    public funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }    
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    
    public void recebeAumento(double aumento){
        this.salario += aumento;
        System.out.println(this.salario);
    }
    public void ganhoAnual(){
        double ganhoAnual = this.salario *= 12;
        System.out.println(ganhoAnual);
    }
    
    public String getNome(){
        return nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public String getRg() {
        return rg;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
}

