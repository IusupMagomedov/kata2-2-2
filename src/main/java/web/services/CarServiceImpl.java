package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

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
