package com.example.citylist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.citylist.service.CityService;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String showCities(Model model) {
        model.addAttribute("cities", cityService.getAllCities());
        return "citylist"; // citylist.jsp
    }
}
