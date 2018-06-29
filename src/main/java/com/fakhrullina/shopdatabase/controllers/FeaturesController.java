package com.fakhrullina.shopdatabase.controllers;

import com.fakhrullina.shopdatabase.entity.Features;
import com.fakhrullina.shopdatabase.interfaces.FeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeaturesController {

    @Autowired
    private FeaturesRepository featuresRepository;

    @GetMapping("/Features")
    public List<Features> retrieveAllFeatures () {
        return featuresRepository.findAll();
    }

}
