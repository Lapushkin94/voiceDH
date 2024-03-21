package com.group.interview.controllers;

import com.group.interview.domain.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FrontController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("phoneNumber", new PhoneNumber());
        return "page";
    }

    @PostMapping("/submit-phone")
    public String submitPhoneNumber(@ModelAttribute PhoneNumber phoneNumber, Model model) {
        //System.out.println("Submitted Phone Number: " + phoneNumber.getNumber());
        //model.addAttribute("phoneNumber", phoneNumber);
        return "result-page";
    }
}
