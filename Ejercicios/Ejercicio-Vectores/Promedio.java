import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        float promedioMayor = 0;
        String nombreMayor = "";

        System.out.println("Ingresa la cantidad de alumnos");
        n = entrada.nextInt();

        String [] nombresAlumnos = new String[n];
        float [] promedioAlumnos = new float[n];

        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println("Nombre del alumno: " + (i+1));
            nombresAlumnos[i] = entrada.next();
        }

        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println("Ingresa el promedio de: " + nombresAlumnos[i]);
            promedioAlumnos[i] = entrada.nextFloat();
        }

        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println("El promedio de: " + nombresAlumnos[i] + " es: " + promedioAlumnos[i]);
        }

        for (int i = 0; i < promedioAlumnos.length; i++) {
            if (promedioAlumnos[i] > promedioMayor) {
                nombreMayor = nombresAlumnos[i];
                promedioMayor = promedioAlumnos[i];
            }
        }
        System.out.println("El nombre del que tiene mayor promedio es: " + nombreMayor);
        System.out.println("Y tiene un promedio de: " + promedioMayor);

    }
}
