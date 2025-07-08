package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Créer un tableu arrayCopy et copier tous les éléments de tab dans arrayCopy mais dans l'ordre inverse
        int[] arrayCopy = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            arrayCopy[i] = tab[tab.length - 1 - i];
        }

        //Afficher l'ensemble des éléments des 2 tableaux
        for (int j : tab) {
            System.out.println(j);
        }
        for (int j : arrayCopy) {
            System.out.println(j);
        }
    }
}
