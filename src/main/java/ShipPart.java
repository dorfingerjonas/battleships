public class ShipPart {
    private char x;
    private char y;
    private boolean shot = false;

    public ShipPart(char x, char y) {
        this.x = x;
        this.y = y;
    }

    //region Getter & Setter

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public char getY() {
        return y;
    }

    public void setY(char y) {
        this.y = y;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    //endregion
}
