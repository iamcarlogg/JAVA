/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo2;

/**
 *
 * @author Carlo
 */
public class Nieto extends Hijo {

    public Nieto(String apellido, String nacionalidad) {
        super(apellido, nacionalidad);
    }
    @Override
    public String toString() {
        return "Hijo{" +"Apellido: "+ super.getApellido() + "\nNacionalidad: "+ super.getNacionalidad() +   '}';
    }
}
