package projetobanco;

import DAO.UsuarioDAO;
import Models.Usuario;
import View.TelaCadastro;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProjetoBanco {

    public static ArrayList<Usuario> listaUsuario;

    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        ArrayList<Usuario> listaUsuarios = null;
        
        new TelaCadastro().setVisible(true);
    } 
}
