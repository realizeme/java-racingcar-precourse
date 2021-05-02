package game;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private List<String> winnerNames = new ArrayList<>();

    public Winners(ArrayList< Car> cars){
        for(Car car: cars){
            winnerNames.add(car.getName());
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(String name: winnerNames){
            builder.append(name);
        }
        return String.join(", ", builder.toString());
    }

    public int size() {
        return winnerNames.size();
    }

    public List<String> getWinnerNames(){
        return this.winnerNames;
    }
}
