package game;

import util.RandomNumber;

public class Car implements Comparable<Car>{
    public static int MOVING_INDICATOR = 4;

    private String name;
    private int position;

    public Car(String name, int position){
        this.name = name;
        this.position = position;
    }

    public Car(String name){
        this(name, 0);
    }

    public boolean move(RandomNumber randomNumber) {
        if(randomNumber.isGreaterEqualThan(MOVING_INDICATOR)){
            forward();
            return true;
        }
        return false;
    }

    public void forward() {
        position++;
    }

    public int getPosition(){
        return position;
    }

    public boolean isBehindPosition(Car car){
        return this.position < car.getPosition();
    }

    public boolean isFrontPosition(Car car){
        return this.position > car.getPosition();
    }

    public boolean isSamePosition(Car car) {
        return position == car.getPosition();
    }

    @Override
    public int compareTo(Car s) {
        if (isBehindPosition(s)) {
            return -1;
        }
        if (isFrontPosition(s)) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, position);
    }
}
