package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "LandCarouser", 2012));
        cars.add(new Car("Toyota", "Highlander", 2011));
        cars.add(new Car("Toyota", "Camry", 2016));
        cars.add(new Car("BMW", "5", 2004));
        cars.add(new Car("Mercedes", "E", 2008));
        return cars;
    }
}
