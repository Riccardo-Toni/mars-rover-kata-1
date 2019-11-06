import java.util.Objects;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Rover move() {
        if(direction == Direction.NORTH){
            y++;
        }
        if(direction == Direction.EAST){
            x++;
        }
        if(direction == Direction.SOUTH){
            y--;
        }
        if(direction == Direction.WEST){
            x--;
        }
        return this;
    }

    public void rotateLeft() {
        direction = direction.rotateLeft(direction);

    }

    public void rotateRight() {
        direction = direction.rotateRight(direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}