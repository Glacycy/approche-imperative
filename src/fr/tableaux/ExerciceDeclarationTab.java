package fr.tableaux;

import org.w3c.dom.ls.LSOutput;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println("index 0 du tab : " + tab[0]);

        System.out.println("longueur du tab : " + tab.length);

        System.out.println("dernier élément du tab : " + tab[tab.length - 1]);

        System.out.println(tab[10]);
        // Cela soulève ArrayIndexOutOfBoundsException : 10
        //  car les indices valides sont 0 à 7 (8 éléments).

    }

}
