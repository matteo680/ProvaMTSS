////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        if (num < 1 || num > 50) {
            throw new IllegalArgumentException("Al momento supportiamo solo i numeri 1-50");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] lines = {"", "", "", "", "", ""};
        for (char c : romanNumber.toCharArray()) {
            String[] art = getAsciiArtForChar(c);
            for (int i = 0; i < 6; i++) {
                lines[i] += art[i] + "  "; 
            }
        }
        return String.join("\n", lines);
    }

    private static String[] getAsciiArtForChar(char c) {
        
        if (c == 'I') {
            return new String[]{
                "  _____   ", 
                " |_   _|  ", 
                "   | |    ", 
                "   | |    ", 
                "  _| |_   ", 
                " |_____|  "
            };
        } 
        else if (c == 'V') {
            return new String[]{
                "__      __", 
                "\\ \\    / /", 
                " \\ \\  / / ", 
                "  \\ \\/ /  ", 
                "   \\  /   ", 
                "    \\/    "
            };
        }
        else if (c == 'X') {
            return new String[]{
                "__    __  ", 
                "\\ \\  / /  ", 
                " \\ \\/ /   ", 
                "  >  <    ", 
                " / /\\ \\   ", 
                "/_/  \\_\\  " 
            };
        }
        else if (c == 'L') {
        return new String[]{
                " _        ", 
                "| |       ", 
                "| |       ", 
                "| |       ", 
                "| |____   ", 
                "|______|  "
            };
        }
        throw new IllegalArgumentException("Carattere non supportato: " + c);
    }
}