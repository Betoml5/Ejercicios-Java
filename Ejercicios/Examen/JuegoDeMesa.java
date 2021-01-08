import java.util.Scanner; //Importamos la clase Scanner;


/**
 * Write a description of class Fabricas here.
 * Calculamos los puntos de algun participante.
 * @author (Alberto Martinez) 
 * @version (03/12/2020)
 */

public class JuegoDeMesa {

    public static void main(String[] args) {

        String nombreJugador;

        int fichasRojas;
        int fichasAzules;
        int fichasAmarillas;
        int rondasJugadas;
        int puntos;
        int puntosFinal = 0;

        Scanner entrada = new Scanner(System.in); // Instanciamos un objeto de la clase Scanner;
1
        System.out.println("Ingresa el nombre del jugador"); //Pedimos datos
        nombreJugador = entrada.nextLine();

        System.out.println("Ingresa las rondas jugadas"); 
        rondasJugadas = entrada.nextInt();

        System.out.println("Ingresa las rondas ganadas");
        fichasRojas = entrada.nextInt();

        System.out.println("Ingresa las rondas empatadas");
        fichasAzules = entrada.nextInt();

        System.out.println("Ingresa las rondas perdidas");
        fichasAmarillas = entrada.nextInt();

        System.out.println("El jugador " + nombreJugador + " en " + rondasJugadas + " rondas de juego y gano");
        puntos = (int)Math.pow(fichasRojas, 3);
        System.out.println(fichasRojas + " rondas en 1er lugar y obtuvo " + fichasRojas + " fichas corresponde a " + puntos + " puntos");
        puntosFinal += puntos;
        puntos = fichasAzules*2;
        puntosFinal += puntos;
        System.out.println(fichasAzules + " rondas en 2do lugar y obtuvo " + fichasAzules + " fichas corresponde a " + puntos + " puntos");
        puntos = (int)Math.pow(fichasAmarillas, 2);
        puntosFinal -= puntos;
        System.out.println(fichasAmarillas + " rondas en 3er lugar y obtuvo " + fichasAmarillas + " fichas corresponde a -" + puntos + " puntos");

        System.out.println("El puntaje que obtuvo fue: " + puntosFinal + " puntos"); // Puntaje total

    }
}
