package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Calculer la moyenne des valeurs du tableau
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        int moyenne = somme / tab.length;
        System.out.println("La moyenne des valeurs du tableau est : " + moyenne);
    }
}
