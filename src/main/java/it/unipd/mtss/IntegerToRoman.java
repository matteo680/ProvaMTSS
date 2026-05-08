////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    int[] values = {50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"L", "XL", "X", "IX", "V", "IV", "I"};
    String res = "";
    for (int i = 0; i < values.length; i++) {
        while (number >= values[i]) {
            res += symbols[i];
            number -= values[i];
        }
    }
    return res;
  }
}