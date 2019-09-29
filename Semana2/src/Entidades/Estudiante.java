package Entidades;

public class Estudiante {

    public String nombre;
    public String apellido;
    public int id;

    public Estudiante() {
    this.nombre = "";
        this.apellido = "";
        this.id = 0;
    }

    @Override
    public String toString() {
        return this.nombre
                + ", " + this.apellido
                + ", " + this.id;
    }

}
