package web.services;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> get(Integer count) {
        List<Car> cars = get();
        int showCount = count != null ? count : 5;
        return cars.stream().limit(showCount).toList();
    }

    @Override
    public List<Car> get() {
        CarDao carDao = new CarDaoImpl();
        return carDao.findAll();
    }
}
