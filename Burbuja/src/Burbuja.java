import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero, auxiliar = 0;
        String auxiliarDeCadena = "";
        numero = sc.nextInt();

        String numeroString = Integer.toString(numero);
        //auxiliar = Integer.getInteger(numeroString);
        int[] arrayNumero = new int[numeroString.length()];



        for(int i = 0; i < numeroString.length(); i++){


            auxiliarDeCadena += numeroString.charAt(i);

            arrayNumero[i] = Integer.parseInt(auxiliarDeCadena);

            auxiliarDeCadena = "";

        }

        metodoBurbuja(auxiliar, arrayNumero);


    }

    private static void metodoBurbuja(int auxiliar, int[] arrayNumero){
        for(int i = 0; i < (arrayNumero.length - 1); i++){

            for(int j = 0; j < arrayNumero.length - 1; j++){

                if(arrayNumero[j] > arrayNumero[(j+1)]){
                   auxiliar = arrayNumero[j];
                   arrayNumero[j] = arrayNumero[(j+1)];
                   arrayNumero[(j+1)] = auxiliar;

                }

            }
        }

        for(int i = 0; i < arrayNumero.length; i++){
            System.out.println(arrayNumero[i]);
        }

    }


}
