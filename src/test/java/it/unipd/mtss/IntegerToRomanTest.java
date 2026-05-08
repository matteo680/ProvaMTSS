////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class IntegerToRomanTest {
@Test
public void testPrimiTreNumeri() {
    assertEquals("I", IntegerToRoman.convert(1));
    assertEquals("II", IntegerToRoman.convert(2));
    assertEquals("III", IntegerToRoman.convert(3));
}
}