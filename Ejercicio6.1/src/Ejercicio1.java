/*
Realzar una función a la que se le passe como parámetro un número N, y se muestre por pantalla N veces, el mensaje:
"Módulo ejecutándose"
 */

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingresa un numero:");
        n = sc.nextInt();


        mostrarMensaje(n);
    }

    private static void mostrarMensaje(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Modulo ejecutandose.");
        }
    }

}
