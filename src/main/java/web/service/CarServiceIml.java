package web.service;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIml implements CarService {

    private final CarDao carDoa;

//    mentor's review issue
//    2. @Autowired - сейчас реализуем без использования аннотации,
//    а используя конструкцию private final для инжекта класса/интерфейса
    public CarServiceIml(CarDao carDoa) {
        this.carDoa = carDoa;
    }

    @Override
    public List<Car> getAllCars() {
        return carDoa.getAllCars();
    }

    // mentor's review issue
    // Логика  “больше 5, значит все” не должна находиться в дао.
    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= 5) {
            return carDoa.getAllCars();
        }
        return carDoa.getCarsByCount(count);
    }
}
