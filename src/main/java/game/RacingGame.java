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

    public void play(){
        cars.race();
        trialCount--;
    }

    public boolean isOver(){
        if (trialCount <= 0){
            return true;
        }
        return false;
    }

    public void printAllCars(){
        for (Car car: cars.getCars()) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void displayWinners(){
        StringBuilder builder = new StringBuilder();
        for (Car car: cars.winner()) {
            builder.append(car.getName());
        }

        System.out.println(String.join(",",builder.toString())+"가 최종 우승했습니다.");

    }
}
