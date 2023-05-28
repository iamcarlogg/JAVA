package guia2_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class Supervisor extends Programador {

    public Supervisor(String nombre, int id, int edad, String estadoCivil, int salario, int lineasDeCodigoPH, String lenguajeDominado) {
        super(nombre, id, edad, estadoCivil, salario, lineasDeCodigoPH, lenguajeDominado);

    /**
     *
     * @return
     */
    public void AumentarSalario()
    {
        int SalarioPro;
        SalarioPro = super.getSalario();
        SalarioPro += SalarioPro*.3;
        super.setSalario(SalarioPro);
    }
           


}
