package com.example.menudev.model;

/**
 * Modello semplice (POJO) usato dalla landing page per rappresentare una feature.
 *
 * <p>In un'app stateless senza database non serve una entity JPA. Questo modello è volutamente
 * minimale e immutable-like: campi final valorizzati da costruttore e soli getter.
 *
 * <p>Scelta architetturale: mantenere un oggetto dedicato evita di passare mappe anonime
 * alla view, aumentando leggibilità e type safety.
 */
public class Feature {

    private final String title;
    private final String description;

    public Feature(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
