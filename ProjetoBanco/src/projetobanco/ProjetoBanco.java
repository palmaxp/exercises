package projetobanco;

import DAO.UsuarioDAO;
import Models.Usuario;
import Utils.ConexaoBanco;
import View.TelaCadastro;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjetoBanco {

    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        ConexaoBanco.criarConexao();    
        // new TelaCadastro().setVisible(true);
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("23/10/1997");
        Usuario gustavo = new Usuario("Gustavo Roberto", "gustavo@sc.senai.br", "123", "Masculino", data);
        int codigo = UsuarioDAO.inserirUsuario(gustavo);
        System.out.println(codigo);
    } 
}
