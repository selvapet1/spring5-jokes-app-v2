package com.example.spring5jokesappv2.controllers;

import com.example.spring5jokesappv2.services.ChuckNorrisQuoteService;
import com.example.spring5jokesappv2.services.ChuckNorrisQuoteServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ChuckNorrisQuoteController {
    private final ChuckNorrisQuoteService chuckNorrisQuoteService;

    public ChuckNorrisQuoteController(ChuckNorrisQuoteService chuckNorrisQuoteService) {
        this.chuckNorrisQuoteService = chuckNorrisQuoteService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke",chuckNorrisQuoteService.getQuote());
        return "index";
    }
}
