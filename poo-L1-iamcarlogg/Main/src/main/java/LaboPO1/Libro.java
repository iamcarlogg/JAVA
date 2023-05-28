
package LaboPO1;

/**
 *
 * @author Carlo
 */
public class Libro {
    //creando atributos de la clase libro
    private String titulo;
    private int ISBN;
    private String autor;
    private int numPages;
    //haciendo constructor
    public Libro(String titulo, int ISBN, String autor, int numPages) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numPages = numPages;
    }
    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPages() {
        return numPages;
    }
    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    //creando toString

    @Override
    public String toString() {
        return"El libro con ISBN: " + ISBN + "tiene " + numPages + "\n";
    }
    
    
    
}
