package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String[] tab = {"a", "a", "b", "b", "b", "c"};
         //Transformez cette chaîne en comptant les répétitions successives
        int i = 0;
        while (i < tab.length) {
            String element = tab[i];
            int count = 1;

            while (i + count < tab.length && tab[i + count].equals(element)) {
                count++;
            }

            System.out.print(element + count);

            i += count;
        }

    }
}
