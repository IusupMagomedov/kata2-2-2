package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {
    CarService carService = new CarServiceImpl();

//    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "count", required = false)
                          Integer count, ModelMap model) {
        model.addAttribute("cars", carService.get(count));
        return "cars";
    }
}