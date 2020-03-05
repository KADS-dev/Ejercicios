/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura
figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
Se pide de cinco facturas introducidas: facturación total, cantidad en litros vendidos del artículo uno y cuantas
facturas se emitieron por más de seiscientos.
 */

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int dato;

        int cantidad;
        int precio;

        int facturacionTotal = 0;
        int litrosVendidosPrimer = 0;
        int facturasMayores = 0;

        for(int i = 0; i < 6; i++){

            System.out.println("Ingresa el codigo del pedido:");
            dato = sc.nextInt();

            System.out.println("Ingresa la cantidad de litros del pedido:");
            cantidad = sc.nextInt();

            System.out.println("Ingresa el precio por litros del pedido: ");
            precio = sc.nextInt();

            facturacionTotal += (cantidad * precio);

            if((cantidad*precio) > 600){
                facturasMayores++;
            }

            if(i == 0){
                litrosVendidosPrimer = cantidad;
            }
        }
        System.out.println("La facturacion total es: " + facturacionTotal + ", los litros vendidos del primer producto son: " +
                litrosVendidosPrimer + " y la cantidad de facturas mayores a 600$ fue de: " + facturasMayores);

    }

}
