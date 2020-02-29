/*
Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args){

        int numero;

        String cadena;

        boolean usado = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entre 00 y 99");
        numero = sc.nextInt();

        cadena = Integer.toString(numero);

        char[] numeroArray = new char[cadena.length()];

        for(int i = 0; i < cadena.length(); i++){

            numeroArray[i] = cadena.charAt(i);

                if (cadena.length() == 1){
                    switch (numeroArray[0]) {

                        case '0':
                            System.out.print("Cero");
                            break;
                        case '1':
                            System.out.print("Uno");
                            break;
                        case '2':
                            System.out.print("Dos");
                            break;
                        case '3':
                            System.out.print("Tres");
                            break;
                        case '4':
                            System.out.print("Cuatro");
                            break;
                        case '5':
                            System.out.print("Cinco");
                            break;
                        case '6':
                            System.out.print("Seis");
                            break;
                        case '7':
                            System.out.print("Siete");
                            break;
                        case '8':
                            System.out.print("Ocho");
                            break;
                        case '9':
                            System.out.print("Nueve");
                            break;
                    }
                }

                if (cadena.length() == 2 && usado != true) {
                    usado = true;
                    switch (numeroArray[0]) {
                        case '0':
                            System.out.print("Cero");
                            break;
                        case '1':
                            System.out.print("Diez");
                            break;
                        case '2':
                            System.out.print("Veinte");
                            break;
                        case '3':
                            System.out.print("Treinta");
                            break;
                        case '4':
                            System.out.print("Cuarenta");
                            break;
                        case '5':
                            System.out.print("Cincuenta");
                            break;
                        case '6':
                            System.out.print("Sesenta");
                            break;
                        case '7':
                            System.out.print("Setenta");
                            break;
                        case '8':
                            System.out.print("Ochenta");
                            break;
                        case '9':
                            System.out.print("Noventa");
                            break;
                    }
                }
                if ((cadena.length() == 2) && (i == 1) && (numeroArray[i] != '0')) {

                    System.out.print(" y ");
                    switch (numeroArray[1]) {

                     case '1':
                         System.out.print("Uno");
                         break;
                     case '2':
                         System.out.print("Dos");
                         break;
                     case '3':
                         System.out.print("Tres");
                         break;
                     case '4':
                         System.out.print("Cuatro");
                         break;
                     case '5':
                         System.out.print("Cinco");
                         break;
                     case '6':
                         System.out.print("Seis");
                         break;
                     case '7':
                         System.out.print("Siete");
                         break;
                     case '8':
                         System.out.print("Ocho");
                         break;
                     case '9':
                         System.out.print("Nueve");
                         break;
                 }
             }

            }

        }
    }
