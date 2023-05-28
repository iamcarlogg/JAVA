package Mascotas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class MascotaPadre {
    private int at1;
    protected int at2;
    public int at3;

    public MascotaPadre(int at1, int at2, int at3) {
        this.at1 = at1;
        this.at2 = at2;
        this.at3 = at3;
    }

    public int getAt1() {
        return at1;
    }

    public int getAt2() {
        return at2;
    }

    public int getAt3() {
        return at3;
    }

    public void setAt1(int at1) {
        this.at1 = at1;
    }

    public void setAt2(int at2) {
        this.at2 = at2;
    }

    public void setAt3(int at3) {
        this.at3 = at3;
    }
    public String mostrar() {
        return "MascotaPadre{" + "at1=" + at1 + ", at2=" + at2 + ", at3=" + at3 + '}';
    }
    
}
