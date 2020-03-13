/*
Leer por teclado dos tablas de diez números enteros y mezclarlas en una tercera de la forma:
el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.
 */

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10], tabla2 = new int[10], tabla3 = new int[20];
        int j = 0;

        //llenar primer tabla
        for(int i = 0; i < 10; i++){
            System.out.println("Inserta el valor " + (i+1) + " de la tabla 1: ");
            tabla1[i] = sc.nextInt();
        }

        //lenar segunda tabla
        for(int i = 0; i < 10; i++){
            System.out.println("Inserta el valor " + (i+1) + " de la tabla 2: ");
            tabla2[i] = sc.nextInt();
        }

        //llenar tercera tabla
        for(int i = 0; i < 10; i++){

            tabla3[j] =  tabla1[i];
            ++j;
            tabla3[j] = tabla2[i];
            ++j;
        }

        //mostrar tabla 3
        for(int i = 0; i < 20; i++){
            System.out.println((i+1) + "°- " + tabla3[i]);
        }
    }
}
