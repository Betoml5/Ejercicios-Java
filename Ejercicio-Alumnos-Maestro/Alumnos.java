import java.util.Scanner;

/**
 * Alumnos
 */
public class Alumnos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numeroAlumnos;
        int edadAlumno;
        double edadPromedio = 0;

        System.out.println("Ingresa el numero de alumnos a promediar");
        numeroAlumnos = entrada.nextInt();


        for(int i = 0; i < numeroAlumnos; i++ ){
            System.out.println("Edad de alumno " + (i+1));
            edadAlumno = entrada.nextInt();
            edadPromedio += edadAlumno;
        }

        System.out.println("La edad promedio de los alumnos es: " + edadPromedio/numeroAlumnos + " años");


    }
}