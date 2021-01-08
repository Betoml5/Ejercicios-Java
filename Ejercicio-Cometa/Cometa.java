import java.util.Scanner;

public class CometaDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        String[] servicios = { "Agua", "Telefono", "Gas", "Luz" };
        double totalAgua = 0;
        double totalTelefono = 0;
        double totalLuz = 0;
        double totalGas = 0;
        double gastosMes = 0;
        double[][] servicioMes = new double[12][4];

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < servicios.length; j++) {
                if (j == 2 || j == 3) {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
                        System.out.println(
                                "Ingresa los gastos del servicio de: " + servicios[j] + " del mes de: " + meses[i]);
                        servicioMes[i][j] = entrada.nextDouble();
                    } else {
                        servicioMes[i][j] = 0;
                    }
                } else {
                    System.out.println(
                            "Ingresa los gastos del servicio de: " + servicios[j] + " del mes de: " + meses[i]);
                    servicioMes[i][j] = entrada.nextDouble();
                }
            }
        }

        for (int i = 0; i < meses.length; i++) {

            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    totalAgua += servicioMes[i][j];
                } else if (j == 1) {
                    totalTelefono += servicioMes[i][j];

                } else if (j == 2) {
                    totalLuz += servicioMes[i][j];

                } else if (j == 3) {
                    totalGas += servicioMes[i][j];
                }

            }

        }

        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < servicioMes.length; i++) {
            for (int j = 0; j < servicios.length; j++) {
                gastosMes += servicioMes[i][j]; 
            }
            System.out.println("Los gastos del mes de " + meses[i] + " fueron: $" + gastosMes);
            gastosMes = 0;
        }



        // Gastos totales de los servicios
        System.out.println("----------------------------------------------");
        System.out.println("GASTO TOTAL DE AGUA: $" + totalAgua);
        System.out.println("GASTO TOTAL DE LUZ: $" + totalLuz);
        System.out.println("GASTO TOTAL DE TELEFONO: $" + totalTelefono);
        System.out.println("GASTO TOTAL DE GAS: $" + totalGas);



        // Gastos desglosados
        System.out.println("------------ GASTOS DESGLOSADOS DE CADA SERVICIO POR MES --------------");
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < servicios.length; j++) {
                System.out.println("Los gastos de: " + servicios[j] + " del mes de: " + meses[i] + " Fue de: $" + servicioMes[i][j]);
                System.out.println("-----------------------------------------------------------------------------------------------");
            }
        }

    }
}
