/*
Se pretende realizar un programa para gestionar la lista de participantes en una competición de salto de longitud.
El número de plazas disponible es de 10. Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose
los atletas. Diseñar el programa que muestre las siguientes opciones:

            1- Inscribir un participante.
            2- Mostrar listado de datos.
            3- Mostrar listado de marcas.
            4- Finalizar el programa.

Si se selecciona 1, se introduciránlos datos de uno de los participantes: Nombre, mejor marca del 2002, mejor marca del
2001 y mejor marca del 2000.
Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
Tras procesar cada opción se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción 4, que terminará
el programa.

//Preferí modificar el numero 3 y mostrarlo de acuerdo a como se ingresen los 3 datos, y no de acuerdo a su posición resultante
//en la marca 2002

 */


import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion;

        boolean seguir = true;

        int contadorParticipantes = 0;

        String nombre = "";
        int marca2002 = 0;
        int marca2001 = 0;
        int marca2000 = 0;

        //Se crea un arreglo de objetos Personas
        Participante p []= new Participante[10];
        p[0] = new Participante(nombre, marca2002, marca2001, marca2000);


        while (seguir) {

            System.out.println("Elija la opcion: \n1- Inscribir un participante.\n2- Mostrar listado de datos.\n3- Mostrar listado de marcas." +
                    "\n4- Finalizar el programa.");
            eleccion = sc.nextInt();

            switch (eleccion){

                case 1:{

                    if(contadorParticipantes < 11){
                        System.out.println("Ingrese el nombre del participante:");
                        nombre = sc.nextLine();
                        nombre = sc.nextLine();
                        System.out.println("Ingrese la mejor arca del 2002:");
                        marca2002 = sc.nextInt();
                        System.out.println("Ingrese la mejor arca del 2001:");
                        marca2001 = sc.nextInt();
                        System.out.println("Ingrese la mejor arca del 2000:");
                        marca2000 = sc.nextInt();

                        p[contadorParticipantes]= new Participante(nombre, marca2002, marca2001, marca2000);
                        contadorParticipantes++;
                    }


                    break;
                }
                case 2:{
                    for (int i = 0; i < contadorParticipantes; i++){
                        System.out.println("-El nombre del participante " + (i+1) + " es " + p[i].getNombre());
                        System.out.println();
                    }

                    break;
                }
                case 3:{

                    for (int i = 0; i < contadorParticipantes; i++){
                        System.out.println("-La marca del 2002 del participante " + (i+1) + " es " + p[i].getMarca2002());
                        System.out.println("-La marca del 2001 del participante " + (i+1) + " es " + p[i].getMarca2001());
                        System.out.println("-La marca del 2000 del participante " + (i+1) + " es " + p[i].getMarca2000());
                        System.out.println();
                    }
                    break;
                }
                case 4:{

                    seguir = false;

                    break;
                }
                default:{
                    System.out.println("Opcion incorrecta");
                }




            }






        }
    }

}
