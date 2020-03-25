/*
Ídem una versión que calcule el máximo de una tabla de n elementos.
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamaño, mayor;


        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = sc.nextInt();

        int[] tabla = new int[tamaño];

        //Se llena la tabla
        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingresa el numero " + (i+1) + " de la tabla: ");
            tabla[i] = sc.nextInt();
        }

        //Se asigna el mayor valor en la variable mayor
        mayor = calcularMayor(tabla);

        //Se imprime la variable mayor
        System.out.println("El numero mayor es " + mayor);

    }

    //Se calcula el mayor valor y se retorna
    private static int calcularMayor(int[] tabla){
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++){

            if (tabla[i] < mayor ){
                mayor = tabla[i];
            }
        }
        return mayor;
    }


}
