/*
Hacer lo mismo que el ejercicio anterior, pero con la matriz 9x9x9. Creamos un cubo con las caras puestas a 1 y el interior a 0
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        int[][][] cubo = new int[9][9][9];

        //Se llena la matriz cubo
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                for (int k = 0; k < 9; k++){

                    if (i == 0 || i == 8 || j == 0 || j == 8 || k == 0 || k ==8){
                        cubo[i][j][k] = 1;
                    }

                }
            }
        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                for (int k = 0; k < 9; k++){

                    System.out.print(cubo[i][j][k] + " ");

                }

                System.out.println();

            }

            System.out.println("-------------- ----");
        }



    }

}
//No tengo idea de como debería de funcionar este código, ya que según el libro debería de ser así :/