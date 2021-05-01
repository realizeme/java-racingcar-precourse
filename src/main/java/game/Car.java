package game;

import util.RandomNumber;

public class Car {
    public static int MOVING_INDCATTOR = 4;

    private String name;
    private int position;

    public Car(String name, int position){
        this.name = name;
        this.position = position;
    }

    public boolean move(RandomNumber randomNumber) {
        if(randomNumber.isGreaterEqualThan(MOVING_INDCATTOR)){
            forward();
            return true;
        }
        return false;
    }

    public void forward() {
        position++;
    }

}
