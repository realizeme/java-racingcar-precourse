package game;

import java.util.ArrayList;

public class RacingGame {

    private int trialCount = 0;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public RacingGame(ArrayList<Car> cars ,int trialCount){
        this.cars = cars;
        this.trialCount = trialCount;
    }

    public int countCars() {
        return cars.size();
    }

    public void play(){
        trialCount--;
    }

    public boolean isOver(){
        if (trialCount == 0){
            return true;
        }
        return false;
    }
}
