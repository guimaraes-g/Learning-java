/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell);
you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

Example: (input: output)

DnaStrand.makeComplement("ATTGC") // return "TAACG"
DnaStrand.makeComplement("GTAT") // return "CATA"
 */

public class DnaStrand {
    public static String makeComplement(String dna) {
        dna = dna.replaceAll("[A]", "!");
        dna = dna.replaceAll("[T]", "A");
        dna = dna.replaceAll("!", "T");
        dna = dna.replaceAll("[C]", "!");
        dna = dna.replaceAll("[G]", "C");
        dna = dna.replaceAll("!", "G");

        return dna;

    }
}