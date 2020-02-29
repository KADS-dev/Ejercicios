/*
Pedir dos fechas y mostrar el nuero de días que hay de diferencia.
Suponiendo que los meses tienen 30 días
*/

import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia 1");
        int dia1 = sc.nextInt();
        System.out.println("Ingresa el mes 1");
        int mes1 = sc.nextInt();
        System.out.println("Ingresa el año 1");
        int año1 = sc.nextInt();

        int auxDia1;

        System.out.println("Ingresa el dia 2");
        int dia2 = sc.nextInt();
        System.out.println("Ingresa el mes 2");
        int mes2 = sc.nextInt();
        System.out.println("Ingresa el año 2");
        int año2 = sc.nextInt();

        int auxDia2;

        int dias = 0;

        if (dia1 != dia2 && mes1 != mes2 && año1 != año2){
            System.out.println("La fecha puede calcularse");

            auxDia1 = (dia1 + ((mes1 -1) * 30));
            auxDia2 = (dia2 + ((mes2 -1) * 30));
            if (año2 != año1) {
                dias += (((año2 - año1) -1) * 360);

            }

            dias += (360 - auxDia1);
            dias += (auxDia2);



            System.out.println("Dias de diferencia:" + dias);
        }else{
            System.out.println("La fecha es la misma");
        }


    }

}
