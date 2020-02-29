import java.util.Scanner;

public class ComprobarFecha1 {


    public static void main(String[] args){

        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa el día:");
        dia = sc.nextInt();

        System.out.println("Ingresa el mes:");
        mes = sc.nextInt();


        System.out.println("Ingresa el año:");
        ano = sc.nextInt();



        if (dia == 30 && mes < 13 && mes > 0 && ano > 0){
            System.out.println("La fecha es correcta.5555555555555");
        }
    }

}
