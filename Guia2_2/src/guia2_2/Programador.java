package guia2_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class Programador {
    private String nombre;
    private int id;
    private int edad;
    private String estadoCivil;
    private int salario;
    private int lineasDeCodigoPH;
    private String lenguajeDominado;

    public Programador(String nombre, int id, int edad, String estadoCivil, int salario, int lineasDeCodigoPH, String lenguajeDominado) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
        this.lineasDeCodigoPH = lineasDeCodigoPH;
        this.lenguajeDominado = lenguajeDominado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getSalario() {
        return salario;
    }

    public int getLineasDeCodigoPH() {
        return lineasDeCodigoPH;
    }

    public String getLenguajeDominado() {
        return lenguajeDominado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setLineasDeCodigoPH(int lineasDeCodigoPH) {
        this.lineasDeCodigoPH = lineasDeCodigoPH;
    }

    public void setLenguajeDominado(String lenguajeDominado) {
        this.lenguajeDominado = lenguajeDominado;
    }
    @Override
    public String toString() {
        return "Programador{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", salario=" + salario + ", lineasDeCodigoPH=" + lineasDeCodigoPH + ", lenguajeDominado=" + lenguajeDominado + '}';
    }
    
}
