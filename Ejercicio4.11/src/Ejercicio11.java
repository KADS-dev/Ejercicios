/*
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Estos los guardaremos en una tabla de tamaño 10,
leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int auxiliar;

        for(int i = 0; i < 5; i++){

            System.out.println("Ingresa el numero " + (i+1) +": ");
            tabla1[i] = sc.nextInt();

        }

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {

                if (tabla1[j] > tabla1[j+1]){
                    auxiliar = tabla1[j];
                    tabla1[j] = tabla1[j+1];
                    tabla1[j+1] = auxiliar;
                }
            }
        }

        System.out.print("Tabla ordenada: ");
        for (int i = 0; i < 5; i++){
            System.out.print(tabla1[i]);
        }

        System.out.println();
        System.out.println("Ingrese otro numero: ");
        tabla1[5] = sc.nextInt();

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {

                if (tabla1[j] > tabla1[j+1]){
                    auxiliar = tabla1[j];
                    tabla1[j] = tabla1[j+1];
                    tabla1[j+1] = auxiliar;
                }
            }
        }

        System.out.println("Tabla ordenada por segunda ocasion: ");
        for (int i = 0; i < 6; i++){
            System.out.print(tabla1[i]);
        }

    }

}
