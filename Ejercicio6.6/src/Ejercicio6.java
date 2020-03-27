/*
Función que muestre en pantalla el doble del valor que se le pasa como parámetro.
 */

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para duplicar: ");
        int numero = sc.nextInt();

        //Se imprime el metodo que duplica el numero
        System.out.println("El doble del numero recibido es " + duplicarNumero(numero));

    }

    //Se duplica el numero
    private static int duplicarNumero(int numero){

        return(numero*2);

    }

}
