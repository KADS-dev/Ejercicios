/*
Ídem que devuelva una tabla con el área y el volumen.
 */

import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura, radio;

        System.out.println("Ingresa la altura del cilindro: ");
        altura = sc.nextInt();

        System.out.println("Ingresa el radio del cilindro: ");
        radio = sc.nextInt();



        System.out.println("El area del cilindro es " + calcularAreaVolumen(altura, radio)[0] + ", el volumen del cilindro es "
                + calcularAreaVolumen(altura, radio)[1] + "." );

    }

    private static double[] calcularAreaVolumen(int altura, int radio) {

        double[] tabla = new double[2];


        double area = (  (3.1416 * (radio * 2) * altura) + ( (3.1416 * (radio * radio) ) * 2));

        double volumen = ((3.1416 * (radio * radio)) * altura);

        tabla[0] = area;
        tabla[1] = volumen;

        return tabla;
    }
    }


