/*
Módulo al que se le pasa un numero entero y devuelve el número de divisores primos que tiene.
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero: ");
        numero = sc.nextInt();

        System.out.println("La cantidad de numeros primos divisores del numero son " + calcularNumeroDivisoresPrimos(numero)
        + ".");
    }

    private static int calcularNumeroDivisoresPrimos(int numero){
        int indice = 0;
        int numeroDivisores = 0;
        int verificadorPrimo = 0;

        int [] arregloProvicional = new int[numero];
        int [] primos;
        int tamañoArreglo = 0;


        //Se encuentran los numeros primos
        for (int i = 1; i < (numero +1); i++){

            //Encuentra si el numero es divisible por otro numero
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    verificadorPrimo++;
                }

            }

            //Se toma al numero 2 como primo
            if (i == 2){
                arregloProvicional[indice] = i;
                indice++;
                tamañoArreglo++;
            }
            //Se toma al numero i si no fue dividido ni una vez por otro numero mayor a 2 y menor al mismo
            if (i > 2 && verificadorPrimo == 0){
                arregloProvicional[indice] = i;
                indice++;
                tamañoArreglo++;
            }

            verificadorPrimo = 0;

        }



        //Se instancia el arreglo con la cantidad de numeros primos obtenidos en el otro ciclo
        primos = new int[tamañoArreglo];

        //Se transpasan los numeros primos al segundo arreglo
        for (int i = 0; i < tamañoArreglo; i++){

            primos[i] = arregloProvicional[i];


        }




        //Divide el numero entre los numeros primos
        for (int i = 0; i < primos.length; i++){


            if (numero % primos[i] == 0){
                ++numeroDivisores;

            }

        }

        return numeroDivisores;
    }

}
