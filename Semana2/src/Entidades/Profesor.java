
package Entidades;


public class Profesor {
    public int id;
    public String nombre;
    
    public String apellido;
    
    public Profesor() {
    this.nombre = "";
        this.apellido = "";
        this.id = 0;
    }

    @Override
    public String toString(){
        return this.nombre + 
                ", " + this.apellido + 
                ", " + this.id;
        
    }
    
}
