package com.example.menudev.service;

import com.example.menudev.model.Feature;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer dedicato ai contenuti della landing page.
 *
 * <p>Perché un service anche se i dati sono statici?
 * <ul>
 *     <li>Separazione delle responsabilità: il controller gestisce HTTP, il service prepara dati.</li>
 *     <li>Testabilità: possiamo testare la logica di composizione contenuti senza web context.</li>
 *     <li>Evolvibilità: domani i dati potrebbero arrivare da API o file senza toccare il controller.</li>
 * </ul>
 */
@Service
public class LandingPageService {

    /**
     * Restituisce il titolo principale da mostrare nell'hero della pagina.
     */
    public String getApplicationTitle() {
        return "MenuDev Platform";
    }

    /**
     * Restituisce una descrizione breve e orientata al valore per l'utente finale.
     */
    public String getApplicationDescription() {
        return "Una piattaforma Spring Boot MVC di esempio, progettata per essere chiara, estendibile e pronta per la produzione.";
    }

    /**
     * Fornisce le feature mostrate nella landing page.
     *
     * <p>In assenza di database usiamo dati in-memory hardcoded, sufficienti per una pagina pubblica
     * dimostrativa.
     */
    public List<Feature> getFeatures() {
        return List.of(
                new Feature("Architettura MVC Pulita", "Controller, Service e template separati per mantenere il codice ordinato."),
                new Feature("Rendering Server-Side con Thymeleaf", "Pagine HTML dinamiche, SEO-friendly e facili da mantenere."),
                new Feature("Pronta per il Testing", "Test unitari e test MVC inclusi per validare comportamento e regressioni.")
        );
    }

    /**
     * Testo della call-to-action; separato per evitare stringhe hardcoded nella view.
     */
    public String getCallToActionLabel() {
        return "Scopri di più";
    }
}
