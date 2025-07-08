package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        //Déclarer tableau d'entiers
        int[] tab = {1, 3, 8, 9, 100, 50, -8, -9};

        /*
        * Calcule une valeur booléenne qui contrôle le tableau de sorte :
        * vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier vaut 6
        * vaut false sinon
        * écrire l'algo de cette variable avec le minimum de ligne
        */
        boolean firstOrLast6 = tab.length > 0 && (tab[0] == 6 || tab[tab.length - 1] == 6);

        System.out.println(firstOrLast6);
    }
}
