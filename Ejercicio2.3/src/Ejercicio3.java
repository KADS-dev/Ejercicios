/*
Leer numeros hasta que se introduzca un cero. Para cada uno indicar si es par o impar
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        int valido = 0;

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i > valido; i++){

            System.out.println("Ingresa un numero:");
            numero = sc.nextInt();

            if (numero != 0){
                if ( (numero%2) == 0 ){
                    System.out.println("El numero es par. \n");
                }else{
                    System.out.println("El numero es impar. \n");
                }
            }else{
                System.out.println("El numero es cero.");
                valido = (i+1);
            }
        }
    }
}
