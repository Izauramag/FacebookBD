/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import facebookbd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.PostUsuario;

/**
 *
 * @author icaro
 */
public class PostUsuarioDAO {
    public void create(PostUsuario postUsuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_post_usuario(id_post, id_user_post) VALUES(?, ?)");
           
            stmt.setInt(1, postUsuario.getId_post());
            stmt.setInt(2, postUsuario.getId_user_post());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<PostUsuario> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<PostUsuario> postsUsuarios = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_post_usuario");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                PostUsuario postUsuario = new PostUsuario();
                
                postUsuario.setId_post(rs.getInt("id_post"));
                postUsuario.setId_user_post(rs.getInt("id_user_post")); 
                postsUsuarios.add(postUsuario);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return postsUsuarios; 
    }
    
    public void delete(PostUsuario postUsuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_post_usuario WHERE id_post = ? AND id_user_post = ?");
            stmt.setInt(1, postUsuario.getId_post());
            stmt.setInt(2, postUsuario.getId_user_post());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
