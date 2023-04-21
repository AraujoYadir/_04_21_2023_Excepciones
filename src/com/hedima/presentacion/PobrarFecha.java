package com.hedima.presentacion;

import com.hedima.modelo.Fecha;

public class PobrarFecha {
    public static void main(String[] args) {
        Fecha f1= new Fecha(34,11,1986);
        try{
            f1.comprobar();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("-------Continua la programacion______");

    }
}
