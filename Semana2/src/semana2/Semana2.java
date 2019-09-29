package semana2;

import Entidades.Curso;
import Entidades.Estudiante;
import Entidades.Profesor;

public class Semana2 {

    public static void main(String[] args) {
        //Declaracion
        Estudiante el = new Estudiante();
        Profesor J = new Profesor();
        Curso Progra = new Curso();
        
        //Estudiante
        el.nombre = "Carlitos";
        el.apellido = "Lopez";
        el.id = 1;
        System.out.println(el.toString());
        
        //Profesor
        J.nombre = "Jherom";
        J.apellido = "Chacon";
        J.id = 3;
        System.out.println(J.toString());
        
        //Curso
        Progra.nombre = "Programacion";
        Progra.creditos = 4;
        Progra.id = 2;
        System.out.println(Progra.toString());
        

    }

}
