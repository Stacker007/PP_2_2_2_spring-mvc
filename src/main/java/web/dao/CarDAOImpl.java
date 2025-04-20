package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Honda Accord", "green", 2010));
        cars.add(new Car("Mitsu Pajero", "silver", 1995));
        cars.add(new Car("Exceed m1", "red", 2025));
        cars.add(new Car("Opel Asra", "silver", 2014));
        cars.add(new Car("Citroen Xsara", "Blue", 1998));
    }

    public List<Car> index() {
        return cars;
    }
}
