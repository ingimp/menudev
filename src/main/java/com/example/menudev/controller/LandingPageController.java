package com.example.menudev.controller;

import com.example.menudev.service.LandingPageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller MVC responsabile della pagina pubblica principale (landing page).
 *
 * <p>Ruolo del controller in MVC:
 * <ul>
 *     <li>Ricevere richieste HTTP</li>
 *     <li>Delegare la costruzione dati al Service layer</li>
 *     <li>Popolare il Model con attributi necessari alla view</li>
 *     <li>Restituire il nome logico del template Thymeleaf</li>
 * </ul>
 */
@Controller
public class LandingPageController {

    private final LandingPageService landingPageService;

    public LandingPageController(LandingPageService landingPageService) {
        this.landingPageService = landingPageService;
    }

    /**
     * Endpoint pubblico GET "/".
     *
     * <p>Popoliamo il model con tutti i dati necessari alla vista "landing".
     * Il valore di ritorno "landing" corrisponde a src/main/resources/templates/landing.html.
     */
    @GetMapping("/")
    public String showLandingPage(Model model) {
        model.addAttribute("appTitle", landingPageService.getApplicationTitle());
        model.addAttribute("appDescription", landingPageService.getApplicationDescription());
        model.addAttribute("features", landingPageService.getFeatures());
        model.addAttribute("ctaLabel", landingPageService.getCallToActionLabel());
        return "landing";
    }
}
