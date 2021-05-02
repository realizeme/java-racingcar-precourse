package game;

public class RacingResult {
    private String name;
    private int position;

    public RacingResult(String name, int position){
        this.name = name;
        this.position = position;
    }

    public static RacingResult of(Car car) {
        return new RacingResult(car.getName(), car.getPosition());
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, position);
    }
}
