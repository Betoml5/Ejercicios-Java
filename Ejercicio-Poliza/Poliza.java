import java.util.Scanner;

/**
 * Write a description of class Fabricas here.
 * Hacemos un calculo para determinar la comision que se le otorgara al empleado.
 * 
 * @author (Alberto Martinez)
 * @version (1/12/2020)
 */

public class Poliza {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombreEmpleado;
        String lugar;

        double costoDia;
        double otrosGastos;
        double totalViaticos;

        double comisionFinal;

        int diasFuera;
        final int ALIMENTOS = 800; // Hacemos una constante ya que es un dato que no cambiara

        System.out.println("Ingresa el nombre del empleado");
        nombreEmpleado = entrada.nextLine();

        System.out.println("Ingrese el lugar a donde se traslada");
        lugar = entrada.nextLine();

        System.out.println("Ingrese el costo por dia de hospedaje");
        costoDia = entrada.nextDouble();

        System.out.println("Ingrese los dias que estara fuera");
        diasFuera = entrada.nextInt();

        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Lugar de traslado: " + lugar);
        System.out.println("Por concepto de hospedaje de $" + costoDia + " por dia");
        System.out.println("Un total de: $" + diasFuera * costoDia);

        totalViaticos = diasFuera * costoDia;

        System.out.println("Por concepto de alimentos $800 por dia un total de $" + ALIMENTOS * diasFuera);

        totalViaticos = totalViaticos + (ALIMENTOS * diasFuera);

        System.out.println("Total, por concepto de viaticos $" + totalViaticos);

        otrosGastos = (7 * totalViaticos) / 100;

        System.out.println("Otros gastos: $" + otrosGastos);

        comisionFinal = totalViaticos + otrosGastos;

        System.out.println("La cantidad a otorgar al empleado es de $" + comisionFinal);

    }
}