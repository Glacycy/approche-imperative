package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        /*
        * Programme =
        * Ajoute un nombre et affiche les nombres existants
        */
        Scanner sc = new Scanner(System.in);

        int[] tab = new int[2];
        int nbEltStock = 0;
        int option;


        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("0. Quitter");
            System.out.print("Veuillez choisir une option : ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Veuillez entrer un nombre : ");
                    int newNb = sc.nextInt();

                    if (nbEltStock >= tab.length) {
                        tab = upgradeTab(tab);
                        System.out.println("Tableau mis à jour, nouvelle taille : " + tab.length);
                    }

                    tab[nbEltStock] = newNb;
                    nbEltStock++;
                    System.out.println("Nombre" + newNb + "ajouté avec succès !");
                    break;

                case 2:
                    if (nbEltStock == 0) {
                        System.out.println("Aucun nombre stocké.");
                    } else {
                        System.out.println("Nombre stocké :" + nbEltStock);
                        for (int i = 0; i < nbEltStock; i++) {
                            System.out.print(tab[i]);
                            if (i < nbEltStock - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option non disponible.");
            }
        } while (option != 0);

        sc.close();
    }

    /*
     * Méthode permettant de doubler la taille du tableau
     */
    private static int[] upgradeTab(int[] tab) {
        return java.util.Arrays.copyOf(tab, tab.length * 2);
    }
}
