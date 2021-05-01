package game;

import util.RandomNumber;

import java.util.ArrayList;
import java.util.Collections;

public class Cars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public ArrayList< Car > winner() {
        return getSamePosition(max());
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

    public void race() {
        for(int i=0; i < cars.size(); i++){
            Car car = cars.get(i);
            car.move(new RandomNumber(0));
            printCar(car);
        }
    }

    private void printCar(Car car){
        System.out.println(car);
    }
}
