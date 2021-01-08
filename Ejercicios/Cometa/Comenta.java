import java.util.Scanner;

public class Comenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        String[] servicios = { "Agua", "Telefono", "Luz", "Gas" };
        double[][] serviciosMes = new double[12][4];

        double totalAgua = 0;
        double totalTelefono = 0;
        double totalLuz = 0;
        double totalGas = 0;

        // Gas y luz son bimestrales

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Ingresa los gastos de agua del mes: " + meses[i]);
            serviciosMes[i][0] = entrada.nextDouble();
        }

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Ingresa los gastos de telefono del mes: " + meses[i]);
            serviciosMes[i][1] = entrada.nextDouble();
        }

        for (int i = 0; i < meses.length; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10) {
                System.out.println("Ingresa los gastos de gas del mes: " + meses[i]);
                serviciosMes[i][2] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < meses.length; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10) {
                System.out.println("Ingresa los gastos de luz: " + meses[i]);
                serviciosMes[i][3] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < meses.length; i++) {

            

            for (int j = 0; j < 4; j++) {
                if (j == 0 ) {
                    totalAgua += serviciosMes[i][j];
                } else if (j == 1){
                    totalTelefono += serviciosMes[i][j];
                    
                } else if(j == 2){
                    totalLuz += serviciosMes[i][j];
                
                } else if(j ==3){
                    totalGas += serviciosMes[i][j];
                }
                
            }
    
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("GASTO TOTAL DE AGUA: $" + totalAgua);
        System.out.println("GASTO TOTAL DE LUZ: $" + totalLuz);
        System.out.println("GASTO TOTAL DE TELEFONO: $" + totalTelefono);
        System.out.println("GASTO TOTAL DE GAS: $" + totalGas);
        System.out.println("----------------------------------------------");

        for (int i = 0; i < serviciosMes.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("GASTOS DE: " + servicios[j] + " del mes: " + meses[i]);
                System.out.println("$" + serviciosMes[i][j]);
            }
        }

    }
}
