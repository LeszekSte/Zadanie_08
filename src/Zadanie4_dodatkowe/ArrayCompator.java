package Zadanie4_dodatkowe;

public class ArrayCompator {

    static boolean compere(int [] tab1, int [] tab2){

        boolean compere = true;
        if (tab1.length != tab2.length){
            return compere = false;
        }else {
            int i=0;
            do {
                if (tab1[i]!=tab2[i]){
                    return compere= false;
                }
                i++;
            }while (i<tab1.length);
        }
    return compere;
    }
}
