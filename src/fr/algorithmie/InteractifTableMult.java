package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        //Ecrire un programme qui demande un nombre à l'utilisateur de 1 à 10, puis qui affiche sa table de multiplication
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 1 et 10: ");
        int nb = sc.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.println("Veuillez choisir un nombre entre 1 et 10");
            nb = sc.nextInt();
        }

        System.out.println("Vous avez choisi le nombre " + nb);

        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " x " + i + " = " + nb * i);
        }
    }
}
