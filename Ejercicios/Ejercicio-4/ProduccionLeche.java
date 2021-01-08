import java.util.Scanner;
public class ProduccionLeche
{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        double gal, litros;
        
        System.out.println("¿Cuantos litros de leche produce?");
        litros = entrada.nextDouble();
        
        gal = litros/3.785;
        
        System.out.print("La produccion total fue de: " + gal + " galones");
        
        
        
        
        
    }
}
