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
@Test
public void testPrimiSeiNumeri(){
    assertEquals("IV", IntegerToRoman.convert(4));
    assertEquals("V", IntegerToRoman.convert(5));
    assertEquals("VI", IntegerToRoman.convert(6));
}
@Test
public void testPrimiDieciNumeri(){
    assertEquals("VII", IntegerToRoman.convert(7));
    assertEquals("VIII", IntegerToRoman.convert(8));
    assertEquals("IX", IntegerToRoman.convert(9));
    assertEquals("X", IntegerToRoman.convert(10));
}
@Test
public void testPrimiVentiNumeri(){
    assertEquals("XI", IntegerToRoman.convert(11));
    assertEquals("XV", IntegerToRoman.convert(15));
    assertEquals("XVI", IntegerToRoman.convert(16));
    assertEquals("XIX", IntegerToRoman.convert(19));
    assertEquals("XX", IntegerToRoman.convert(20));
}
}