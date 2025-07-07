package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        //Déclarer tableau d'entiers contenant tous les entiers edd 1 à 10
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Afficher le premier élément du tableau
        System.out.println(tab[0]);

        //Afficher longueur du tableau en utilisant la propriété length
        System.out.println(tab.length);

        //Afficher le dernier élément du tableau en utilisant la propriété length
        System.out.println(tab[tab.length - 1]);

        //Modifier la valeur de l'élément d'index 4 et donnez lui la valeur 8
        tab[4] = 8;

        //Afficher la valeur de l'élément d'index 4
        System.out.println(tab[4]);
    }
}
