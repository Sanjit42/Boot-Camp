import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testRectangleCanNotBeCreatedWithNegativeValues() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Expected non negative values but got -1.0 and 3.0");
        Rectangle.create(-1, 3);
    }
    @Test
    public void testGetAreaShouldGiveAreaOfTheRectangle() throws Exception {
        Rectangle rectangle = Rectangle.create(1, 3);
        assertEquals(3, rectangle.calculateArea(),0);
    }


    @Test
    public void testGetAreaShouldGiveAreaOfTheRectangleAsFloatNumber() throws Exception {
        Rectangle rectangle = Rectangle.create(5.3, 3);
        assertEquals(15.9, rectangle.calculateArea(),1);
    }
    @Test
    public void testGetPerimeterShouldGivePerimeterOfTheRectangle() throws Exception {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(10, rectangle.calculatePerimeter(),0);
    }
    @Test
    public void testGetPerimeterShouldGivePerimeterOfTheRectangleAsAFloatNumber() throws Exception {
        Rectangle rectangle = Rectangle.create(2.7, 3);
        assertEquals(11.4, rectangle.calculatePerimeter(),0);
    }
    @Test
    public void testPerimeterOfRectangleShouldBeNonZeroIfLengthAndIsZero() throws Exception {
        Rectangle rectangle = Rectangle.create(0, 0);
        assertEquals(0, rectangle.calculatePerimeter(),0);
    }@Test
    public void testPerimeterOfRectangleShouldBeZeroIfLengthAndWidthAreNonZeros() throws Exception {
        Rectangle rectangle = Rectangle.create(0, 0.5);
        assertEquals(1, rectangle.calculatePerimeter(),0);
    }
    @Test
    public void testAreaOfRectangleShouldBeZeroIfLengthIsZero() throws Exception {
        Rectangle rectangle = Rectangle.create(0, 2.3);
        assertEquals(0, rectangle.calculateArea(),0);
    }
}