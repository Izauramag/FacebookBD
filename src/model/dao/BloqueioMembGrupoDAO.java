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
    
    public void create(BloqueioMembGrupo bloqueioMembGrupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_bloq_memb_grupo(id_grupo, id_usuario) VALUES(?, ?)");
           
            stmt.setInt(1, bloqueioMembGrupo.getId_grupo());
            stmt.setInt(3, bloqueioMembGrupo.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
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
    
    public void delete(BloqueioMembGrupo bloqueioMembGrupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_bloq_memb_grupo WHERE id_grupo = ? AND id_bloq_memb = ? AND id_usuario = ?");
            stmt.setInt(1, bloqueioMembGrupo.getId_grupo());
            stmt.setInt(2, bloqueioMembGrupo.getId_bloq_memb());
            stmt.setInt(3, bloqueioMembGrupo.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
