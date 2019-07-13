package de.marc.ger;

import java.util.Scanner;

import static de.marc.ger.Shop.UpgradeDT;

public class Main {
    static int TextAnzahl = (0);
    public static void main(String[] args) {

        System.out.println("Die Commands Sind, Text und Shop.");
        int idkEvenMorelol = (0);
        while (idkEvenMorelol == 0) {

            Scanner Input = new Scanner(System.in);
            String InputBuffer = (Input.nextLine());
            if (InputBuffer != "Shop" && InputBuffer != null) {
                TextAnzahl++;
                System.out.println("+1 Text Gut Gemacht!");
                if (UpgradeDT == (1)) {
                    TextAnzahl++;
                    System.out.println("DoppelteTexte Aktiv.");
                }

                if (InputBuffer.equalsIgnoreCase("Shop")) {
                    de.marc.ger.Shop.main(args);
                }
                if (InputBuffer.equalsIgnoreCase("Anzahl")) {
                    System.out.println("Du Besitzt zur Zeit " + TextAnzahl + "Texte");
                }


            }
        }
    }
}
