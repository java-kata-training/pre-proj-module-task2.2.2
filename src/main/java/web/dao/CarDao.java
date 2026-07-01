package web.dao;

import web.model.Car;

import java.util.List;


public interface CarDao {

    /**
     * return all cars
    */
    List<Car> getAllCars();

    /**
     *
     * @param count cars to from storage (if count >= count of list then return all)
     */
    List<Car> getCarsByCount(int count);
}
