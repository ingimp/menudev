package com.example.menudev.service;

import com.example.menudev.model.Feature;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test unitari del service.
 *
 * <p>Qui non usiamo Spring context: istanziamo direttamente la classe per avere test veloci,
 * stabili e focalizzati sulla logica pura.
 */
class LandingPageServiceTest {

    private final LandingPageService service = new LandingPageService();

    @Test
    void shouldReturnExpectedTitleAndDescription() {
        // Verifichiamo che i contenuti base della hero section siano valorizzati.
        assertThat(service.getApplicationTitle()).isEqualTo("MenuDev Platform");
        assertThat(service.getApplicationDescription()).contains("Spring Boot MVC");
    }

    @Test
    void shouldProvideNonEmptyFeaturesList() {
        // La landing deve mostrare un set di feature; controlliamo cardinalità e contenuto minimo.
        List<Feature> features = service.getFeatures();

        assertThat(features)
                .hasSize(3)
                .allSatisfy(feature -> {
                    assertThat(feature.getTitle()).isNotBlank();
                    assertThat(feature.getDescription()).isNotBlank();
                });
    }

    @Test
    void shouldReturnCtaLabel() {
        // CTA testuale separata per evitare stringhe hardcoded sparse nelle viste.
        assertThat(service.getCallToActionLabel()).isEqualTo("Scopri di più");
    }
}
