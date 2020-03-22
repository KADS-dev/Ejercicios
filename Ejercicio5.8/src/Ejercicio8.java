/*
Crear una matriz "marco" de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla
        0       1       2       3       4       5

0       1       1       1       1       1       1

1       1       0       0       0       0       1

2       1       0       0       0       0       1

3       1       0       0       0       0       1

4       1       0       0       0       0       1

5       1       0       0       0       0       1

6       1       0       0       0       0       1

7       1       1       1       1       1       1


 */


public class Ejercicio8 {

    public static void main(String[] args) {

        int[][] marco = new int[8][6];

        //Se llena la matriz
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 6; j++){
                if (i == 0 || i == 7){
                    marco[i][j] = 1;
                }else if (j == 0 || j == 5){
                    marco[i][j] = 1;
                }else{
                    marco[i][j] = 0;
                }

            }
        }

        //Se muestra la matriz
        for (int i = 0; i < 8; i++){
            System.out.println();
            for (int j = 0; j < 6; j++){
                System.out.print(marco[i][j] + "   ");
            }
        }
    }

}
