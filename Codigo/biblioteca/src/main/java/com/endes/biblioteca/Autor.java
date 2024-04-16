package com.endes.biblioteca;

import java.util.List;

/**
 * Representa a un autor de libros en un sistema de gestión de biblioteca.
 */
public class Autor {
    private String name;
    private String biography;

    /**
     * Constructor de la clase Autor.
     * @param name Nombre del autor.
     * @param biography Biografía del autor.
     */
    public Autor(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    /**
     * Obtiene el nombre del autor.
     * @return Nombre del autor.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del autor.
     * @param name Nombre del autor.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la biografía del autor.
     * @return Biografía del autor.
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Establece la biografía del autor.
     * @param biography Biografía del autor.
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    // Getters y setters para la lista de libros
}
