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
        autor = new Autor("Nombre 1","Biografia 1");
        libros = new ArrayList<>();
        libros.add(new EjemplarLibro("Título 1","Etiqueta 1"));
        libros.add(new EjemplarLibro("Título 2","Etiqueta 2"));
        
    }

    @Test
    @DisplayName("Obtener nombre del autor")
    public void testGetNombre() {
    	assertEquals("Nombre 1",autor.getName());
    }
    
    @Test
    @DisplayName("Obtener biografía del autor")
    public void testGetBiografia() {
    	assertEquals("Biografia 1",autor.getBiography());
    }


}
