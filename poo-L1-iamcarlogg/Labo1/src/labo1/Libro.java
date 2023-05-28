/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo1;

/**
 *
 * @author Carlo
 */
public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private int num_paginas;

    public Libro(String titulo, String autor, int isbn, int num_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.num_paginas = num_paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
    public String toString() {
        return "Libro: " + getTitulo() + "del autor " + getAutor() + "con isbn: " + getIsbn() + "y " + getNum_paginas() + "paginas.\n";
        
        
    }
    
    
}
