package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        /*
        * Ecrire un programme qui choisit un nombre aléatoire entre 1 et 100
        * puis demande à l'user de trouver ce nombre en lui indiquant s'il est au dessus ou au dessous de ce nombre.
        * Si trouvé, affiche "Bravo, vous avez trouvé en N coup"
        */
        Scanner sc = new Scanner(System.in);

        int nb = (int) (Math.random() * 100) + 1;
        int nbTentatives = 0;
        int nbTentativesMax = 10;
        boolean trouve = false;

        while (!trouve && nbTentatives < nbTentativesMax) {
            System.out.println("Veuillez entrer un nombre entre 1 et 100: ");
            int nbTentative = sc.nextInt();
            nbTentatives++;

            if (nbTentative == nb) {
                trouve = true;
                System.out.println("Bravo, vous avez trouvé en " + nbTentatives + " coup(s)");
            } else if (nbTentative < nb) {
                System.out.println("Le nombre est plus grand");
            } else {
                System.out.println("Le nombre est plus petit");
            }
        }

        if (!trouve) {
            System.out.println("Perdu ! Le nombre était : " + nb);
        }

    }
}
