
/**
 *
 * @author Carlo
 */

import java.util.Scanner;
public class POO_1303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       // double x = 5.78;
        //int y = 4;
        //String cadenaTextos = "Este es un texto en una cadena";
        //System.out.println("Esto imprime algo");
        //System.out.printf("Este es un entero %d \nEste es un real %.3f\n%s",y,x,cadenaTextos);
        String Nombre, Correo, Carrera, Txtedad;
        int edad;
        Scanner keyboard = new Scanner(System.in);
        //Next solo lee hasta el primer espacio
        //NextLine hasta enter
        System.out.println("Ingrese su nombre: ");
        Nombre =  keyboard.nextLine();
        System.out.println("Ingrese su edad: ");
        Txtedad = keyboard.nextLine();

        edad = Integer.parseInt(Txtedad);
        System.out.println("Ingrese su correo: ");
        Correo = keyboard.nextLine();
        System.out.println("Ingrese su carrera: ");
        Carrera = keyboard.nextLine();
        
    }
}
