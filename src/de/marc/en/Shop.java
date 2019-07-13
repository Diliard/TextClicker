package de.marc.en;
import java.util.Scanner;

import static de.marc.en.Main.TextAnzahl;

public class Shop {
    public static int UpgradeDT = (0);
    public static void main (String args[])

    {
        int PreisDT = (50);
        System.out.println("You own" + TextAnzahl + "Texts right now.");
        System.out.println("What do you want to Buy?");
        System.out.println("1. DoubleTexts" + PreisDT);
        System.out.println("2. 50% Sale Costs: 250");
        Scanner KaufNummer = new Scanner(System.in);
        int KaufBuffer = (KaufNummer.nextInt());
        if (KaufBuffer == (1)) {
            if (TextAnzahl > PreisDT) {
                TextAnzahl = (TextAnzahl - PreisDT);
                System.out.println("You own DoubleTexts now.");
                UpgradeDT = (1);
            } else {
                if (TextAnzahl < PreisDT) {
                    System.out.println("You don't have enough Texts.");
                }
            }
        } else {

            if (KaufBuffer == (2)) {
                if (TextAnzahl > 250) {
                    TextAnzahl = (TextAnzahl - 250);
                    int UpgradeSS = (1);
                    System.out.println("You now own the 50% Sale!");
                    PreisDT = (PreisDT / 2 );
                }
            }
        }
    }
}