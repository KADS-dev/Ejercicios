/*
Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero etc.
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for(int j = 0; j < 5; j++){
            System.out.println( (j+1) + ".- " + numeros[j]);

            System.out.println((numeros.length-j) + ".- " + numeros[numeros.length-j-1]);
        }


    }

}

