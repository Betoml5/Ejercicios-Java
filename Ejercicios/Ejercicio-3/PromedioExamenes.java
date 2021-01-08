import java.util.Scanner;

public class PromedioExamenes {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double c1, c2, c3, total;

        System.out.println("Examen 1: ");
        c1 = entrada.nextDouble();

        System.out.println("Examen 2: ");
        c2 = entrada.nextDouble();

        System.out.println("Examen 3: ");
        c3 = entrada.nextDouble();


        System.out.println("Calificacion de Examen 1: " + c1 + "\n");
        System.out.println("Obtiene de puntuacion " + c1 * .25 + "\n");

        System.out.println("Calificacion de Examen 2: " + c2 + "\n");
        System.out.println("Obtiene de puntuacion " + c2 * .25 + "\n");

        System.out.println("Calificacion de Examen 3: " + c3 + "\n");
        System.out.println("Obtiene de puntuacion " + c3 * .5 + "\n");


        c1 = c1 * .5;
        c2 = c2 * .25;
        c3 = c3 * .25;

        total = c1 + c2 + c3;


        System.out.println("La calificacion final que obtiene el estudiante es: " + total);



        


        
    }

}
 