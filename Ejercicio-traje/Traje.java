import java.util.Scanner;

public class Traje {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precioTraje;
        double totalPagar;
        double descuento;

        System.out.println("Ingresa el precio del traje");
        precioTraje = entrada.nextDouble();
        
        if (precioTraje > 2500) {
            descuento = (15*precioTraje)/100;
            totalPagar = precioTraje-descuento;
        } else{
            descuento = (8*precioTraje)/100;
            totalPagar = precioTraje-descuento;
        }

        System.out.println("Precio del traje $" + precioTraje);
        System.out.println("----------------------------------");
        System.out.println("Descuento: $" + descuento);
        System.out.println("----------------------------------");
        System.out.println("Total a pagar $" + totalPagar);
        System.out.println("----------------------------------");

    }
}
