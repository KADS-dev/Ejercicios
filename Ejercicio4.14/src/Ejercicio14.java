/*
Leer dos series de diez enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera,
 de forma que sigan ordenadas
 */

import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];
        int[] serie3 = new int[20];
        int auxiliar1, auxiliar2, auxiliar3;

            for(int i = 0; i < 10; i++){
                System.out.println("Ingresa el numero " + (i+1) + " de la serie1: ");
                serie1[i] = sc.nextInt();
            }

            for(int i = 0; i < 10; i++){
                System.out.println("Ingresa el numero " + (i+1) + " de la serie2: ");
                serie2[i] = sc.nextInt();
            }

            //Se ordenan los dos primeros arreglos
            for (int i = 0; i < 10; i++){

                for (int j = 0; j < 9; j++){
                    if(serie1[j] > serie1[j+1]) {
                        auxiliar1 = serie1[j];
                        serie1[j] = serie1[j+1];
                        serie1[j+1] = auxiliar1;
                    }
                }

                for (int j = 0; j <9; j++){
                    if(serie2[j] > serie2[j+1]){
                        auxiliar2 = serie2[j];
                        serie2[j] = serie2[j+1];
                        serie2[j+1] = auxiliar2;
                    }
                }

            }

            //Se llena el tercer arreglo
            for (int i = 0; i < 10; i++){

                    serie3[i] = serie1[i];

            }
            for (int i = 0; i < 10; i++){

                serie3[i+10] = serie2[i];

            }

            //Se ordena el tercer arreglo
            for (int i = 0; i < 20; i++) {

                for (int j = 0; j < 19; j++) {
                    if (serie3[j] > serie3[j + 1]){
                        auxiliar3 = serie3[j];
                        serie3[j] = serie3[j+1];
                        serie3[j+1] = auxiliar3;
                    }
                }

            }

            //Se muestra el arreglo serie3
            for (int i = 0; i < 20; i++){
                System.out.println((i+1) + "- " + serie3[i]);
            }
    }

    }

