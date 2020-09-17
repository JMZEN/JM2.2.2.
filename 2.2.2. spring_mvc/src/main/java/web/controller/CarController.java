package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/table")
    public String carTable(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "BMW", "X5"));
        cars.add(new Car(2L, "Renault", "Logan"));
        cars.add(new Car(3L, "Audi", "A5"));
        model.addAttribute("cars", cars);
        return "cars-table";
    }
}
