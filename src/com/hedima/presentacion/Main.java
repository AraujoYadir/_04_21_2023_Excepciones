import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        System.out.println("Escribe un numero...");


        try {
            //lineas sensibles a error
            int numero = s1.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Has escrito un valor invalido");
        }
        System.out.println("---------Continua---------");




    }
}
