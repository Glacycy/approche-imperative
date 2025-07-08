package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int entier = 8;

        //écrire l'algo avec un min de ligne permettant de savoir si l'entier est un nombre parfait

        int somme = 0;
        for (int i = 1; i < entier; i++) {
            if (entier % i == 0) {
                somme += i;
            }
        }
        System.out.println(somme == entier);

    }
}
