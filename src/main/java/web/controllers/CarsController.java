package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @GetMapping()
    public String printCars(
            @RequestParam(
                    value = "count",
                    required = false)
            Integer  count,
            ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "LandCarouser", 2012));
        cars.add(new Car("Toyota", "Highlander", 2011));
        cars.add(new Car("Toyota", "Camry", 2016));
        cars.add(new Car("BMW", "5", 2004));
        cars.add(new Car("Mercedes", "E", 2008));
        int showCount = count != null ? count : 5;
        model.addAttribute(
                "cars",
                cars
                        .stream()
                        .limit(showCount)
                        .map(Car::toString)
                        .toList());
        return "cars";
    }

}