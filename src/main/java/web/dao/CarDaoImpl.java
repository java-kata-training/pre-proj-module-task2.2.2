package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Lamborghini", "Temerario", 2026));
        cars.add(new Car("Jaguar", "GT", 2026));
        cars.add(new Car("Aurus", "Senat S600", 2026));
        cars.add(new Car("Rolls-Royce", "Cullinan Black Badge", 2026));
        cars.add(new Car("Maextro", "S800", 2026));
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
