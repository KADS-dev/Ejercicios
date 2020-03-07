55/*
Pedir 5 numeros e indicar si alguno es multiplo de 3.
 */

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;

        boolean multiplo = false;

        for (int i = 0; i < 5; i++){
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();

            if(numero%3 == 0){
                multiplo = true;
            }
        }
        if(multiplo = true) {
            System.out.println("Hay al menos un multiplo de 3.");
        }else{
            System.out.println("No hay ningun multiplo de 3.");
        }

    }

}
