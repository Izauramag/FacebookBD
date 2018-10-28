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
import model.bean.BloqueioMembGrupo;

/**
 *
 * @author icaro
 */
public class BloqueioMembGrupoDAO {
    public List<BloqueioMembGrupo> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<BloqueioMembGrupo> bloqueioMembGrupos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_bloq_memb_grupo");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                BloqueioMembGrupo bloqueioMembGrupo = new BloqueioMembGrupo();
                
                bloqueioMembGrupo.setId_bloq_memb(rs.getInt("id_bloq_memb"));
                bloqueioMembGrupo.setId_grupo(rs.getInt("id_grupo")); 
                bloqueioMembGrupo.setId_usuario(rs.getInt("id_usuario"));
                bloqueioMembGrupos.add(bloqueioMembGrupo);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return bloqueioMembGrupos; 
    }
}
