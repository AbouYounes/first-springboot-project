package de.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceImplTest {

    @Test
    void sayHello_shouldReturnHelloMessage() {
        // Arrange: Test vorbereiten
        HelloService helloService = new HelloServiceImpl();

        // Act: Methode ausführen
        String result = helloService.sayHello();

        // Assert: Ergebnis überprüfen
        assertEquals("Hello Spring Boot!", result);
    }
}
