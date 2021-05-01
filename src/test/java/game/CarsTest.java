package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomNumber;

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

        assertThat(cars.winner()).contains(pobi);
        assertThat(cars.winner()).doesNotContain(crong,honux);
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
        cars.race();

        assertThat(cars.winner()).contains(pobi, crong);
        assertThat(cars.winner()).doesNotContain(honux);
    }
}
