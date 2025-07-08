package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l'ensemble des éléments grâce à une boucle
        for (int j : tab) {
            System.out.println(j);
        }

        //Afficher l'ensemble des éléments dans l'ordre inverse
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }

        //Créer un tableau arrayCopy et copier tous les éléments de tab dans arrayCopy
        int[] arrayCopy = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            arrayCopy[i] = tab[i];
        }
    }
}
