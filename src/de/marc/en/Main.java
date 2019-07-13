package de.marc.en;

import java.util.Scanner;

import static de.marc.en.Shop.UpgradeDT;

public class Main {
    static int TextAnzahl = (0);
    public static void main(String[] args) {

        System.out.println("The Commands are: Text und Shop.");
        int idkEvenMorelol = (0);
        while (idkEvenMorelol == 0) {

            Scanner Input = new Scanner(System.in);
            String InputBuffer = (Input.nextLine());
            if (InputBuffer != "Shop" && InputBuffer != null) {
                TextAnzahl++;
                System.out.println("+1 Text Good Job!");
                if (UpgradeDT == (1)) {
                    TextAnzahl++;
                    System.out.println("DoubleTexts are Active.");
                }

                if (InputBuffer.equalsIgnoreCase("Shop")) {
                    de.marc.ger.Shop.main(null);
                }
                if (InputBuffer.equalsIgnoreCase("Anzahl")) {
                    System.out.println("You own " + TextAnzahl + "Texts Right now.");
                }


            }
        }
    }
}
