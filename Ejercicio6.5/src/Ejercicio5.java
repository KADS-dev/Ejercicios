/*
Función a la que se le pasan dos enteros y muestra dos números comprendidos entre ellos, inclusive.
 */
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Ingresa el numero 1: ");
        a = sc.nextInt();

        System.out.println("Ingresa el numero 2: ");
        b = sc.nextInt();

        //Se llama al metodo que imprime los numeros que se encuentran entre el primero y el segundo
        System.out.println("Los numeros entre el primer y el segundo numero son:");
        encontrarNumeros(a, b);
    }

    //Se imprime cada uno de los numeros que se encuentren entre el primero y el segundo
    private static void encontrarNumeros(int a, int b){
        for ( a = a; a < b-1; a++){
            System.out.println((a+1));
        }
    }


}
