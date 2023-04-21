package com.hedima.presentacion;


import com.hedima.modelo.Producto;

public class ProbarLanzarExepcion extends Producto{
    public static void main(String[] args)  {

        Producto p1 = new Producto(1,"Leche");

        try {
            p1.comprobarId();
        } catch (Exception e) {
            System.out.println("El id es menor igual que cero");
        }
        System.out.println("---Continua la programación");

    }
}
