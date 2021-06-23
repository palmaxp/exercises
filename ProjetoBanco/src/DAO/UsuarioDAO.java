package DAO;

import Models.Usuario;
import Utils.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
    public static int inserirUsuario(Usuario usuario){
        String sql = "INSERT INTO usuario(nome, email, senha, genero, data_nascimento)VALUES (?,?,?,?,?)";
        Connection conexao = ConexaoBanco.criarConexao();
        try{
            PreparedStatement stm;
            stm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEmail());
            stm.setString(3, usuario.getSenha());
            stm.setString(4, usuario.getGenero());
            stm.setDate(5, new Date (usuario.getData_nascimento().getTime()));
            stm.execute();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch(SQLException e){
            System.out.println("nao deu " + e);
        }
        return 0;
    }
}
