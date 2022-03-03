package com.robbmalexander.songr.controller;

import com.robbmalexander.songr.model.Album;
import com.robbmalexander.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongrController {

    @Autowired
    AlbumRepository albumRepository;

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
        List<Album> albums = albumRepository.findAll();
        songrSplashModel.addAttribute("albums", albums);
        return "splash-page.html";
    }

    @ResponseBody
    @PostMapping("/addAlbum")
    public RedirectView addAlbum (String title, String artist, int songCount, int length, String imageUrl){
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/");
        //return "Successfully added album: " + title;
    }
/*
    @GetMapping("/editAlbum{title}")

    TODO:
    public String editAlbumView()
    songrSplashModel.addAttribute("album", editedAlbum)
    return "edit-album.html"
    */

}
