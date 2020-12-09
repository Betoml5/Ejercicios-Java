import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ahorroTotal = 0;
        double cantidadDepositada = 0;
        String nombreUsuario;
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Cantidad a depositar del mes " + meses[i]);
            cantidadDepositada = entrada.nextDouble();
            ahorroTotal += cantidadDepositada;
            System.out.println("Ahorro total hasta ahora: $" + ahorroTotal);

            if (i == 2) {
                ahorroTotal += (5*ahorroTotal/100);
            }

            if (i == 5) {
                ahorroTotal += (10*ahorroTotal/100);
            }

            if (i == 11) {
                ahorroTotal += (12*ahorroTotal/100);
            }

            
        }
        entrada.close();
        System.out.println("Al considerar las cantidades en cada mex, el ahorro anual seria de $" + ahorroTotal);
    }
}
