import java.util.Scanner;

/**
 * Paqueteria
 * 
 * @author Alberto Martinez
 * @version 1.04
 */
public class Paqueteria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double pesoPaquete;
        double precioFlete;
        int direccionPaquete;

        System.out.println("¿A donde va dirigo tu paquete?");
        System.out.println(" - - - - - - - - - - OPCIONES - - - - - - - - - -");
        System.out.println("1.- America del Norte - $11.00 / gramo");
        System.out.println("2.- America Central $10.00 / gramo");
        System.out.println("3.- America del Sur $12.00 / gramo");
        System.out.println("4.- Europa $24.00 / gramo");
        System.out.println("5.- Asia $27.00 / gramo");
        System.out.println("Selecciona la opcion con el numero correspondiente");
        direccionPaquete = entrada.nextInt();
        if (direccionPaquete > 5) {
            System.out.println("Opcion no disponible");
            return;
        }
        System.out.println(" - - - - - - - - - - OPCIONES - - - - - - - - - -");

        System.out.println("Ingresa el peso del paquete en gramos");
        pesoPaquete = entrada.nextDouble();

        if (pesoPaquete > 5000) {
            System.err.println("Peso de paquete excedido.");
            System.err.println("No es posible enviarlo.");
        }

        switch (direccionPaquete) {
            case 1:
                precioFlete = 11 * pesoPaquete;
                System.out.println("El precio del flete seria: $" + precioFlete);
                break;
            case 2:
                precioFlete = 10 * pesoPaquete;
                System.out.println("El precio del flete seria: $" + precioFlete);
                break;
            case 3:
                precioFlete = 12 * pesoPaquete;
                System.out.println("El precio del flete seria: $" + precioFlete);
                break;
            case 4:
                precioFlete = 24 * pesoPaquete;
                System.out.println("El precio del flete seria: $" + precioFlete);
                break;
            case 5:
                precioFlete = 27 * pesoPaquete;
                System.out.println("El precio del flete seria: $" + precioFlete);
                break;
            default:
                break;
        }

    }
}