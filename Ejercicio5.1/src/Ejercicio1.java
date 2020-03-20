/*
Crear una tabla bidimencional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m] debe contener n*m.
Después se debe mostrar su contenido.
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[5][5];

        //Se llena la tabla
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                tabla[i][j] = (i*j);
            }
        }

        //Se muestra la tabla
        for (int i = 0; i < 5; i++){
            System.out.println("Fila \"" + (i+1) + "\": ");
            for (int j = 0; j < 5; j++){
                System.out.println("Columna \"" + (j+1) + "\": " + tabla[i][j]);
            }
        }

    }

}
