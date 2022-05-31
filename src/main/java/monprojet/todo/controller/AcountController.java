package monprojet.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Utilisateur;

@Controller

public class AcountController {

    @GetMapping("/subscribe")
    public String formDisplay(Model model) {
        model.addAttribute("utilise", new Utilisateur());
        return "account/form";
    }

    @PostMapping("/connecter")
    public String infoDisplay(Model model, @Validated @ModelAttribute(name = "utilise") Utilisateur utilise,
            BindingResult br) {
        if (br.hasErrors()) {
            return "account/form";
        }
        model.addAttribute("utilise", utilise);
        return "account/info";
    }
}
