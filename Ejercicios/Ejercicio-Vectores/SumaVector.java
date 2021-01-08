import java.util.Scanner;

public class SumaVector {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Ingresa la cantidad de elementos que tendran los arreglos");
        n = entrada.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        System.out.println("Ingresa los valores del vector A"); 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Posicion: " + (i+1));
            vectorA[i] = entrada.nextInt();
        }
        System.out.println("Ingresa los valores del vector B"); 
        for (int i = 0; i < n; i++) {
            System.out.println("Posicion: " + (i+1));
            vectorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Valores del vector C");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println("Posicion: " + (i+1) + " valor: " + vectorC[i]);
        } 
        
    }
}
