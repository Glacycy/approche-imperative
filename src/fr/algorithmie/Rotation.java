package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //effectuer une rotation à droite des éléments
        int lastElt = tab[tab.length - 1];
        for (int i = tab.length - 1; i > 0; i--) {
            tab[i] = tab[i - 1];
        }
        tab[0] = lastElt;

        for (int j : tab) {
            System.out.println(j);
        }
    }
}
