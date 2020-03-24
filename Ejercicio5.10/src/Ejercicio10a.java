/*
Los siguientes programas piden una serie de datos

    PROGRAMA Ej10a
    VARIABLES
        i, m, a: ENTEROS
        t: TABLA [5] ENTEROS
     COMIENZO
        PARA i<-0 HASTA 4
            leer (t[i])
        FIN PARA
        m <- 0
        PARA i <- 0 HASTA 4
            SI t[i] > m
                m <- t[i]
            FIN SI
        FIN PARA
        a <- t[4-m]
        t[4-m] <- t[m]
        t[m] <- a
        PARA i <- 0 HASTA 4
            escribir (t[i])
        FIN PARA
     FIN PROGRAMA
     Datos de entrada: -4, 0, 1, 3 y 2.

*/


import java.util.Scanner;
public class Ejercicio10a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, m, a;
        int[] t = new int[5];

        for ( i = 0; i < 4; i++){

           t[i] = sc.nextInt();
        }
        m = 0;
        for (i = 0; i < 4; i++){
            if (t[i] > m){
                m = t[i];
            }
        }
        a = t[4-m];
        t[4-m] = t[m];
        t[m] = a;

        for (i = 0; i < 4; i++){
            System.out.println(t[i]);
        }
    }

}
