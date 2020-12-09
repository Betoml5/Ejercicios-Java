import java.util.Scanner;

public class Postulante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String clavePostulante;
        int respuestasCorrectas;
        int respuestasIncorrectas;
        int respuestaSin;
        int puntajeTotal = 0;
        

        System.out.println("Ingresa la clave del postulante: ");
        clavePostulante = entrada.next();

        System.out.println("Ingresa las respuestas correctas");
        respuestasCorrectas = entrada.nextInt();
        puntajeTotal += respuestasCorrectas*4;

        System.out.println("Ingresa las respuestas incorrectas");
        respuestasIncorrectas = entrada.nextInt();
        puntajeTotal -= respuestasIncorrectas;

        System.out.println("Ingresa las respuestas respuestas en blanco");
        respuestaSin = entrada.nextInt();


        System.out.println("- - - CLAVE - - -");
        System.out.println(clavePostulante);
        System.out.println("Cantidad de respuestas correctas: " + respuestasCorrectas +  " obtuvo " + respuestasCorrectas*4 + " puntos");
        System.out.println("Cantidad de respuestas incorrectas: " + respuestaSin +  " representan -" + respuestasIncorrectas + " puntos");
        System.out.println("Cantidad de respuestas en blanco: " + respuestasCorrectas +  " representan " + respuestaSin + " puntos sin contabilizar");

        System.out.println("El resultado de la evaluacion aplicada es de: " + puntajeTotal);




    }
}
