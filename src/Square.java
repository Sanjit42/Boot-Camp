/*
    Job of Square:
        to inherit behaviour from Rectangle.
 */

public class Square extends Rectangle {
    private Square(double size) {
        super(size, size);
    }

    public static Square create(double size) throws Exception {
        if (size < 0)
            throw new Exception("Expected non negative values but got " + size);
        return new Square(size);
    }
}
