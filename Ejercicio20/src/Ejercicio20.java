/*
Pedir una hora de la forma horas, minutos y segundos, y mostrar la hora en el segundo siguiente.
 */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){

        int horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las horas:");
        horas = sc.nextInt();

        System.out.println("Ingresa los minutos");
        minutos = sc.nextInt();

        System.out.println("Ingresa los segundos");
        segundos = sc.nextInt();


        if ((horas < 25 && horas > -1) && (minutos < 61 && minutos > -1) && (segundos < 61 && segundos > -1)){
            segundos++;
            if (segundos > 60){
                segundos = 0;
                minutos++;
                if (minutos > 60){
                    minutos = 0;
                    horas++;
                }
            }

            System.out.println("Tiempo: " + horas + ":" + minutos + ":" + segundos);

        }else{
            System.out.println("Tiempo incorrecto");
        }

    }
}
