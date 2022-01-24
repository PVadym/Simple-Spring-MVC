package ua.avadamedia.forostina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.avadamedia.forostina.form.CreditCardForm;

import javax.validation.Valid;

@Controller
public class CreditCardController {

    @GetMapping("/creditCardList")
    public String showCardList() {
        return "creditCardList";
    }

    @GetMapping("/addCreditCard")
    public String showAddCardForm(CreditCardForm creditCardForm) {
        return "addCreditCard";
    }

    @PostMapping("/addCreditCard")
    public String checkCreditCardInfo(@Valid CreditCardForm creditCardForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addCreditCard";
        }

        return "redirect:/creditCardList";
    }
}
