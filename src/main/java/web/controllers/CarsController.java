package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @GetMapping()
    public String index(
            @RequestParam(
                    value = "count",
                    required = false)
            Integer  count,
            ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.get(count));
        return "cars";
    }
}