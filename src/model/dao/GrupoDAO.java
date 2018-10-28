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
import model.bean.Grupo;

/**
 *
 * @author icaro
 */
public class GrupoDAO {
    public void create(Grupo grupo){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_grupo(nome, imagem, conteudo) VALUES(?,?, ?)");
            stmt.setString(1, grupo.getNome());
            stmt.setString(2, grupo.getImagem());
            stmt.setString(3, grupo.getConteudo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Grupo> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Grupo> grupos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_grupo");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                Grupo grupo = new Grupo();
                
                grupo.setId_grupo(rs.getInt("id"));
                grupo.setNome(rs.getString("nome"));
                grupo.setImagem(rs.getString("imagem"));
                grupo.setConteudo(rs.getString("conteudo"));
                grupos.add(grupo);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return grupos; 
    }
}
