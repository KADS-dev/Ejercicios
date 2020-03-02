/*
Diseñar un progra que muestre el producto de los 10 primeros números impares
 */

public class Ejercicio11 {
    public static void main(String[] main){
        long producto = 1;

        for(int i = 0; i < 20; i++){
            if (i%2 != 0) {
                producto = (producto*i);
            }
        }
        System.out.println("Producto = " + producto);
    }
}
