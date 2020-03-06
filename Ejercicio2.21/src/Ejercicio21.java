/*
Pedir 10 números y mostrar al final si se ha introducido algo negativo;
 */

import java.util.Scanner;

public class Ejercicio21{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean negativo = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un numero: ");

            numero = sc.nextInt();

            if (numero < 0){
                negativo = true;
            }
        }
        if (negativo == false){
            System.out.println("No se han introducido numeros negativos.");
        }else if(negativo == true){
            System.out.println("Se han introducido numeros negativos.");
        }

    }

}
