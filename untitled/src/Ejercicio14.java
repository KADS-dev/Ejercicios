/*
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000$
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sueldo = 0;
        int sueldosMayores = 0;
        int sumaSueldo = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Ingresa un sueldo:");

            sueldo = sc.nextInt();

            sumaSueldo += sueldo;

            if (sueldo > 1000){
                sueldosMayores++;
            }
            System.out.println("La suma de los sueldos es de" + sumaSueldo + "$. Hay " + sueldosMayores + " sueldos mayores a 1000$");
        }
    }
}
