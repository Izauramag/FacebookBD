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
import model.bean.PostGrupo;

/**
 *
 * @author icaro
 */
public class PostGrupoDAO {
    public List<PostGrupo> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<PostGrupo> postsGrupos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_post_grupo");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                PostGrupo postGrupo = new PostGrupo();
                
                postGrupo.setId_post(rs.getInt("id_post"));
                postGrupo.setId_grupo_post(rs.getInt("id_grupo_post")); 
                postsGrupos.add(postGrupo);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return postsGrupos; 
    }
}
