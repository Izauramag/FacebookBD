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
import model.bean.ComentarioPost;

/**
 *
 * @author icaro
 */
public class ComentarioPostDAO {
    public void create(ComentarioPost comentarioPost){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_grupo(imagem, conteudo) VALUES(?,?)");
            stmt.setString(1, comentarioPost.getImagem());
            stmt.setString(2, comentarioPost.getConteudo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<ComentarioPost> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ComentarioPost> comentariosPost = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_comentario_post");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                ComentarioPost comentarioPost = new ComentarioPost();
                
                comentarioPost.setId_comentario(rs.getInt("id_comentario"));
                comentarioPost.setId_post(rs.getInt("id_post"));
                comentarioPost.setId_user_coment(rs.getInt("id_user_coment"));
                comentarioPost.setImagem(rs.getString("imagem"));
                comentarioPost.setConteudo(rs.getString("conteudo"));
                comentariosPost.add(comentarioPost);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return comentariosPost; 
    }
}
