/*
Realizar un programa que nos pida un número n y nos diga cúantos números hay entre 1 y n que son primos
 */

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        int cocienteCero = 0;

        System.out.println("Ingresa un numero:");
        numero = sc.nextInt();

        for(int i =1; i < numero+1; i++) {



            for (int j = 2; j < i+1; j++) {


                System.out.println("j = " + j);

            //SE DIVIDE EL NUERO ACTUAL "i" ENTRE LOS NUMEROS ANTERIORES A EL DESDE EL 2, SI LA DIVISION DA 0, LA VAR. COCIENTE
                // SUMA 1
                if ((i % j) == 0) {
                    cocienteCero++;
                }

            }

            //CUANDO SOLO SE DA UNA VEZ EL RESULTADO 0 DEL MODULO, SIGNIFICA QUE ES UN NUMERO PRIMO EL QUE SE DIVIDIO
            if (cocienteCero == 1) {
                ++contador;
            }
            //REINICIO EL CONTADOR DE MODULO A 0 PARA QUE HAGA LA COPROBACION LIMPIA EN LA PROXIMA VUELTA
            cocienteCero = 0;

        }
             System.out.println("Numeros primos: " + contador + ".");
    }

}
