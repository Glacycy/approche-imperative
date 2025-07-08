package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        //écrire le code permettant de comparer le nombre d'éléments en commun dans ces 2 tableaux

        int count = 0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    count++;
                }
            }
        }
        System.out.println("Il y a " + count + " éléments en commun.");

    }
}
