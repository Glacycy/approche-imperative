package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Combiner une boucle et un test de maniere a afficher que les entiers pairs
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                System.out.println(tab[i]);
            }
        }

        //Combiner une boucle et un test de maniere a afficher que les entiers supérieurs à 3
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 3) {
                System.out.println(tab[i]);
            }
        }

        //Combiner une boucle et un test de maniere a afficher que les valeurs des index pairs
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }

        //Combiner une boucle et un test de maniere a afficher que les entiers impairs
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
