import java.util.Map;

public enum Direction {
    NORTH,
    EAST,
    WEST,
    SOUTH;

    private static final Map<Direction, Direction> leftRotation = Map.of(
            Direction.EAST, Direction.NORTH,
            Direction.NORTH, Direction.WEST,
            Direction.WEST, Direction.SOUTH,
            Direction.SOUTH, Direction.EAST
    );

    private static final Map<Direction, Direction> rightRotation = Map.of(
            Direction.EAST, Direction.SOUTH,
            Direction.NORTH, Direction.EAST,
            Direction.WEST, Direction.NORTH,
            Direction.SOUTH, Direction.WEST
    );

    public Direction rotateRight(Direction direction) {
        return rightRotation.get(direction);
    }

    public Direction rotateLeft(Direction direction) {
        return leftRotation.get(direction);
    }

}
