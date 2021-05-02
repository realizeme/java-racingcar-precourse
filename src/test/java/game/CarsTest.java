package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomNumber;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("단독_우승")
    public void 단독_우승(){
        Cars cars = new Cars();
        Car pobi = new Car("pobi", 1);
        Car crong = new Car("crong", 0);
        Car honux = new Car("honux", 0);

        cars.add(pobi);
        cars.add(crong);
        cars.add(honux);
        cars.race();
        Winners winners = cars.winner();

        assertThat(winners.getWinnerNames()).contains(pobi.getName());
    }

    @Test
    @DisplayName("공동_우승")
    public void 공동_우승(){
        Cars cars = new Cars();
        Car pobi = new Car("pobi", 1);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 0);

        cars.add(pobi);
        cars.add(crong);
        cars.add(honux);
        Winners winners= cars.winner();

        assertThat(winners.getWinnerNames()).contains(pobi.getName(), crong.getName());
    }


    @Test
    @DisplayName("모든 차량")
    public void 모든_차량(){
        Cars cars = new Cars();
        cars.add(new Car("pobi",1));
        cars.add(new Car("crong", 1));
        cars.add(new Car("honux",1));

        Winners winners = cars.winner();

        assertThat(winners.size()).isEqualTo(3);
    }


}
