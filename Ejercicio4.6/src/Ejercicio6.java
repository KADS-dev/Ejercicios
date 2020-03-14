/*
Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la
tabla A, 3 de  la tabla B, otros 3 de la A, otros 3 de la B, etc.
 */
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = 0, k = 0, l = 0;
        int [] tabla1 = new int[12], tabla2 = new int[12], tabla3 = new int[24];

        //llenado de la primer tabla
        for(int i = 0; i <12; i++){
            System.out.println("Ingresa el numero " + (i+1) +" de la tabla 1: ");
            tabla1[i] = sc.nextInt();
        }

        //llenado de la tabla2
        for(int i = 0; i <12; i++){
            System.out.println("Ingresa el numero " + (i+1) + " de la tabla 2: ");
            tabla2[i] = sc.nextInt();
        }

        //llenado de la tabla 3
        for(int i = 0; i < 4; i++){

            tabla3[l] = tabla1[j];
            ++l;
            ++j;
            tabla3[l] = tabla1[j];
            ++l;
            ++j;
            tabla3[l] = tabla1[j];
            ++l;
            ++j;

            tabla3[l] = tabla2[k];
            ++l;
            ++k;
            tabla3[l] = tabla2[k];
            ++l;
            ++k;
            tabla3[l] = tabla2[k];
            ++l;
            ++k;

        }
        //mostrar tabla 3
        System.out.println("Tabla 3: ");
        for (int i = 0; i < 24; i++) {
            System.out.println((i+1) + "°- " + tabla3[i]);

        }
    }

}
