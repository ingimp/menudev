package com.example.menudev.controller;

import com.example.menudev.model.Feature;
import com.example.menudev.service.LandingPageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test MVC del controller landing page.
 *
 * <p>@WebMvcTest avvia solo i componenti web necessari (controller, resolver, ecc.)
 * senza bootstrap completo dell'applicazione. Questo rende i test rapidi e mirati.
 */
@WebMvcTest(LandingPageController.class)
class LandingPageControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Mockiamo il service perché in un test del layer web vogliamo verificare comportamento
     * del controller, non la logica interna del service.
     */
    @MockBean
    private LandingPageService landingPageService;

    @Test
    void shouldReturnLandingViewForRootEndpoint() throws Exception {
        // Arrange: definiamo i dati restituiti dal service mockato.
        given(landingPageService.getApplicationTitle()).willReturn("MenuDev Platform");
        given(landingPageService.getApplicationDescription()).willReturn("Descrizione demo");
        given(landingPageService.getCallToActionLabel()).willReturn("Scopri di più");
        given(landingPageService.getFeatures()).willReturn(List.of(
                new Feature("Feature A", "Descrizione A")
        ));

        // Act + Assert: endpoint "/" deve rispondere 200, view "landing" e model corretto.
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("landing"))
                .andExpect(model().attributeExists("appTitle"))
                .andExpect(model().attributeExists("appDescription"))
                .andExpect(model().attributeExists("features"))
                .andExpect(model().attributeExists("ctaLabel"));
    }
}
