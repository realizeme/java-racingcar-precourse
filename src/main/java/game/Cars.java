package game;

import util.RandomNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public Winners winner() {
        return new Winners(getSamePosition(max()));
    }

    private ArrayList< Car > getSamePosition(Car maxPosCar) {
        ArrayList< Car > winnerCars = new ArrayList<>();
        for(int i=0; i < cars.size(); i++){
            includeIfSamePosition(maxPosCar, cars.get(i), winnerCars);
        }
        return winnerCars;
    }

    private void includeIfSamePosition(Car maxPosCar, Car car, ArrayList< Car > winnerCars) {
        if (maxPosCar.isSamePosition(car)) {
            winnerCars.add(car);
        }
    }

    private Car max(){
        return Collections.max(cars);
    }

    public List<RacingResult> race() {
        for(int i=0; i < cars.size(); i++){
            Car car = cars.get(i);
            car.move(RandomNumber.random());
        }
        return convert();
    }

    private List<RacingResult> convert(){
        List<RacingResult> result = new ArrayList<>();
        for (Car car: cars){
            result.add(RacingResult.of(car));
        }
        return result;
    }
}
