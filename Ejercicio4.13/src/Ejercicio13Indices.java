        import java.util.Scanner;
public class Ejercicio13Indices {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int[] tabla1 = new int[10];
            int[] tabla2 = new int[10];
            int[] indicePares ;
            int[] indiceImpares ;
            int cantidadPares = 0;
            int cantidadImpares = 0;
            int indice1= 0;
            int indice2= 0;

            //Se llena la tabla1 y se cuentan los numeros pares e impares
            for (int i = 0; i < 10; i++){
                System.out.println("Ingresa el numero " + (i+1) + ": ");
                tabla1[i] = sc.nextInt();

                if(tabla1[i] % 2 == 0){
                    cantidadPares++;
                }else{
                    cantidadImpares++;
                }
            }
            //Se inicializan los arreglos que gurdaran los indices de los numeros pares e impares
            // con las cantidades de pares e impares
            indicePares = new int[cantidadPares];
            indiceImpares = new int[cantidadImpares];

            //Se llenan los arreglos de los indices de numeros pares e impares con los indices del arreglo tabla1
            for (int i = 0; i < 10; i++){
                if(tabla1[i] % 2 == 0){
                    indicePares[indice1] = i;
                    ++indice1;
                }else{
                    indiceImpares[indice2] = i;
                    ++indice2;
                }
            }

            //Se reinician los indices para los arreglos que contienen los indices pares e impares
                indice1 = 0;
                indice2 = 0;


            //Se llena la tabla2 con los valores pares e impares de el arreglo tabla1, tomando como indice de la tabla1 los
            //arreglos que se llenaron anteriormente
            for(int i = 0; i < 10; i++){
                if(i < (cantidadPares)){
                    tabla2[i] = tabla1[indicePares[indice1]];
                    ++indice1;
                }else{
                    tabla2[i] = tabla1[indiceImpares[indice2]];
                    ++indice2;
                }
            }

            //Se muestra el arreglo tabla2 con los numeros ordenados del arreglo tabla1 de pares a impares
            for(int i = 0; i < 10; i++){
                System.out.println((i+1) + "- " + tabla2[i]);
            }

        }

    }
