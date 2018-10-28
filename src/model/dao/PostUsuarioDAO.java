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
}
