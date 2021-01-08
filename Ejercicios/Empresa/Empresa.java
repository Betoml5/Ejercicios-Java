import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        
        String nombreProducto;
        double precioProducto, us, eu, lb, yen;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre producto: ");
        nombreProducto = entrada.nextLine();

        System.out.println("Precio del producto (MXN): ");
        precioProducto = entrada.nextFloat();

        us = precioProducto*0.050;
        eu = precioProducto*0.42;
        yen = precioProducto*5.22;
        lb = precioProducto*0.037;

        System.out.println("El precio en Dolares de " + nombreProducto + " es: $" + us);
        System.out.println("El precio en Euros de " + nombreProducto + " es: $" + eu);
        System.out.println("El precio en Libras de " + nombreProducto + " es: $" + lb);
        System.out.println("El precio en Yens de " + nombreProducto + " es: $" + yen);


        




    }
}
