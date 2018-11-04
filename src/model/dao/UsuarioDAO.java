/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model.dao;

import facebookbd.ConnectionFactory;
import facebookbd.MemoriaLocal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author icaro
 */
public class UsuarioDAO {
    
    public static void create(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tb_usuario(nome, cidade, foto, senha, login, visibilidade) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCidade());
            stmt.setString(3, usuario.getFoto());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getVisibilidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setFoto(rs.getString("foto"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setLogin(rs.getString("login"));
                usuario.setVisibilidade(rs.getString("Visibilidade"));
                usuarios.add(usuario);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
    }
    
    public static void update(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE tb_usuario SET nome = ?, cidade = ?, foto = ?, senha = ?, login = ?, visibilidade = ? WHERE id = ?");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCidade());
            stmt.setString(3, usuario.getFoto());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getVisibilidade());
            stmt.setInt(7, usuario.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static void delete(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tb_usuario WHERE id_usuario = ?");
            stmt.setInt(1, usuario.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static boolean checkLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery(); 
            Usuario usuario = new Usuario();
            
            if(rs.next()){
                check = true; 
                
                usuario.setId_usuario(rs.getInt("id_usuario"));
                
                usuario.setNome(rs.getString("nome"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setFoto(rs.getString("foto"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setLogin(rs.getString("login"));
                usuario.setVisibilidade(rs.getString("Visibilidade"));
            }
            
            MemoriaLocal.usuarioLogado = usuario;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check; 
    }
}
