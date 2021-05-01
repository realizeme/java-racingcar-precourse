package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomNumber;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차_멈춤")
    public void 자동차_멈춤_확인(){
        Car car = new Car("1번 자동차", 0);
        assertThat(car.move(new RandomNumber(0))).isFalse();
        assertThat(car.move(new RandomNumber(3))).isFalse();
    }

    @Test
    @DisplayName("자동차_이동")
    public void 자동차_이동_확인(){
        Car car = new Car("1번 자동차", 0);
        assertThat(car.move(new RandomNumber(4))).isTrue();
        assertThat(car.move(new RandomNumber(9))).isTrue();
    }
}
