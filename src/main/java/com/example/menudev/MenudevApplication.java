package com.example.menudev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point dell'applicazione Spring Boot.
 *
 * <p>Annotiamo la classe con {@link SpringBootApplication} perché è una scorciatoia che include:
 * <ul>
 *     <li>@Configuration: abilita la definizione di bean Java-based</li>
 *     <li>@EnableAutoConfiguration: lascia a Spring Boot la configurazione automatica</li>
 *     <li>@ComponentScan: cerca componenti (Controller, Service...) nel package corrente e figli</li>
 * </ul>
 *
 * <p>Tenere questa classe nel package radice (com.example.menudev) è una best practice MVC,
 * così la component scan intercetta automaticamente tutta la struttura applicativa.
 */
@SpringBootApplication
public class MenudevApplication {

    /**
     * Metodo main standard Java che delega a Spring l'avvio del contesto applicativo.
     *
     * @param args eventuali argomenti passati da command line
     */
    public static void main(String[] args) {
        SpringApplication.run(MenudevApplication.class, args);
    }
}
