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
import model.bean.MembrosDoGrupo;

/**
 *
 * @author icaro
 */
public class MembrosDoGrupoDAO {
    public void create(MembrosDoGrupo membrosDoGrupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_membros_grupo(id_grupo, id_usuario, administrador) VALUES(?, ?, ?)");
            
            stmt.setInt(1, membrosDoGrupo.getId_grupo());
            stmt.setInt(2, membrosDoGrupo.getId_usuario());
            stmt.setString(3, membrosDoGrupo.getAdmnistrador());
         
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<MembrosDoGrupo> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MembrosDoGrupo> membrosDosGrupos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_membros_grupo");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                MembrosDoGrupo membrosDoGrupo = new MembrosDoGrupo();
                
                membrosDoGrupo.setId_membr_grup(rs.getInt("id_membr_grup"));
                membrosDoGrupo.setId_grupo(rs.getInt("id_grupo"));
                membrosDoGrupo.setId_usuario(rs.getInt("id_usuario"));
                membrosDoGrupo.setAdmnistrador(rs.getString("administrador"));
                membrosDosGrupos.add(membrosDoGrupo);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return membrosDosGrupos; 
    }
    
    public void update(MembrosDoGrupo membrosDoGrupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tb_membros_grupo SET administrador = ? WHERE id_memb_grup = ? AND id_grupo = ? AND id_usuario = ?");
            stmt.setString(1, membrosDoGrupo.getAdmnistrador());
            stmt.setInt(2, membrosDoGrupo.getId_memb_grup());
            stmt.setInt(3, membrosDoGrupo.getId_grupo());
            stmt.setInt(4, membrosDoGrupo.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(MembrosDoGrupo membrosDoGrupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_membros_grupo WHERE id_memb_grup = ? AND id_grupo = ? AND id_usuario = ?");
            stmt.setInt(1, membrosDoGrupo.getId_memb_grup());
            stmt.setInt(2, membrosDoGrupo.getId_grupo());
            stmt.setInt(3, membrosDoGrupo.getId_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
