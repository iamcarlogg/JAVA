

package LaboPO1;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlo Guerra 00052220
 */

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("", 0, "", 0);
        Libro libro2 = new Libro("", 0, "", 0);
        int menu, seleccion_libro;
        String titulo,autor;
        int isbn,num;
        boolean menu_continue = true;
        while(menu_continue)
        {
          menu = Integer.parseInt(JOptionPane.showInputDialog("1)editar\n2)ver\n3)salir"));
            switch (menu) {
                case 1:
                    seleccion_libro = Integer.parseInt("Ingrese el libro que desea editar 1 o 2");
                    switch (seleccion_libro) {
                        case 1:
                            titulo = JOptionPane.showInputDialog( "TItulo");
                            libro1.setTitulo(titulo);
                            autor = JOptionPane.showInputDialog("Autor");
                            libro1.setAutor(autor);
                            isbn = Integer.parseInt(JOptionPane.showInputDialog("Isbn"));
                            libro1.setISBN(isbn);
                            num = Integer.parseInt("Num paginas");
                            libro1.setNumPages(num);
                            break;
                        case 2:
                            titulo = JOptionPane.showInputDialog( "TItulo");
                            libro2.setTitulo(titulo);
                            autor = JOptionPane.showInputDialog("Autor");
                            libro2.setAutor(autor);
                            isbn = Integer.parseInt(JOptionPane.showInputDialog("Isbn"));
                            libro2.setISBN(isbn);
                            num = Integer.parseInt("Num paginas");
                            libro2.setNumPages(num);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        }
}
