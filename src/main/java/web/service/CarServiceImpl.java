package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> allCars = carDAO.index();

        if (count <= 0) {
            return List.of();
        }

        return allCars.stream().limit(Math.min(count, allCars.size())).toList();
    }
}