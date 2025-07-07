package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] towns= {"Paris", "Lyon", "Marseille", "Toulouse", "Nantes"};

        System.out.println(towns[0]);
        System.out.println(towns[1]);
        System.out.println(towns[2]);
        System.out.println(towns[3]);
        System.out.println(towns[4]);

        System.out.println("Villes de la France : " + towns.length);

        towns[3] = "Béziers";

        System.out.println(towns[0]);
        System.out.println(towns[1]);
        System.out.println(towns[2]);
        System.out.println(towns[3]);
        System.out.println(towns[4]);
    }
}
