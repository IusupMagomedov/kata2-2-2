package web.services;

import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> get(Integer count) {
        List<Car> cars = get();
        int showCount = count != null ? count : 5;
        return cars
                .stream()
                .limit(showCount)
                .toList();
    }

    @Override
    public List<Car> get() {
        CarDao carDao = new CarDaoImpl();
        return carDao.findAll();
    }
}
