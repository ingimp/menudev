package com.example.menudev.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configurazione MVC minimale.
 *
 * <p>In questo caso l'app è semplice e non richiede customizzazioni pesanti. Manteniamo però
 * una classe dedicata nel package config per mostrare dove inserire future evoluzioni
 * (interceptor, formatter, CORS policies, ecc.).
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Metodo lasciato intenzionalmente minimale per mostrare un punto di estensione dell'MVC.
     *
     * <p>Non registriamo route aggiuntive qui perché la landing page è gestita esplicitamente
     * dal suo controller dedicato, scelta più leggibile in ottica didattica.
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Nessun view controller statico: preferiamo un controller reale per separare ruoli e testabilità.
    }
}
