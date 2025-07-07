package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        System.out.println("Déclaration de variables");

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        char c = 'a';
        boolean bool = true;
        String str = "Hello";

        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("char : " + c);
        System.out.println("boolean : " + bool);
        System.out.println("String : " + str);

        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}
