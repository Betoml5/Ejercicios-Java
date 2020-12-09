import java.util.Scanner;
import java.util.Date;
import java.text.DecimalFormat;
public class Gerentes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date fecha = new Date();
        DecimalFormat formater = new DecimalFormat("###, ###. ##");

        String nombreEmpleado;
        int billetes1000;
        int billetes500;
        int billetes200;
        int billetes100;
        int billetes50;
        int billetes20;
        int totalCorte;

        System.out.println("Nombre");
        nombreEmpleado = entrada.next();
        System.out.println("Ingresa la cantidad de billetes de $1000");
        System.out.println("-----------------------------------------");
        billetes1000 = entrada.nextInt();
        System.out.println("Ingresa la cantidad de billetes de $500");
        System.out.println("-----------------------------------------");
        billetes500 = entrada.nextInt();
        System.out.println("Ingresa la cantidad de billetes de $200");
        System.out.println("-----------------------------------------");
        billetes200 = entrada.nextInt();
        System.out.println("Ingresa la cantidad de billetes de $100");
        System.out.println("-----------------------------------------");
        billetes100 = entrada.nextInt();
        System.out.println("Ingresa la cantidad de billetes de $50");
        System.out.println("-----------------------------------------");
        billetes50 = entrada.nextInt();
        System.out.println("Ingresa la cantidad de billetes de $20");
        System.out.println("-----------------------------------------");
        billetes20 = entrada.nextInt();

        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total al corte $" + formater.format((billetes1000*1000) + (billetes500*500) + (billetes200*200) + (billetes100*100) + (billetes50*50) + (billetes20*20)));



    }
}
