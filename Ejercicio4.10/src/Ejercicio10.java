/*
Idéntico al anterior ("Crea un programa que lea por teclado  una tabla de diez números enteros y los desplace hacia abajo; el primero pasa a ser el segundo
, el segundo pasa a ser el tercero y así sucesivamente, el último pasa a ser el primero."), solo que desplazar N posiciones (N es introducido por el usuario).
 */

import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 9;
        int despalazamiento = 0;
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];

        //Se llena la segunda tabla
        for(int i = 0; i < 10; i++){

            System.out.println("Ingresa el numero" + (i+1) +": " );
            tabla2[i] = sc.nextInt();
        }

        System.out.println("Ingresa la cantidad de desplazammientos: ");
        despalazamiento = sc.nextInt();


        //Recorre los primeros numeros de la segunda tabla en los ultimos numeros de la primera
        for(int i = 9; i > -1; i--){

            if(i - despalazamiento > -1){
                tabla1[i] = tabla2[i - despalazamiento];
            }

        }

        //Recorre los ultimos numeros de la segunda tabla y los poone en la primera
              for(int j = despalazamiento; j > 0; j--){

                  tabla1[j-1] = tabla2[numero];

                    --numero;
                }

        for(int i = 0; i < 10; i++){
            System.out.println("Numero " + (i+1) + ": " + tabla1[i]);
        }

    }
}
