import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void testgetAreaShouldGiveAreaOfTheRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(15, 3);
        assertEquals(45, rectangle.getArea(),0);
    }
    @Test
    public void testgetareashouldGiveAreaOfTheRectangleAsFloatNumber() throws Exception {
        Rectangle rectangle = new Rectangle(15.3, 3);
        assertEquals(45.9, rectangle.getArea(),1);
    }
    @Test
    public void testgetPerimeterShouldGivePerimeterOfTheRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(15, 3);
        assertEquals(36, rectangle.getPerimeter(),0);
    }
    @Test
    public void testgetPerimeterShouldGivePerimeterOfTheRectangleAsAFloatNumber() throws Exception {
        Rectangle rectangle = new Rectangle(15.3, 3);
        assertEquals(36.6, rectangle.getPerimeter(),0);
    }
}