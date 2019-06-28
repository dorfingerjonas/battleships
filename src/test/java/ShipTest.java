import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ShipTest {

    @Test
    public void createHorizontalShip() {
        Ship ship = new Ship('A', '2', 5, true);

        String expected = "A2 B2 C2 D2 E2 ";

        assertThat(ship.toString(), is(expected));
    }

    @Test
    public void createVerticalShip() {
        Ship ship = new Ship('C', '4', 3, false);

        String expected = "C4 C5 C6 ";

        assertThat(ship.toString(), is(expected));
    }

}