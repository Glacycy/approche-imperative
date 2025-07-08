package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // Créer un tableau qui contient la somme des 2 tableaux
        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i] + (i < tab2.length ? tab2[i] : 0);
        }

        for (int element : tab3) {
            System.out.println(element);
        }
    }
}