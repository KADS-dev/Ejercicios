/*
Pedir un número que debe estar entre 0 y 10) y mostrar la tabla de mmultiplicar de dicho número
 */

import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;

            System.out.println("Ingresa un numero");
            numero = sc.nextInt();

        if(numero >= 0 && numero <= 10);{
            for (int i = 0; i < 11; i ++){
                System.out.println(numero + " * " + i + " = " + (numero*i));
            }
        }
    }

}
