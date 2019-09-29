/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Laboratorio
 */
public class Curso {
    
    public int id;
    public String nombre;
    public int creditos;
    
    public Curso() {
    this.nombre = "";
        this.creditos = 0;
        this.id = 0;
    }
    
    @Override
    public String toString(){
        return this.nombre + 
                ", " + this.creditos + 
                ", " + this.id;
        
    }
    
}
