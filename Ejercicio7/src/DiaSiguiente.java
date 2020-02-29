import java.util.Scanner;

public class DiaSiguiente {

    public static void main(String[] args){

         int dia, mes, año;
         Scanner sc = new Scanner(System.in);

         System.out.println("Ingresa un día:");
         dia = sc.nextInt();

         System.out.println("Ingresa un mes");
         mes = sc.nextInt();

         System.out.println("Ingresa un año:");
         año = sc.nextInt();

         if (dia > 0 && dia <31 && mes > 0 && mes < 13 && año > 0){

             dia++;
             if (dia > 30) {

                 dia = 1;
                 mes++;

                 if (mes > 12){

                     mes = 1;
                     año++;
                 }

                 System.out.println("El día es el: " + dia + "\n el mes es: " + mes + "\n y el año es: " + año);


         }

             } else{
                 System.out.println("Fecha incorrecta");
             }

    }

}
