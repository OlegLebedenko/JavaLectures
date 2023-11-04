package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        String[]ar = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
        int x = 8;
        switch(x){
            case 1:
                System.out.println(ar[0]);break;
            case 2:
                System.out.println(ar[1]);break;
            case 3:
                System.out.println(ar[2]);break;
            case 4:
                System.out.println(ar[3]);break;
            case 5:
                System.out.println(ar[4]);break;
            case 6:
                System.out.println(ar[5]);break;
            case 7:
                System.out.println(ar[6]);break;
            default:
                System.out.println("Wrong number");

        }
    }
}