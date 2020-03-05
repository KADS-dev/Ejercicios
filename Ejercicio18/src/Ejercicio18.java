/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura
figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
Se pide de cinco facturas introducidas: facturación total, cantidad en litros vendidos del artículo uno y cuantas
facturas se emitieron por más de seiscientos.

Suponiendo que no se introduce el precio por litros, solo existen tres productos con
precios:
        1- 0,6 $/litro, 2- 3$/litro y 3- 1,25 $/litro.

 */

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int dato;

       int cantidad;
       double precio;

       int facturacionTotal = 0;
       int litrosVendidosPrimer = 0;
       int cantidadFacturasMayores = 0;

       for(int i = 0; i <6; i++){

           System.out.println("Ingresa el codigo de la factura: ");
           dato = sc.nextInt();

           System.out.println("Ingresa la cantidad de litros: ");
           cantidad = sc.nextInt();

           System.out.println("Ingresa el precio entre los siguientes tres: \n 1- 0.6 \n 2- 3.0 \n 1.25");
           precio = sc.nextDouble();

           facturacionTotal += (cantidad * precio);

           if((cantidad*precio) > 600) {
               cantidadFacturasMayores++;
           }

           if( i == 0){
               litrosVendidosPrimer = cantidad;
           }
       }
        System.out.println("El total de facturacion es de: " + facturacionTotal +
                ", los litros vendidos de la primer factura son: " + litrosVendidosPrimer +
                " y la cantidad de facturas mayores a 600 fueron: " + cantidadFacturasMayores + ".");

    }

}
