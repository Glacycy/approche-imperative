package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tab = {-9, 5, 2, 3, 40, 3250, -8, 46, -9};

        /*
        * Calcule une valeur booléenne qui contrôle le tableau de sorte :
        * vaut true si le tableau est de longueur supérieur ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
        * vaut false sinon
        * écrire l'algo de cette variable avec le minimum de ligne
        */
        boolean firstAndLastAreEquals = tab.length >= 1 && tab[0] == tab[tab.length - 1];
        System.out.println(firstAndLastAreEquals);

    }
}
