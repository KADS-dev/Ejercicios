import java.util.Scanner;

public class Reves {
    public static void main(String[] args) {
        double num = 0;
        String cambio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entre o y 9.999:");

        num = sc.nextDouble();

        cambio = Double.toString(num).replace(".", "");

        char[] cc = cambio.toCharArray();

        for (int i = 0; i < cambio.length(); i++){
            if (i<cambio.length()) {
                int j = (i+1);
                System.out.println(cc[cambio.length() - j]);
            }
        }
    }
}
