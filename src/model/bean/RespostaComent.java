/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model.bean;

/**
 *
 * @author Izaura
 */
public class RespostaComent {
    
    
    private int id_resposta;
    private int id_comentario;
    private int id_user_resp;
    private String imagem;
    private String conteudo;
    
    
    //Gerando getters and setters
    
    
    public int getId_resposta() {
        return id_resposta;
    }
    
    public void setId_resposta(int id_resposta) {
        this.id_resposta = id_resposta;
    }
    
    public int getId_comentario() {
        return id_comentario;
    }
    
    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }
    
    public int getId_user_resp() {
        return id_user_resp;
    }
    
    public void setId_user_resp(int id_user_resp) {
        this.id_user_resp = id_user_resp;
    }
    
    public String getImagem() {
        return imagem;
    }
    
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    public String getConteudo() {
        return conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
