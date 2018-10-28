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

/**
 *
 * @author icaro
 */
public class RespostaComentDAO {
    
    public void create(RespostaComent respostaComent){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_resposta_coment(imagem, conteudo) VALUES(?,?)");
            stmt.setString(1, respostaComent.getImagem());
            stmt.setString(2, respostaComent.getConteudo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<RespostaComent> read(){
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<RespostaComent> respostasComents = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_resposta_coment");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                RespostaComent respostaComent = new RespostaComent();
                
                respostaComent.setId_resposta(rs.getInt("id_resposta"));
                respostaComent.setId_comentario(rs.getInt("id_comentario"));
                respostaComent.setId_user_resp(rs.getInt("id_user_respo"));
                respostaComent.setImagem(rs.getString("imagem"));
                respostaComent.setConteudo(rs.getString("conteudo"));
                respostasComents.add(respostaComent);    
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu merda", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return respostasComents; 
    }
    
    public void update(RespostaComent respostaComent){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tb_resposta_coment SET imagem = ?, conteudo = ? WHERE id = ?");
            stmt.setString(1, respostaComent.getImagem());
            stmt.setString(2, respostaComent.getConteudo());
            stmt.setInt(3, respostaComent.getId_resposta()); //perguntar a icaro
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(RespostaComent respostaComent){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_resposta_coment WHERE id = ?");
            stmt.setInt(1, respostaComent.getId_resposta()); //perguntar a icaro
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
