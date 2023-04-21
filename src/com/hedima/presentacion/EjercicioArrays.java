package com.hedima.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrays {
    public static void main(String[] args) {
        // Declarar un Array de numeros y pocisionarse en una celda que no existe

        Scanner sc1 = new Scanner (System.in);
        int []array = {1,2,3,4,5};
        System.out.println("Que pocision quieres ver del array");
        try {
        int pos= sc1.nextInt();
            System.out.println("El valor del array es: " + array[pos] + "");
        }catch (InputMismatchException e) {
            System.out.println("La pocision es un valor invalido, tiene que ser un valor numerico");
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("la pocision no existe en nuestro Array");
            System.out.println(e.toString());
        }catch(Exception e) {
            System.out.println("Entra a la excepcion padre");

        }




    }

}
