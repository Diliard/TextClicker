package de.marc.main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("What language do you pick? / Welche Sprache?");
        System.out.println("En for Englisch Ger for German / En für Englisch Ger für Deutsch");
        Scanner Lang = new Scanner(System.in);
        String LangBuffer = (Lang.nextLine());
        if (LangBuffer.equalsIgnoreCase("Ger")) {
            de.marc.ger.Main.main(args);
        }
        if (LangBuffer.equalsIgnoreCase("En")) {
            de.marc.en.Main.main(args);
        }

    }
}
