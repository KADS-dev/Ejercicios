/*
Leer un numero e indicar si es positivo o negativo, el proceso se repetirá hasta que se introduzca un cero
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        int valido = 0;
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i > valido; i++){

            System.out.println("Ingresa un numero:");
            numero = sc.nextInt();

            if(numero > 0){
                System.out.println("El numero es positivo.");
            }else if(numero <0){
                System.out.println("El numero es negativo.");
            }else{
                System.out.println("El numero es cero.");
                valido = (i + 1);
            }

        }
    }
}
