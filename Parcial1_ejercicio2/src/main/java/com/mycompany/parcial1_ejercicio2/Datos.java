/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1_ejercicio2;

/**
 *
 * @author Carlo
 */
public class Datos {
    private static double HorasNormales;
    private static double HorasExtras;

    public Datos() {
   
    }

    public static double getHorasNormales() {
        return HorasNormales;
    }

    public static double getHorasExtras() {
        return HorasExtras;
    }

    public static void setHorasNormales(double HorasNormales) {
        Datos.HorasNormales = HorasNormales;
    }

    public static void setHorasExtras(double HorasExtras) {
        Datos.HorasExtras = HorasExtras;
    }
    
}
