import com.sun.jdi.IntegerValue;

import java.util.Scanner;
public class ObtenerCifras {
    public static void main(String[] args){
        double num, comprobante;


        //capturar el numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 0 y 99.999");
        num = sc.nextDouble();

        //convertir el numero a un tipo int
        int res = (int) num;



        //comprobar si el numero es valido
            if (num >0 && num < 99.999){

                //resta del nummero double menos el numero int
                comprobante = (num - res);

                //si la resta da un numero menor a 1 y mayor a 0, entonces el numero solicitado tiene decimales (se imprimen las cifras de double)
                if (comprobante < 1.0 && comprobante > 0) {
                    System.out.println(Double.toString(num).replace(".", "").length());

                //si la resta da un numero igual a 0, entonces el nuero solicitado no tiene decimales (se imprimen las cifras de int)
                }else{
                    System.out.println(Integer.toString(res).replace(".", "").length());
                }

            }else{
                System.out.println("El numero no cumple con los parametros");
            }

    }
}
