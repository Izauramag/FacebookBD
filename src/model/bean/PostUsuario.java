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
public class PostUsuario {
    
    private int id_post;
    private int id_user_post;
    
    //Gerando getters and setters
    
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
}
