import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GameTest {

    @Test
    public void shoot_success() {

        Game game = new Game();

        game.addShip('A', '2', 5, true, 'B');

        boolean shoot = game.shoot('C', '2', 'A');

        assertThat(shoot, is(true));
    }
}