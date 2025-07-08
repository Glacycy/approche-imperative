package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        //Ecrire un programme qui demande un nombre à l'utilisateur, puis qui affiche les 10 chiffres suivants
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int nb = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + i);
        }
    }
}
