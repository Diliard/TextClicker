package de.marc.main;
import java.util.Scanner;

import static de.marc.main.Main.TextAnzahl;

public class Shop {
    public static void main (String args[])

    {
        TextAnzahl = TextAnzahl;
        int PreisDT = (50);
        System.out.println("Du besitzt" + TextAnzahl + "Texte!");
        System.out.println("Was Möchtest du kaufen?");
        System.out.println("1. Doppelte Texte" + PreisDT);
        System.out.println("2. 50% Rabatt Kostet: 250");
        Scanner KaufNummer = new Scanner(System.in);
        int KaufBuffer = (KaufNummer.nextInt());
        if (KaufBuffer == (1)) {
            if (TextAnzahl > PreisDT) {
                TextAnzahl = (TextAnzahl - PreisDT);
                System.out.println("Du besitzt nun Doppelte Texte!");
                int UpgradeDoppelteTexte = (1);
            } else {
                if (TextAnzahl < PreisDT) {
                    System.out.println("Du Besitzt Zu wenig Texte.");
                }
            }
        } else {

            if (KaufBuffer == (2)) {
                if (TextAnzahl > 250) {
                    TextAnzahl = (TextAnzahl - 250);
                    int UpgradeSS = (1);
                    System.out.println("Du Besitzt nun den 50% Rabat!");
                    PreisDT = (PreisDT / 2 );
                }
            }
        }
    }
}