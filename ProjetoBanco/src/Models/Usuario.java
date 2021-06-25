package Models;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;

public class Usuario {

    public static boolean criptografarSenha;

    public static boolean criptografarSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // buscar
    public Usuario(int codigo, String nome, String email, String genero, Date data_nascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
    }
    // inserir
    public Usuario(String nome, String email, String senha, String genero, Date data_nascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
    }    
    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private String genero;
    private Date data_nascimento;
    
    public static String criptografarSenha(String senha){
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(senha.getBytes());
            senha = new BigInteger(1, md5.digest()).toString(16);
        } catch(Exception e){
            System.out.println("n deu");
        }
        return senha;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }    
    
}
