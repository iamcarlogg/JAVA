//Elabore una lista con todos sus conocidos con enum
package tipoenum;

/**
 *
 * @author Carlo
 */
public class TIpoenum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conocidos x = Conocidos.chabelo;
        System.out.println("nombre: " + x.nombre +" edad: " + x.edad + " universidad: " + x.universidad);
        for(Conocidos c: Conocidos.values())
        {
            System.out.printf("Nombre %s", x.nombre);
        }
    }
    
}
