import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<ShipPart> parts = new ArrayList<>();

    public Ship(char startX, char startY,int length, boolean horizontal) {
        char x = startX;
        char y = startY;

        for (int i = 0; i < length;i++) {
            parts.add(new ShipPart(x, y));

            if (horizontal) {
                x++;
            } else {
                y++;
            }
        }
    }

    public boolean isHit(char x, char y) {

        for (ShipPart part : parts) {
            if (part.getX() == x && part.getY() == y) {
                if (!part.isShot()) {
                    part.setShot(true);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {

        String output = "";

        for (ShipPart part : parts) {
            output += String.format("%c%c ", part.getX(), part.getY());
        }

        return output;
    }
}