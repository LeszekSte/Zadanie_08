package Zadanie1;

import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        final int ROZMIAR_TAB = 10;
        int[] tab1 = new int[ROZMIAR_TAB];

        Main1.rand(tab1);
        //Wersja ze Stringmi
        Main1.printDoubleTab(tab1);
     //Wersja z Arrays.toString - myślę że "prawie" dobra
        Main1.podwojonaTablica(tab1);
    }

    static void printDoubleTab(int []tab){
        String num1= "";
        String num2 = "";
        for (int i = 0; i < tab.length; i++) {
            num1+=tab[i];
            num2+=tab[tab.length-1-i];
        }
        System.out.println(num1+num2);
    }

    static void podwojonaTablica(int[] tab) {
        int[] tab2 = new int [2*tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
            tab2[i + tab.length] = tab[tab.length - 1 - i];
        }
        System.out.println(Arrays.toString(tab2));
    }

    static int[] rand(int[] tab) {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10);
        }
        return tab;
    }
}
