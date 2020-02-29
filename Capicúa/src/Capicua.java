import java.util.Scanner;
public class Capicua {
    public static void main(String[] args){

        double num = 0;
        Scanner sc = new Scanner(System.in);
        String comprobante1 = "", comprobante2 = "";

        //Pedir y capturar el numero
        System.out.println("Ingresa un numero entre 0 y 9.999");
        num = sc.nextDouble();


        //pasar el numero de un tipo double a un array de tipo char
        char[] reten = Double.toString(num).replace(".", "").toCharArray();

        //pasar el array a dos Strings (uno al derecho y otro al reves)

        for(int i = 0; i < reten.length; ++i){

            comprobante1 += reten[i];

        }
        for (int j = 0; j < reten.length; ++j ){
            comprobante2 += reten[(  reten.length - 1 -j)];

        }

        //comprueba si los numeros son iguales
        if (comprobante1.equals(comprobante2)){
            System.out.println("Los numeros son capicuas");
        }else{
            System.out.println("Los numeros no son capicuas");
        }

    }
}