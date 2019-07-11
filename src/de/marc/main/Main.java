package de.marc.main;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;
public class Main {
    static int TextAnzahl = (0);
    public static void main(String[] args) {
        Scanner Boolshit = new Scanner(System.in);
        while (Boolshit.hasNextDouble()) {
                Scanner Input = new Scanner(System.in);
        String InputBuffer = (Input.nextLine());
    if (InputBuffer.equalsIgnoreCase("Text")) {
        TextAnzahl ++;
	if (InputBuffer.equalsIgnoreCase("Store")) {
        de.marc.main.Shop.main(args);
    }
    }
    continue;
    }
    }
}
