package game;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int trialCount = 0;
    private Cars cars = new Cars();

    public RacingGame(List<String> carNames , int trialCount){
        this.trialCount = trialCount;
        this.initialize(carNames);
    }

    public void initialize(List<String> carNames){
        for (int i =0; i < carNames.size(); i++) {
            cars.add(new Car(carNames.get(i)));
        }
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
