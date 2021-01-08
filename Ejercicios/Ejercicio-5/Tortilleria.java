import java.util.Scanner;

public class Tortilleria {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double precioKilo;
        double kilosCliente;
        double totalPago;

        System.out.println("Precio del kilo de tortilla: ");
        precioKilo = entrada.nextDouble();

        System.out.println("Cuantos kilos de tortilla lleva");
        kilosCliente = entrada.nextDouble();

        totalPago = kilosCliente * precioKilo;

        System.out.println("Por la compra de " + kilosCliente + "kg");
        System.out.println("El costo por kilo aplicado es de $" + precioKilo);
        System.out.println("La cantidad a pagar es : $" + totalPago);

        

    }

}
