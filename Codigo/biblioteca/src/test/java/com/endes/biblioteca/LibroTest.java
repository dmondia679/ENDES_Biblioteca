package com.endes.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
	
	
    @Test
    void testBookCreation() {
        Libro libro = new EjemplarLibro(null, null);
        assertNotNull(libro);
    }
    
    
}
