/*
Realizar una función que calcule (muestre en pantalla en área o el volumen de un cilindro, según se especifique.
Para distinguir un caso de otro se le pasará el carácter 'a' (para el área) o 'v' (para el volumen). Además hemos de
pasarle a la función el radio y la altura.
 */
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int altura, radio;
            char tipoCalculo;

        System.out.println("Si desea calcular el area de un cilindro, escriba 'a':" +
                "\nO si desea calcular el volumen del cilindro escriba 'v':");
            tipoCalculo = sc.next().charAt(0);

        System.out.println("Ingresa la altura del cilindro: ");
        altura = sc.nextInt();

        System.out.println("Ingresa el radio del cilindro: ");
        radio = sc.nextInt();


        if (tipoCalculo == 'a'){
            System.out.println("El area es " + calcularArea(altura, radio));
        }
        else if (tipoCalculo == 'v'){
            System.out.println("El volumen es " + calcularVolumen(altura, radio));
        }
    }

    private static double calcularArea(int altura, int radio){

        return ( ((3.1416* (radio * radio) ) * 2) + ((3.1416 * (radio * 2)) * altura));

    }

    private static double calcularVolumen(int altura, int radio){

        return( (3.1416*(radio * radio)) * altura);

    }

}
