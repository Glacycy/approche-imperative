package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        verifier(3, 1, 8, true);
        verifier(3, 9, 8, true);
        verifier(6, 0, 11, false);
        verifier(3, 1, 9, true); //return ERROR car false ce qui ne correspond pas au résultat attendu
        verifier(3, 2, 9, false);
    }

    /**
     * Méthode pour savoir si possible de fabriquer un mur ou pas
     */
    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int maxGrandesPossibles = Math.min(nbBig, longueur / 5);

        for (int grandesUtilisees = maxGrandesPossibles; grandesUtilisees >= 0; grandesUtilisees--) {
            int longueurRestante = longueur - grandesUtilisees * 5;
            if (longueurRestante <= nbSmall) {
                return true;
            }
        }
        return false;
    }

    /**
     * Méthode pour tester et afficher résultat
     */
    public static void verifier(int nbSmall, int nbBig, int longueur, boolean attendu) {
        boolean resultat = fabriquerMur(nbSmall, nbBig, longueur);
        String statut = (resultat == attendu) ? "OK" : "ERREUR";

        //System.out.println(statut + " - " + nbSmall + " petites + " + nbBig + " grandes -> mur " + longueur + "m : " + resultat + " (attendu: " + attendu + ")");
        System.out.printf("%s - %d petites + %d grandes -> mur %dm : %s (attendu: %s)%n",
                statut, nbSmall, nbBig, longueur, resultat, attendu); //plus propre que println
    }
}
