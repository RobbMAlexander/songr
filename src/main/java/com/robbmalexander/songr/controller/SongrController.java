package com.robbmalexander.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class SongrController {

    @ResponseBody
    @GetMapping("hello")
    public String greeting () {
        return "Hello World!";
    }

    @ResponseBody
    @GetMapping("capitalize/{text}")
    public String capitalize(@PathVariable String text) {
        return "" + text.toUpperCase();
    }

    @GetMapping ("albums")
    public String renderSplashPage (Model songrSplashModel) {
        //TODO: add attributes here as necessary
        // songrSplashmodel.addAttribute( , );
        return "splash-page.html";
    }

}
