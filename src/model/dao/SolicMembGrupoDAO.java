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
import model.bean.RespostaComent;
import model.bean.SolicMembGrupo;

/**
 *
 * @author icaro
 */
public class SolicMembGrupoDAO {
    
    public List<SolicMembGrupo> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<SolicMembGrupo> solicsMembGrupos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_solic_memb_grupo");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                SolicMembGrupo solicMembGrupo = new SolicMembGrupo();
                
                solicMembGrupo.setId_solic_memb(rs.getInt("id_solic_memb"));
                solicMembGrupo.setId_grupo(rs.getInt("id_grupo"));
                solicMembGrupo.setId_usuario(rs.getInt("id_usuario"));
                solicsMembGrupos.add(solicMembGrupo);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return solicsMembGrupos;
    }
}
