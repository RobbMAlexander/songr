package com.robbmalexander.songr.controller;


import com.robbmalexander.songr.model.Album;
import com.robbmalexander.songr.model.Song;
import com.robbmalexander.songr.repository.AlbumRepository;
import com.robbmalexander.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @PostMapping("/addSong")
    public RedirectView addSong(long albumId, String title, int trackNumber, int length)
    {
        Album trackOnAlbum = albumRepository.getById(albumId);
        Song songToAdd = new Song(title, trackNumber, length);
        songToAdd.setTrackOnAlbum(trackOnAlbum);
        songRepository.save(songToAdd);

        return new RedirectView("/");
    }

    @GetMapping("/songs/{albumId}")
    public String viewSongs(@PathVariable long albumId, Model model)
    {
        Album album = albumRepository.getById(albumId);
        model.addAttribute("songs", album.getTrackList());

        return "/songs.html";
    }

}
