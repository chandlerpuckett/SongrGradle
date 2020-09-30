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

//        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Album> albumsFromDB = (ArrayList<Album>) albumRepository.findAll();

//        albums.add(new Album(
//                "Meditations",
//                "John Coltrane",
//                "/images/meditations.jpg",
//                5,
//                40
//        ));
//        albums.add(new Album(
//                "Goes West",
//                "William Tyler",
//                "/images/west.jpg",
//                10,
//                37
//        ));
//        albums.add(new Album(
//                "Green Alum Springs",
//                "Daniel Bachman",
//                "/images/green.jpg",
//                9,
//                32
//        ));

        m.addAttribute("albumList",albumsFromDB);
        return "albums";
    }
}
