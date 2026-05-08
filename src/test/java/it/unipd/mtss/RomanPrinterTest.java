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

    private void verifyOutput(String output) {
        assertNotNull("L'output non deve essere nullo", output);
        assertFalse("L'output non deve essere vuoto", output.isEmpty());
    }
}