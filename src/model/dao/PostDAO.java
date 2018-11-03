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
import model.bean.Post;

/**
 *
 * @author icaro
 */
public class PostDAO {
    
    public static void create(Post post){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_post(id_user_post, imagem, conteudo, visibilidade) VALUES(?, ?, ?, ?)");
            
            stmt.setInt(1, post.getId_user_post());
            stmt.setString(2, post.getImagem());
            stmt.setString(3, post.getConteudo());
            stmt.setString(4, post.getVisibilidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static List<Post> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Post> posts = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_post");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                Post post = new Post();
                
                post.setId_post(rs.getInt("id_post"));
                post.setId_user_post(rs.getInt("id_user_post"));
                post.setImagem(rs.getString("imagem"));
                post.setConteudo(rs.getString("conteudo"));
                post.setVisibilidade(rs.getString("visibilidade"));
                posts.add(post);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return posts; 
    }
    
    public static void update(Post post){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tb_post SET imagem = ?, conteudo = ?, visibilidade = ? WHERE id_post = ? AND id_user_post = ?");
            stmt.setString(1, post.getImagem());
            stmt.setString(2, post.getConteudo());
            stmt.setString(3, post.getVisibilidade());
            stmt.setInt(4, post.getId_post()); 
            stmt.setInt(5, post.getId_user_post());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static void delete(Post post){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_post WHERE id_post = ? AND id_user_post = ?");
            stmt.setInt(1, post.getId_post()); 
            stmt.setInt(2, post.getId_user_post());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
