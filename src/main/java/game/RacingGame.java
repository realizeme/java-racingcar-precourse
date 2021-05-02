package game;

import java.util.List;

public class RacingGame {

    private int trialCount = 0;
    private Cars cars = new Cars();

    public RacingGame(List<String> carNames , int trialCount){
        this.initialize(carNames);
        this.trialCount = trialCount;
    }

    public void initialize(List<String> carNames){
        for (int i =0; i < carNames.size(); i++) {
            cars.add(new Car(carNames.get(i)));
        }
    }

    public List<RacingResult> play(){
        trialCount--;
        return cars.race();
    }

    public boolean isOver(){
        if (trialCount <= 0){
            return true;
        }
        return false;
    }

    public Winners winners(){
        return cars.winner();
    }


}
