/*

 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){

        Random ran = new Random();

        int numeroRandom = ran.nextInt(1) + 10000;

        Scanner sc = new Scanner(System.in);

        int numero = -1;

        while(numero!=numeroRandom){

            System.out.println("Ingresa un numero;");

            numero = sc.nextInt();

            if (numero>numeroRandom){
                System.out.println("Menos.");
            }
            else if (numero<numeroRandom){
                System.out.println("Mas.");
            }else{
                System.out.println("Le atinaste :D");
            }
        }
    }
}
