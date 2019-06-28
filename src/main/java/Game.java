import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Ship> shipsA = new ArrayList<>();
    List<Ship> shipsB = new ArrayList<>();

    public void addShip(char startX, char startY,int length, boolean horizontal, char player) {
        if (player == 'A') {
            shipsA.add(new Ship(startX, startY, length, horizontal));
        } else if (player == 'B') {
            shipsB.add(new Ship(startX, startY, length, horizontal));
        }
    }

    public boolean shoot (char x, char y, char shooter) {
        if (shooter == 'A') {
            for (Ship ship : shipsB) {
                boolean isHit = ship.isHit(x, y);
                System.out.println("Treffer: " + isHit);
                return true;
            }
        } else if (shooter == 'B') {
            for (Ship ship : shipsA) {
                boolean isHit = ship.isHit(x, y);
                System.out.println("Treffer: " + isHit);
                return true;
            }
        }
        return false;
    }
}