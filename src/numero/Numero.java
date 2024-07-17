package numero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int num = ran.nextInt(100);
        int intentos = 1;
        int ban = 0;
        int resp = 0;

        try {
            System.out.println("=================================================== <[Calculando]> ===============================================");
            System.out.println("Estoy pensando en un numero entre el 1 y el 100 ...");
            System.out.println("=================================================== <[Juego en curso]> ===========================================");
            System.out.print("En que numero pienso?: ");
            resp = scan.nextInt();

            while (ban != 1) {

                if (resp < num) {
                    System.out.print("No, el numero en el que pienso es mas alto: ");
                    resp = scan.nextInt();
                    intentos++;
                } else if (resp > num) {
                    System.out.print("No, el numero en el que pienso es mas bajo: ");
                    resp = scan.nextInt();
                    intentos++;
                } else {
                    ban = 1;
                }
            }

            System.out.println("=================================================== <[Felicidades]> ===============================================");
            System.out.println("Excelente, era el " + num + "\nUsaste " + intentos + " intentos");
            System.out.println("==================================================================================================================");

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }

    }

}
