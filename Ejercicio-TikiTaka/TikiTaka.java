import java.util.ArrayList;
import java.util.Scanner;

public class TikiTaka {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int ventasMayores1000 = 0;
        int ventasM500MI1000 = 0;
        int ventasMI500 = 0;
        int venta;
        int keepGoing = 1;
        int keep = 1;
        int noRepeat = 0;
        ArrayList categorias = new ArrayList<String>();

        while (keepGoing == 1) {
            System.out.println("Ingresa el monto de la venta");
            venta = entrada.nextInt();

            if (venta > 1000) {
                ventasMayores1000 += 1;
            } else if (venta > 500 && venta <= 1000) {
                ventasM500MI1000 += 1;
            } else if (venta <= 500) {
                ventasMI500 += 1;
            }
            System.out.println("¿Quieres registrar mas ventas?");
            System.out.println("Presiona 1 para seguir registrando o 0 para salir");
            keepGoing = entrada.nextInt();
        }

        System.out.println("Cantidad de ventas que fueron mayores a $1000: " + ventasMayores1000);
        System.out.println(
                "Cantidad de ventas que fueron mayores a $500, pero menores o iguales a $1000: " + ventasM500MI1000);
        System.out.println("Cantidad de ventas menores o iguales a $500: " + ventasMI500);
    }
}
