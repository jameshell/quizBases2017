/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author Labing
 */
public class Artista extends Usuario {
    private String curriculum;
    private String distinciones;
    
    public Artista(){
    super();
    }
    
    public Artista(user1,nombre,curriculum,distinciones){
    super(user1,nombre);
    this.curriculum=curriculum;
    this.distinciones=distinciones;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }
    
    
}
