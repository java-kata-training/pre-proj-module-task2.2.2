package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Lamborghini", "Temerario", 2026));
        cars.add(new Car("Jaguar", "GT", 2026));
        cars.add(new Car("Aurus", "Senat S600", 2026));
        cars.add(new Car("Rolls-Royce", "Cullinan Black Badge", 2026));
        cars.add(new Car("Maextro", "S800", 2026));
    }

    public List<Car> getCars(int count) {
        // возвращает оригинальный список
        if (count >= 5) {
            return cars;
        }
        // создает новый список и возвращает первые 5 эл-ов
        // или больше если их станет больше
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
