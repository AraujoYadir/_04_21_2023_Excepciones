package com.hedima.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        System.out.println("Escribe un numero...");


        try {
            //lineas sensibles a error
            int numero = s1.nextInt();
        }catch(InputMismatchException e){ // copias el primer error que nos da el progrma y lo pegamos "InputMismatchException" y ponemos un nombre "e"
           //catch(Exception e) // tambien vale con poner "Exception"
            System.out.println("Has escrito un valor invalido");
        }
        System.out.println("---------Continua---------");




    }
}
