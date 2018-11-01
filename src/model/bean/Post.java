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
public class Post {
    private int id_post;
    private int id_user_post;
    private String imagem;
    private String conteudo;
    private char visibilidade;

    public Post() {
    }

    public Post(int id_user_post, String imagem, String conteudo, char visibilidade) {
        this.id_user_post = id_user_post;
        this.imagem = imagem;
        this.conteudo = conteudo;
        this.visibilidade = visibilidade;
    }
    
    public int getId_post() {
        return id_post;
    }
    public void setId_post(int id_post) {
        this.id_post = id_post;
    }
    public int getId_user_post() {
        return id_user_post;
    }
    public void setId_user_post(int id_user_post) {
        this.id_user_post = id_user_post;
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
    
    public String getVisibilidade() {
        return String.valueOf(visibilidade);
    }
    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade.charAt(0);
    }
    
    // Métodos
    public void criaPost(int id_post, int id_user_post, byte[] imagem, String conteudo, String visibilidade ) {
        // TODO: Implementar depois
    }
    
    public void removePost(int id_post) {
        // TODO: Implementar depois
    }
    
}
