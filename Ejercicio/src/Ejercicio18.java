/*
Pedir el día, mes y año de una fecha correcta(dia > 0, mes > 0 y < 13, y  año mayor a 0), ymostrar la fecha del día siguiente.
°Febrero tiene 28 días.
 */

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

         int dia, mes, año;
         Scanner sc = new Scanner(System.in);

         System.out.println("Ingresa el día: ");
         dia = sc.nextInt();

         System.out.println("Ingresa el mes: ");
         mes = sc.nextInt();

         System.out.println("Ingresa el año: ");
         año = sc.nextInt();

        if ((dia > 0 && dia < 31) && (mes > 0 && mes < 13) && (año > 0)) {

            dia++;

            if (mes == 2 && dia == 29) {
                dia = 1;
                mes++;

            }


            if (mes == 2 && dia > 29) {
                System.out.println("Febrero tiene 28 días");
                año = 0;
            }


            if (dia > 30) {
                dia = 1;
                mes++;
            }

            if (mes > 12) {
                    mes = 1;
                    año++;
                }

            if (año != 0) {
                System.out.println("El día es: " + dia + "\nel mes es: " + mes + "\nel año es: " + año);
                }


            }

        }



    }

