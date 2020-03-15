/*
Diseñar una aplicación que declare una tabla de diez elementos enteros. Leer mediante el teclado 8 números.
Después se debe de pedir un número y una posición, insertarlo en la posición indicada, desplazando los quue estén detrás.
 */
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int auxiliar = 0;
        int auxiliar2;
        int numero = 0;
        int posicion = 0;

        for(int i = 2; i < 10; i++){
            System.out.println("Ingresa el numero " + (i) + ".");
            tabla[i] = sc.nextInt();
        }
        System.out.println("Ingresa un numero: ");
        numero = sc.nextInt();

        System.out.println("Ingresa una posicion: ");
        posicion = sc.nextInt();

        for(int i = posicion; i >0; i--){


            if (i == posicion){
                auxiliar = tabla[i];
                tabla[i] = numero;
            }

                auxiliar2 = tabla[i-1];
                tabla[i-1] = auxiliar;
                auxiliar = auxiliar2;
        }
        for(int i = 0; i<10; i++){
            System.out.println(tabla[i]);
        }


    }
}