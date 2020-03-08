/*
Dibuja un cuadrado de n elementos de lado utilizando *.
 */

import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero: ");
        numero = sc.nextInt();

        for(int fila = 0; fila < numero; fila++){

            for(int columna = 0; columna < numero; columna++){

                System.out.print("* ");

            }

                System.out.println("");

        }

    }

}
