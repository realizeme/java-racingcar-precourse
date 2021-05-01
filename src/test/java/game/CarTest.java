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

    @Test
    @DisplayName("앞서 있는 차와 비교")
    public void 앞서_있는_차와_비교(){
        Car car1 = new Car("1번 자동차", 1);
        Car car2 = new Car("2번 자동차", 0);
        assertThat(car1.isFrontPosition(car2)).isTrue();
    }

    @Test
    @DisplayName("뒤에 있는 차와 비교")
    public void 뒤에_있는_차와_비교(){
        Car car1 = new Car("1번 자동차", 0);
        Car car2 = new Car("2번 자동차", 1);
        assertThat(car1.isBehindPosition(car2)).isTrue();
    }

    @Test
    @DisplayName("동일한 위치 차 비교")
    public void 동일한_위치_차_비교(){
        Car car1 = new Car("1번 자동차", 1);
        Car car2 = new Car("2번 자동차", 1);
        assertThat(car1.isSamePosition(car2)).isTrue();
    }
}
