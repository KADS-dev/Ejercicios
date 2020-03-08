/*
Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la
particularidad de que cada vez que aparezca un 3 lo sustituya por una E.
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] digito = new int[]{
                0, 0, 0, 0, 0
        };

        for(int i = 0; i < 5; i++){

            for(int j = 0; j <10; j++){

                if(j!=3) {
                    digito[i] = j;
                    System.out.println( digito[i]);
                }else{
                    System.out.println("E");
                }
            }
            System.out.print(digito[0] + " - " + digito[1] + " - " + digito[2] + " - " + digito[3] + " - "
                    + digito[4]);

        }

    }

}
