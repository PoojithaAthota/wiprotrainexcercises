package com.wipro.springmvc1;


import com.wipro.springmvc1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car/list")
    public String showCarList(Model model) {
        List<String> cars = carService.getAllCars();
        model.addAttribute("carList", cars);
        return "carlist"; // carlist.jsp
    }
}

