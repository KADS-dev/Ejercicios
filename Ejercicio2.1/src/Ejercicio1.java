/*
Leer un número y ostrar su cuadrado, repetir el procesohasta que se introduzca un nuero negativo
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        int valido = 0;
        int numero;

        for (int i = 1; i > valido ; i++){

          Scanner sc = new Scanner(System.in);

          System.out.println("Ingresa un numero:");
          numero = sc.nextInt();

          if (numero >= 0) {
              System.out.println((numero * numero));
              i = 1;
          }else{
              System.out.println("Introdujiste un numero negativo");
              i = -1;
          }
        }

    }

}
