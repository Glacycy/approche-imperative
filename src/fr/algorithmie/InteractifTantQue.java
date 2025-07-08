package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        //écrire un programme qui demande un nombre à l'user qui doit être obligatoirement entre 1 et 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 1 et 10: ");
        int nb = sc.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.println("Veuillez choisir un nombre entre 1 et 10");
            nb = sc.nextInt();
        }
        System.out.println("Vous avez choisi le nombre " + nb);

    }
}
