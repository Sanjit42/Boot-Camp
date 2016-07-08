public class Rectangle {
    private double length, width;

    protected Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle create(double length, double width) throws Exception {
        if(length<0 || width<0)
            throw new Exception("Expected non negative values but got "+length+" and "+width);
        return new Rectangle(length,width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return  2 * (length + width);
    }
}
