import java.util.Scanner;

public class Porcentajes_2
{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float cantidad, cantidadDeseada, resultado;
        
        System.out.println("Cantidad a evaluar");
        cantidad = entrada.nextFloat();
        
        System.out.println("¿Qué cantidad de: " + cantidad + " deseas convertir a porcentaje?");
        cantidadDeseada = entrada.nextFloat();
        
        resultado = cantidadDeseada*100/cantidad;
        
        System.out.print("La cantidad que ingresaste, es el: " + resultado + "% de " + cantidad); 
        
    }
    
    
}
