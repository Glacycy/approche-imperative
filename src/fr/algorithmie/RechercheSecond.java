package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        //Recherche le second plus grand élément du tableau et affichez le
        int max = tab[0];
        int secondMax = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                secondMax = max;
                max = tab[i];
            } else if (tab[i] > secondMax) {
                secondMax = tab[i];
            }
        }
        System.out.println("Le second plus grand élément du tableau est : " + secondMax);
    }
}
