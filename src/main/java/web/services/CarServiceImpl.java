package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> get(Integer count) {
        List<Car> cars = carDao.findAll();
        int showCount = count != null ? count : 5;
        return cars.stream().limit(showCount).toList();
    }
}
