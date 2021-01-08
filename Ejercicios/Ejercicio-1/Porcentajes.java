import java.util.Scanner;
public class Porcentajes
{


    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        
        float cantidad, porcentajeDeseado, resultado;
        
        System.out.println("¿Cantidad?");
        cantidad = entrada.nextFloat();
        
        System.out.println("¿Qué porcentaje se desea obtener?");
        porcentajeDeseado = entrada.nextFloat();
        
        resultado = cantidad*porcentajeDeseado/100;
        
        System.out.print("El " + porcentajeDeseado + "%" + " de " + cantidad + " es: " + resultado + " "); 
        
    }
    
   
}
