/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1_ejercicio2;

/**
 *
 * @author Carlo
 */
public class Resultados {
    private static double salarioTotal;
    private static double descuentoISSS;
    private static double descuentoRenta;
    private static double descuentoAFP;
    private static double salarioLiquido;

    public Resultados() {
        
    }

    public static double getSalarioTotal() {
        return salarioTotal;
    }

    public static void setSalarioTotal(double salarioTotal) {
        Resultados.salarioTotal = salarioTotal;
    }

    public static double getDescuentoISSS() {
        return descuentoISSS;
    }

    public static void setDescuentoISSS(double descuentoISSS) {
        Resultados.descuentoISSS = descuentoISSS;
    }

    public static double getDescuentoRenta() {
        return descuentoRenta;
    }

    public static void setDescuentoRenta(double descuentoRenta) {
        Resultados.descuentoRenta = descuentoRenta;
    }

    public static double getDescuentoAFP() {
        return descuentoAFP;
    }

    public static void setDescuentoAFP(double descuentoAFP) {
        Resultados.descuentoAFP = descuentoAFP;
    }

    public static double getSalarioLiquido() {
        return salarioLiquido;
    }

    public static void setSalarioLiquido(double salarioLiquido) {
        Resultados.salarioLiquido = salarioLiquido;
    }
    public static double ObtenerSalarioTotal(double h1, double h2)
    {
        double horaNormal = 15;
        double horaExtra = 20;
        return(horaNormal*h1 + horaExtra*h2);
    
    }
    public static double OdescuentoISSS(double St){
        return(St*0.03);
    }
    public static double OdescuentoAFP(double St)
    {
        return(St*0.0725);
    }
    public static double OdescuentoRenta(double St)
    {
        return(St*0.1);
    }
    }

