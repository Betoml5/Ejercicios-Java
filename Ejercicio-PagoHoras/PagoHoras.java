import java.util.Scanner;
public class PagoHoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTrabajo;
        int horasExtra;
        double horasDoble;
        double pagoHora;
        double sueldoTotal;
       
        System.out.println("Ingresa el pago por hora trabajada");
        pagoHora = entrada.nextDouble();
        System.out.println("Ingresa las horas trabajadas");
        horasTrabajo = entrada.nextInt();

        if (horasTrabajo > 40) {
            horasExtra = horasTrabajo - 40;
            horasTrabajo -= horasExtra;
            System.out.println(" - - - - - - HORAS EXTRAS TRABAJADAS - - - - - -");
            horasDoble = pagoHora*2;
            sueldoTotal = (horasTrabajo*pagoHora) + (horasExtra*horasDoble);
            System.out.println("El sueldo semanal es de $" + sueldoTotal);
            System.out.println("Las horas de trabajo fueron: " + horasTrabajo + "hrs");
            System.out.println("El tiempo extra que se laboro fue de: " + horasExtra + "hrs");
            System.out.println("El pago por hora aplicado fue de: $" + pagoHora + " para las " + horasTrabajo + "hrs trabajadas");
            System.out.println("El pago por hora aplicado fue de: $" + horasDoble + " para las " + horasExtra + "hrs trabajadas");

        } else{
            System.out.println("No se trabajaron horas extra.");
            System.out.println("El sueldo semanal es: $" + (horasTrabajo*pagoHora));
            System.out.println("El tiempo que se laboro durante la semana fue de: " + horasTrabajo + "hrs");
            System.out.println("El pago por hora aplicado fue de: $" + pagoHora);
        }
        

    }
}
