import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAreaOfSquare() throws Exception {
        Square square = Square.create(2);
        assertEquals(4,square.calculateArea(),0);
    }

    @Test
    public void testPerimeterOfSquareShouldBeZeroIfSize() throws Exception {
        Square square = Square.create(0);
        assertEquals(0,square.calculatePerimeter(),0);
    }
    @Test
    public void testPerimeterOfSquare() throws Exception {
        Square square = Square.create(2);
        assertEquals(8,square.calculatePerimeter(),0);
    }

    @Test
    public void testSquareCanNotBeCreatedWithNegativeValues() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Expected non negative values but got -1.0");
        Square.create(-1);
    }
}
