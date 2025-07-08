package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        //Ecrire un programme qui demande un nombre à l'utilisateur, puis calcul la somme de tous les entiers compris entre 1 et ce nombre
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre:");
        int nb = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= nb; i++) {
            somme += i;
        }
        System.out.println("La somme de tous les entiers compris entre 1 et " + nb + " est : " + somme);
    }
}
