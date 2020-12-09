import java.util.Scanner;
/**
 * Empresa
 */
public class Empresa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTrabajadas = 0;
        String nombreTrabajador;
        double pagoHora;
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};    


        System.out.println("Ingresa el nombre del trabajador");
        nombreTrabajador = entrada.nextLine();
        System.out.println("Ingresa el pago por hora trabajada");   
        pagoHora = entrada.nextDouble();
        

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Horas trabajadas el dia: " + diasSemana[i]);
            horasTrabajadas += entrada.nextInt();
        }

        System.out.println("Empleado: " + nombreTrabajador);
        System.out.println("Horas trabajadas. " + horasTrabajadas + " horas" );
        System.out.println("El pago por hora aplicado es de: $" + pagoHora);
        System.out.println("Pago total: $" + horasTrabajadas*pagoHora);

    }

    
}