package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    @DisplayName("차량_승리자_형변환")
    public void 차량_승리자_형변환() {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("pobi", 1));
        cars.add(new Car("crong", 1));

        Winners winners = new Winners(cars);
        List<String> names = winners.getWinnerNames();

        assertThat(names).contains("pobi","crong");
    }
}
