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
public class SolicMembGrupo {

    private int id_solic_memb;
    private int id_grupo;
    private int id_usuario;
    
    //Gerando getters and setters
    
    public int getId_solic_memb() {
        return id_solic_memb;
    }
    
    public void setId_solic_memb(int id_solic_memb) {
        this.id_solic_memb = id_solic_memb;
    }
    
    public int getId_grupo() {
        return id_grupo;
    }
    
    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }
    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
