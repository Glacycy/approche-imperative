package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batons = 21;
        boolean tourJoueur = random.nextBoolean();

        System.out.println("=== JEU DES 21 BÂTONS ===");
        System.out.println("Règle: Celui qui prend le dernier bâton perd!");
        System.out.println(tourJoueur ? "Vous commencez!" : "L'ordinateur commence!\n");

        while (batons > 1) {
            afficherBatons(batons);

            if(tourJoueur) {
                batons -= tourJoueur(scanner, batons);
            } else {
                batons -= tourOrdinateur(batons);
            }

            tourJoueur = !tourJoueur;
        }

        System.out.println("\n1 bâton restant!");
        System.out.println(tourJoueur ? "Vous prenez le dernier... Vous perdez!"
                : "L'ordinateur perd! Vous gagnez!");
        scanner.close();
    }

    private static void afficherBatons(int batons) {
        System.out.println("\n" + batons + " bâtons:" + "| ".repeat(batons));
    }

    private static int tourJoueur(Scanner scanner, int batons) {
        int choix;
        do {
            System.out.print("Prenez un deux ou trois bâtons: ");
            choix = scanner.nextInt();
            if (choix < 1 || choix > 3 || choix >= batons) {
                System.out.println("Choix incorrect. Veuillez choisir entre 1 et 3");
            }
        } while (choix <1 || choix > 3 || choix >= batons);

        System.out.println("Vous prenez " + choix + " bâtons.");
        return choix;
    }

    private static int tourOrdinateur(int batons) {
//        int choix = (batons - 1) % 4;
//        if (choix == 0) choix = 1;
//
//        choix = Math.min(choix, Math.min(3, batons - 1));
//        if (choix < 1) choix = 1;
//        System.out.println("L'ordinateur prend " + choix + " bâtons.");
//        return choix;
        int choix;
        String strategie;

        if (batons == 2) {
            choix = 1;
            strategie = "défense (évite de laisser 1)";
        } else if (batons == 3) {
            choix = 2;
            strategie = "défense (évite de laisser 1)";
        } else if (batons == 4) {
            choix = 3;
            strategie = "défense (évite de laisser 1)";
        } else {
            choix = new Random().nextInt(3) + 1;
            strategie = "aléatoire";
        }

        System.out.println("L'ordinateur prend " + choix + " bâton(s) [" + strategie + "]");
        return choix;
    }
}
