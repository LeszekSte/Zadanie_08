package Zadanie3;

import java.util.SplittableRandom;

public class ConverterTest {
    public static void main(String[] args) {

       for (int i = 1; i <=7; i++) {
           System.out.println( i + " dzień tygodnia to " + CalendarConverter.convertToString(i));
        }
    }
}

