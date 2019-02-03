package Zadanie4_dodatkowe;

public class ArrayCompator {

    static boolean compere(int[] tab1, int[] tab2) {

        boolean compere = true;
        if (tab1.length != tab2.length) {
            return compere = false;
        } else {
            int i = 0;
            do {
                if (tab1[i] != tab2[i]) {
                    return compere = false;
                }
                i++;
            } while (i < tab1.length);
        }
        return compere;
    }

    static boolean compere(int[][] tab1, int[][] tab2) {
        boolean compere = true;

        if (tab1[0].length != tab2[0].length || tab1[1].length != tab2[1].length) {
            return compere = false;
        } else {
            for (int i = 0; i < 2; i++) {
                int j = 0;
                do {
                    if (tab1[i][j] != tab2[i][j]) {
                        return compere = false;
                    }
                    j++;
                } while (j < tab1[i].length);
            }
        }
        return compere;
    }
}




