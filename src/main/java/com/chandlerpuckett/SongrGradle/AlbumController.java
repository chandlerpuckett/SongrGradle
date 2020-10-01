package com.chandlerpuckett.SongrGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @Autowired
    public AlbumRepository albumRepository;

    @PostMapping("/albums")
    public RedirectView addAlbum(
            String title,
            String artist,
            String imageUrl,
            int songCount,
            int length){
        Album newAlbum = new Album(title, artist, imageUrl,songCount,length);

        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String showAlbums (Model m) {

        ArrayList<Album> albumsFromDB = (ArrayList<Album>) albumRepository.findAll();

        m.addAttribute("albumList",albumsFromDB);
        return "albums";
    }
}
