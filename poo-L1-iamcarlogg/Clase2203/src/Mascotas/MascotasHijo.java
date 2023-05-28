package Mascotas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class MascotasHijo extends MascotaPadre{
    private int at4;

    public MascotasHijo(int at1, int at2, int at3,int at4) {
        super(at1, at2, at3);
        this.at4 = at4;
    }

    public void setAt4(int at4) {
        this.at4 = at4;
    }

    public int getAt4() {
        return at4;
    }
    public String Mostrar(){
       return super.mostrar() + "at4: " + getAt4(); 
    }
    
}
