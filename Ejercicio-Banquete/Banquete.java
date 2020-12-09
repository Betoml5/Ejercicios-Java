import java.util.Scanner;

public class Banquete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroPersonas;
        int precioPlatillo = 95;


        System.out.println("Ingresa el numero de personas");
        numeroPersonas = entrada.nextInt();

        if (numeroPersonas > 200  && numeroPersonas <= 300) {
            precioPlatillo = 85; 
        } else if(numeroPersonas > 300) {
            precioPlatillo  = 75;
        }

        System.out.println("Numero de personas: $" + numeroPersonas);
        System.out.println("Costo por platillo: $" + precioPlatillo);
        System.out.println("El total a pagar seria: $" + numeroPersonas*precioPlatillo);

    }
}
