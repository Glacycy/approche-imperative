package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        //Afficher les nombres de 1 à 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Afficher 20 fois mon nom et prénom
        for (int i = 0; i < 20; i++) {
            System.out.println("GOMEZ Angeline");
        }

        //Afficher les éléments pairs de 2 à 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        //Afficher les éléments impairs de 1 à 99
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }
}
