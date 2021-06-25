package DAO;

import Models.Usuario;
import Utils.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    public static ArrayList<Usuario> BuscarTodosUsuarios(){
        String sql = "SELECT * FROM usuario";
        Connection conexao = ConexaoBanco.criarConexao();
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");
                String genero = resultado.getString("genero");
                Date data = resultado.getDate("data_nascimento");
                Usuario p1 = new Usuario(codigo, nome, email, genero, data);
                listaUsuario.add(p1);
            }
        } catch (SQLException e) {
            System.out.println("n foi possivel buscar ngm");
        }
        return listaUsuario;
    }
    public static void DeletarUsuarioPorCodigo(int codigo){
        String sql = "DELETE FROM usuario where codigo = ?";
        Connection conexao = ConexaoBanco.criarConexao();
        try {
            PreparedStatement stm = conexao.prepareCall(sql);
            stm.setInt(1, codigo);
            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DEU ERRO AO DELETAR " + e);
        }
    }
}
