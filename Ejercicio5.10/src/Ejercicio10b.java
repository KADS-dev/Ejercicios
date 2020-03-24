/*
PROGRAMA Ej10b
     VARIABLES
        n, i: ENTEROS
        a, b: TABLA [100] ENTEROS
     COMIENZO
        n <- 10
        PARA i<-0 HASTA n-1
            leer (a[i])
        FIN PARA
        PARA i <- 0 HASTA n/2
            b[i] <- a[n-1-i]
            b[n-1-i] <- a[i]
            FIN PARA
            PARA i <- 0 HASTA n-1
                SI i mod 2 = 0
                    escribir (a[i])
                SINO
                    escribir (b[i])
             FIN SI
         FIN PARA
     FIN PROGRAMA

        Datos de entrada: 6, 2, 8, 9, 2, 5, 8, 2, 6 y 1.
 */

import java.util.Scanner;
public class Ejercicio10b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;
        int[] a = new int[100];
        int[] b = new int[100];
        n = 10;
        for (i = 0; i < n-1; i++){
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n/2; i++){
            b[i] = a[n-1-i];
            b[n-1-i] = a[i];
        }
        for (i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(a[i]);
            }else{
                System.out.println(b[i]);
            }

        }


    }

}
