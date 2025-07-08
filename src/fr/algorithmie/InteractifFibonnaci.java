package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre supérieur à 0 : ");
        int nb = scanner.nextInt();
        int[] tab = new int[nb+1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}
