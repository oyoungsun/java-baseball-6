package baseball.controller;

import baseball.model.Ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountControllerTests {

    private CountController countController = new CountController();
    @Test
    @DisplayName("strike 테스트")
    void count_strike() throws Exception {
        List<Ball> user = new ArrayList<>();
        user.add(new Ball(1,0));
        user.add(new Ball(2,1));
        user.add(new Ball(3,2));

        List<Ball> com = new ArrayList<>();
        com.add(new Ball(1,0));
        com.add(new Ball(2,1));
        com.add(new Ball(3,2));

        countController.count_ball(com, user);
        assertThat(countController.getStrike()).isEqualTo(3);
        assertThat(countController.getBall()).isEqualTo(0);
    }
    @Test
    @DisplayName("nothing 테스트")
    void count_nothing() throws Exception {
        List<Ball> user = new ArrayList<>();
        user.add(new Ball(4,0));
        user.add(new Ball(5,1));
        user.add(new Ball(6,2));

        List<Ball> com = new ArrayList<>();
        com.add(new Ball(1,0));
        com.add(new Ball(2,1));
        com.add(new Ball(3,2));

        countController.count_ball(com, user);
        assertThat(countController.getStrike()).isEqualTo(0);
        assertThat(countController.getBall()).isEqualTo(0);
    }
    @Test
    @DisplayName("ball 테스트")
    void count_ball() throws Exception {
        List<Ball> user = new ArrayList<>();
        user.add(new Ball(3,0));
        user.add(new Ball(4,1));
        user.add(new Ball(1,2));

        List<Ball> com = new ArrayList<>();
        com.add(new Ball(1,0));
        com.add(new Ball(2,1));
        com.add(new Ball(3,2));

        countController.count_ball(com, user);
        assertThat(countController.getStrike()).isEqualTo(0);
        assertThat(countController.getBall()).isEqualTo(2);
    }

    //TODO : add @ParameterizedTest
    @Test
    @DisplayName("1strike 2ball 테스트")
    void count_ballAndStrike() throws Exception {
        List<Ball> user = new ArrayList<>();
        user.add(new Ball(3,0));
        user.add(new Ball(2,1));
        user.add(new Ball(1,2));

        List<Ball> com = new ArrayList<>();
        com.add(new Ball(1,0));
        com.add(new Ball(2,1));
        com.add(new Ball(3,2));

        countController.count_ball(com, user);
        assertThat(countController.getStrike()).isEqualTo(1);
        assertThat(countController.getBall()).isEqualTo(2);
    }
}