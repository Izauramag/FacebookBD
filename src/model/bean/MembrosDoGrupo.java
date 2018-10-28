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
public class MembrosDoGrupo {
    
    private int id_memb_grup;
    private int id_grupo;
    private int id_usuario;
    private String admnistrador;
    
    public int getId_memb_grup() {
        return id_memb_grup;
    }
    public void setId_membr_grup(int id_memb_grup) {
        this.id_memb_grup = id_memb_grup;
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
    public String getAdmnistrador() {
        return admnistrador;
    }
    public void setAdmnistrador(String admnistrador) {
        this.admnistrador = admnistrador;
    }
}
