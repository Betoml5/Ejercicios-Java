import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float c1, c2, c3, c4, promedio;

        System.out.println("Primera calificacion");
        c1 = entrada.nextFloat();

        System.out.println("Segunda calificacion");
        c2 = entrada.nextFloat();

        System.out.println("Tercera calificacion");
        c3 = entrada.nextFloat();

        System.out.println("Cuarta calificacion");
        c4 = entrada.nextFloat();

        promedio = (c1 + c2 + c3 + c4) / 4;

        System.out.print("El promedio final es: " + promedio);

    }

}
