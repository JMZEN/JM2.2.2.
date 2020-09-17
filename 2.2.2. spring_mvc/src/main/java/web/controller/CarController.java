package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private List<Car> cars;

    @PostConstruct
    private void localData() {
        cars = new ArrayList<>();

        Car car1 = new Car(1L, "BMW", "X5");
        Car car2 = new Car(2L, "Renault", "Logan");
        Car car3 = new Car(3L, "Audi", "A5");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    @GetMapping("/table")
    public String carTable(Model model) {
        model.addAttribute("cars", cars);
        return "cars-table";
    }
}
