package com.fakhrullina.shopdatabase.controllers;

import com.fakhrullina.shopdatabase.entity.Goods;
import com.fakhrullina.shopdatabase.interfaces.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/Goods")
    public List<Goods> retrieveAllGoods() {
        return goodsRepository.findAll();
    }

}