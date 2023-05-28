/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoenum;

/**
 *
 * @author Carlo
 */
public enum Conocidos {
    chabelo("Javier Lopez","UCA",9);
    String nombre;
    String universidad;
    int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public int getEdad() {
        return edad;
    }

    private Conocidos(String nombre, String universidad, int edad) {
        this.nombre = nombre;
        this.universidad = universidad;
        this.edad = edad;
    }

    
}
