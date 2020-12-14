import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ElGlobo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroTiendas;
        int numeroCiudades;
        int numeroEmpleados;
    
        List<Double> ventasEmpleado = new ArrayList<Double>();

        double gananciaCiudad = 0;
        double gananciaTienda = 0;
        double gananciaTotal = 0;
        double ventaEmpleado;

       System.out.println("Ingresa el numero de ciudades en donde tienes suscursales");
       numeroCiudades = entrada.nextInt();

       for (int i = 1; i <= numeroCiudades; i++) {
           System.out.println("Ingresa el numero de tiendas que tienes en la ciudad: " + i);
           numeroTiendas = entrada.nextInt();

           for (int j = 1; j <= numeroTiendas; j++) {
               System.out.println("Ingresa el numero de empleados de la tienda: " + j);
               numeroEmpleados = entrada.nextInt();

               for (int j2 = 1; j2 <= numeroEmpleados; j2++) {
                   System.out.println("Ingrese lo vendido del empleado: " + j2);
                   ventaEmpleado = entrada.nextDouble();

                   ventasEmpleado.add(ventaEmpleado);
                   gananciaTotal += ventaEmpleado;
                   gananciaTienda += ventaEmpleado;
               }

               System.out.println("TIENDA: " + j);
               System.out.println("VENTAS TOTALES: $" + gananciaTienda);
               System.out.println("VENTAS DESGLOSADAS: ");
               for (int j2 = 0; j2 < ventasEmpleado.size(); j2++) {
                   System.out.println("El empleado: " + (j2 + 1) + " vendio $" + ventasEmpleado.get(j2));
               }
               ventasEmpleado.clear();
               gananciaCiudad += gananciaTienda;
               gananciaTienda = 0;
           }

           System.out.println("La ciudad: " + i + " vendio: $" + gananciaCiudad);

       }

       System.out.println("La ganancia total de EL GLOBO FUE: $" + gananciaTotal);



    }
}
