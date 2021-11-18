package com.example.demo.proglang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgLangService {

    private final ProgLangRepository progLangRepository;

    @Autowired
    public ProgLangService(ProgLangRepository progLangRepository) {
        this.progLangRepository = progLangRepository;
    }

    public List<ProgLang> getProgLangs() {
        return progLangRepository.findAll();
    }

    public void createNewProgLang(ProgLang progLang){
        Optional<ProgLang> progLangOptional = progLangRepository.findProgLangByLangName(progLang.getLangName());
        if (progLangOptional.isPresent()){
            throw new IllegalStateException("Programming name already exists in database.");
        }
        progLangRepository.save(progLang);
    }

}
