////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintPrimiTreNumeri() {
        verifyOutput(RomanPrinter.print(1));
        verifyOutput(RomanPrinter.print(2));
        verifyOutput(RomanPrinter.print(3));
    }

    @Test
    public void testPrintPrimiSeiNumeri() {
        verifyOutput(RomanPrinter.print(4));
        verifyOutput(RomanPrinter.print(5));
        verifyOutput(RomanPrinter.print(6));
    }

    @Test
    public void testPrintPrimiDieciNumeri(){
        verifyOutput(RomanPrinter.print(7));
        verifyOutput(RomanPrinter.print(8));
        verifyOutput(RomanPrinter.print(9));
        verifyOutput(RomanPrinter.print(10));
    }
    //da qui in poi testiamo casi particolari
    @Test
    public void testPrintPrimiVentiNumeri(){
        verifyOutput(RomanPrinter.print(11));
        verifyOutput(RomanPrinter.print(15));
        verifyOutput(RomanPrinter.print(16));
        verifyOutput(RomanPrinter.print(19));
        verifyOutput(RomanPrinter.print(20));
    }

    @Test
    public void testPrintPrimiCinquantaNumeri(){
        verifyOutput(RomanPrinter.print(25));
        verifyOutput(RomanPrinter.print(31));
        verifyOutput(RomanPrinter.print(35));
        verifyOutput(RomanPrinter.print(40));
        verifyOutput(RomanPrinter.print(49));
        verifyOutput(RomanPrinter.print(50));
    }

    @Test
    public void testPrintPrimiCentoNumeri(){
        verifyOutput(RomanPrinter.print(51));
        verifyOutput(RomanPrinter.print(66));
        verifyOutput(RomanPrinter.print(79));
        verifyOutput(RomanPrinter.print(85));
        verifyOutput(RomanPrinter.print(99));
        verifyOutput(RomanPrinter.print(100));
    }

    @Test
    public void testPrintPrimiCinquecentoNumeri(){
        verifyOutput(RomanPrinter.print(401));
        verifyOutput(RomanPrinter.print(427));
        verifyOutput(RomanPrinter.print(489));
        verifyOutput(RomanPrinter.print(499));
        verifyOutput(RomanPrinter.print(500));
    }

    @Test
    public void testPrintPrimiMilleNumeri() {
        verifyOutput(RomanPrinter.print(501));
        verifyOutput(RomanPrinter.print(666));
        verifyOutput(RomanPrinter.print(900));
        verifyOutput(RomanPrinter.print(999));
        verifyOutput(RomanPrinter.print(1000));
    }

    private void verifyOutput(String output) {
        assertNotNull("L'output non deve essere nullo", output);
        assertFalse("L'output non deve essere vuoto", output.isEmpty());
    }
}