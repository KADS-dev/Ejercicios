/*
Crea un programa que lea por teclado  una tabla de diez números enteros y los desplace hacia abajo; el primero pasa a ser el segundo
, el segundo pasa a ser el tercero y así sucesivamente, el último pasa a ser el primero.
 */

import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int auxiliarA = 0;
        int auxiliarB = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero: " + (i+1) + ": ");
            tabla[i] = sc.nextInt();
        }

        for(int i = 0; i < 9; i++){
            if(i == 0) {
                auxiliarA = tabla[i];
                auxiliarB = tabla[i + 1];

                tabla[i+1] = auxiliarA;
            }
            else if(i > 0){
                auxiliarA = auxiliarB;
                auxiliarB = tabla[i + 1];

                tabla[i + 1] = auxiliarA;
            }
            if (i == 8){
                tabla[0] = auxiliarB;
            }


        }
        for(int i =0; i < 10; i++) {
            System.out.println(tabla[i]);
        }
    }

}
