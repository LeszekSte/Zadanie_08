package Zadanie4_dodatkowe;

public class ArrayTest {
    public static void main(String[] args) {


        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {1, 2, 3, 4};

        System.out.println(ArrayCompator.compere(tab1, tab2));

        int[] tab3 = {1, 2,4, 34};
        int[] tab4 = {1, 2, 3, 4};

        System.out.println(ArrayCompator.compere(tab3, tab4));


        int[][] tab5 = {{1, 2, 3, 4}, {1, 2}};
        int[][] tab6 = {{1, 2, 3, 4}, {1, 2}};

        System.out.println(ArrayCompator.compere(tab5, tab6));
        int[][] tab7 = {{1, 2, 3, 4}, {1, 2, 4}};
        int[][] tab8 = {{1, 2, 3, 4}, {1, 2}};

        System.out.println(ArrayCompator.compere(tab7, tab8));



    }
}
