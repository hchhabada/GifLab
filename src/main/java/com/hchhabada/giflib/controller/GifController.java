package com.hchhabada.giflib.controller;

import com.hchhabada.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif")
    public String getGifDetails(ModelMap modelMap) {
        Gif gif = new Gif("ben-and-mike",  LocalDate.of(2020,7,10),  "Harprit" , true );
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
