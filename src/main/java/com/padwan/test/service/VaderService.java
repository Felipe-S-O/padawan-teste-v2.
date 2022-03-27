package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VaderService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("force push");
        skills.add("force pull");
        skills.add("force grip");
        skills.add("force choke");
        skills.add("master lightsaber");
        skills.add("master pilot");
        skills.add("telepathy");
        return skills;
    }

    public List<String> habilidades(){
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Java");
        habilidades.add("Javafx");
        habilidades.add("Jdbc");
        habilidades.add("Mysql");
        habilidades.add("Postgresql");
        habilidades.add("JPA");
        habilidades.add("Android Studio");
        return habilidades;
    }
}
