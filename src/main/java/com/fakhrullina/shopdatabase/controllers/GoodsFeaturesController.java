package com.fakhrullina.shopdatabase.controllers;

import com.fakhrullina.shopdatabase.entity.GoodsFeatures;
import com.fakhrullina.shopdatabase.interfaces.GoodsFeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsFeaturesController {

    @Autowired
    private GoodsFeaturesRepository goodsFeaturesRepository;

    @GetMapping("/GoodsFeat")
    public List<GoodsFeatures> retrieveAllGoodsFeatures() {
        return goodsFeaturesRepository.findAll();
    }

}
