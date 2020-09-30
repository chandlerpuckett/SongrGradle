package com.chandlerpuckett.SongrGradle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String showAlbums (Model m) {

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(
                "Meditations",
                "John Coltrane",
                "/images/meditations.jpg",
                5,
                40
        ));
        albums.add(new Album(
                "Goes West",
                "William Tyler",
                "/images/west.jpg",
                10,
                37
        ));
        albums.add(new Album(
                "Green Alum Springs",
                "Daniel Bachman",
                "/images/green.jpg",
                9,
                32
        ));

        m.addAttribute("albumList",albums);
        return "albums";
    }
}
