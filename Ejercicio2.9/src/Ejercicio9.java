/*
Escribir todos los números del 100 al 0 de 7 en 7.
 */

public class Ejercicio9 {

    public static void main(String[] args){

        int contador = 0;

        for(int i = 100; i > -1; i--) {

            System.out.println(i);
            ++contador;
            if(contador == 7){
                System.out.println();
                contador = 0;
            }

        }
    }

}
