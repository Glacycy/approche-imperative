package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        //Ecrire un programme qui demande 10 nombres à l'utilisateur, puis affiche le plus grand de ces nombres.
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer 10 nombres");
        int max = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            int nb = sc.nextInt();
            if (nb > max) {
                max = nb;
            }
        }
        System.out.println("Le plus grand des 10 nombres est : " + max);
    }
}
