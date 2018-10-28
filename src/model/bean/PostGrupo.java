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
public class PostGrupo {
    
    private int id_post;
    private int id_grupo_post;
    
    
    //Gerando getters and setters
    
    public int getId_post() {
        return id_post;
    }
    
    public void setId_post(int id_post) {
        this.id_post = id_post;
    }
    
    public int getId_grupo_post() {
        return id_grupo_post;
    }
    
    public void setId_grupo_post(int id_grupo_post) {
        this.id_grupo_post = id_grupo_post;
    }
}
