////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero da convertire: ");
        int numero = scanner.nextInt();
        System.out.print("Il tuo numero convertito è: \n");
        System.out.println(IntegerToRoman.convert(numero));
        System.out.print("Il tuo numero stampato in asciart è:\n");
        System.out.println(RomanPrinter.print(numero));
        scanner.close();
    }
}
