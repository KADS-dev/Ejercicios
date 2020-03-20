/*
Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se obtiene la misma tabla al cambiar
las filas por columnas.
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][4];
        boolean simetrico = true;

        //Se llena la tabla
        for (int i = 0; i < 4; i++){
            System.out.println("Ingrese los numeros de la fila " + (i+1) + ": ");
            for (int j = 0; j < 4; j++){
                System.out.println("Columna " + (j+1) + ": ");
                tabla[i][j] = sc.nextInt();
            }

        }
        //Se comprueba qque sean iguales
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (tabla[j][i] != tabla[i][j]){
                    simetrico = false;
                }
            }
        }

        //Se muestra si es o no simetrica
        if (simetrico == true){
            System.out.println("La tabla es simetrica");
        }else{
            System.out.println("La tabla es asimetrica");
        }

    }

}