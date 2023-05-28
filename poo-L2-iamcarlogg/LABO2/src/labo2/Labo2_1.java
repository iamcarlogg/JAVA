
package labo2;

public class Labo2_1 {

    public static void main(String[] args) {
        
        // Your main code goes here
        Abuelo abuelo = new Abuelo("Guerra", "Salvadoreno");
        Hijo hijo = new Hijo(abuelo.getApellido(), abuelo.getNacionalidad());
        Nieto nieto = new Nieto(hijo.getApellido(), hijo.getNacionalidad());
        System.out.println(abuelo.toString());
        System.out.println(nieto.toString());
        System.out.println(nieto.toString());
        
    }
}
