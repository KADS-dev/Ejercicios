/*
Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0;
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        int[][] matriz1 = new int[7][7];


        //Se llena la matriz
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++) {

                if (i == j){
                    matriz1[i][j] = 1;
                }else{
                    matriz1[i][j] = 0;
                }


            }
        }

        //Se muestra la matriz
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }


    }

}
