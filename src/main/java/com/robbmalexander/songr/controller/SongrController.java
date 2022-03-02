package com.robbmalexander.songr.controller;

import com.robbmalexander.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongrController {

    @Autowired
    SongrRepository songrRepository;

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
        //songrSplashmodel.addAttribute("albums", albums);
        return "splash-page.html";
    }

/*    @ResponseBody
    @PostMapping("/addAlbum")
    public RedirectView addAlbum (String addedAlbumTitle, String addedAlbumArtist){
        Album album = new Album(addedAlbumTitle, )
                //TODO: write redirect for POST
        return "Successfully added album: " + addedAlbumTitle;
    }

    @GetMapping("/")
    public String get */

}
