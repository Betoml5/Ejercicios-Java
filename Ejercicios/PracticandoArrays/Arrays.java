
import java.util.Scanner;

/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        

        //Asi declaramos un array. Tenemos que declarar la dimension de este, antes de empezar a usarlo.
        //Esto no pasa con las listas, ya que son dinamicas, pero este tipo de estructura de datos, tiene mas control de la memoria.
        String[] nombreArray = new String[4];

        //Esta es otra forma de declarar un arreglo
        String[] nombreArray2;
        nombreArray2 = new String[4];

        // Si quieres declarar un array, con valores propios o ya inicializados,
        // Entonces quedaria asi
        // Importante, poner los [] despues del tipo de dato
        String[] arrayNombresI = {"Beto", "Luis"};

        // Podemos hacer que un array, tenga una dimension "dinamica" lo que podemos hacer
        // Es pasarle a la dimension del arreglo, una variable "N" y esta definira la dimension de nuestro array.

        // Quedaria de esta manera.

        // Declaramos nuestra variable que va a definir el largo de nuestro arreglo
        int n;
        // Aqui vamos a definir el valor de la variable "n".
        System.out.println("¿De que dimension quieres que sea tu array?");
        n = entrada.nextInt();

        // Y por ultimo, la pasamos como "parametro" a nuestro arreglo.
        // Entonces el valor que le pasemos como entrada, va a ser el que tengamos como dimension.
        String[] arrayDinamico = new String[n];

        //Los arrays, se enumeran desde el elemento sero. Por ejemplo, si tenemos un array de nombres 
        // El largo de nuestro arreglo es de 3.
        // Si queremos acceder a la posicion de beto. No es la posicion 1, es la 0.
        // Entonces si quieremos acceder a la de juan, seria la [1]
        String [] nombres = {"Beto", "Juan", "Luis"};

    }
}