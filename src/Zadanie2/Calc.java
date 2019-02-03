package Zadanie2;

public class Calc {

    static int sumDigits(int number){
      int sum = 0;
       do {
           sum+=number%10;
           number=number/10;
       }while (number>0);
        return sum;
    }
}
