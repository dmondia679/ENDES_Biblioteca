package com.endes.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class AutorTest {

    private Autor autor;
    private List<Libro> libros;

    @BeforeEach
    void setUp() {
        autor = new Autor("Nombre Autor","Biografía Autor");
        libros = new ArrayList<>();
        libros.add(new EjemplarLibro("Título 1","Etiqueta 1"));
        libros.add(new EjemplarLibro("Título 2","Etiqueta 2"));
        
    }

    @Test
    @DisplayName("Obtener nombre del autor")
    public void testGetNombre() {
    	assertEquals("Manoolo",autor.getName());
    }
    
    @Test
    @DisplayName("Obtener biografía del autor")
    public void testGetBiografia() {
    	assertEquals("Escritor",autor.getBiography());
    }


}
