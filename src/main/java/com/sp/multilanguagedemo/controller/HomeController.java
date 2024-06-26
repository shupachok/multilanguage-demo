package com.sp.multilanguagedemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "{language}/helloworld")
    public String home(HttpServletRequest request, @PathVariable String language, ModelMap model) {
        request.setAttribute("language", language);

        Locale locale = Locale.forLanguageTag(language);
        String welcomeMessage = messageSource.getMessage("welcome.message", null, locale);
        model.addAttribute("welcomeMessage", welcomeMessage);

        return "helloworld";
    }
}