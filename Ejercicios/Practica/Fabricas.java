package Ejercicios.Practica;

import java.util.Scanner;

/**
 * Write a description of class Fabricas here.
 * @author (Alberto Martinez) 
 * @version (27/11/2020)
 */

public class Fabricas {
    public static void main(String[] args) {

        
        String nombreProducto;
        double materiaPrima;
        double manoObra;
        double gastosFabr;
        double costoProduccion;
        double precioVenta;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre del articulo");
        nombreProducto = entrada.next();

        System.out.println("Ingresa el costo de materia prima");
        materiaPrima = entrada.nextDouble();


        //Hacemos las operaciones
        manoObra = (materiaPrima * 0.75);
        gastosFabr = materiaPrima * 0.30;
        costoProduccion = materiaPrima + manoObra + gastosFabr;
        precioVenta = costoProduccion + costoProduccion * .45;
        

        System.out.println("Articulo: " + nombreProducto);
        System.out.println("Costos: ");
        System.out.println("Materia prima: $" + materiaPrima);
        System.out.println("Mano de obra: $" + manoObra);
        System.out.println("Gastos de fabricacion: $" + gastosFabr);
        System.out.println("Gastos de produccion: $" + costoProduccion);
        System.out.println("Precio de venta $" + precioVenta);


    }
}
