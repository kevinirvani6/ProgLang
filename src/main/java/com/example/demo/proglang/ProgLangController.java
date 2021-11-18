package com.example.demo.proglang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class ProgLangController {

    private final ProgLangService progLangService;

    @Autowired
    public ProgLangController(ProgLangService progLangService) {
        this.progLangService = progLangService;
    }

    @GetMapping
    public List<ProgLang> getProgLangs(){
        return progLangService.getProgLangs();
    }

    @PostMapping
    public void createProgLang(@RequestBody ProgLang progLang){
        progLangService.createNewProgLang(progLang);
    }

}
