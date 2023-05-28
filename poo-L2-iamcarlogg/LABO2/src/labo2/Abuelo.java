package labo2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class Abuelo {
    private String apellido;
    private String nacionalidad;

    public Abuelo(String apellido, String nacionalidad) {
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Abuelo{" + "apellido=" + apellido + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
