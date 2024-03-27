package Task8;

import java.util.Scanner;

public class CheckEvenNumber {
    int number;
    public static void main(String[] args) {
        CheckEvenNumber checkEvenNumber_obj=new CheckEvenNumber();
        Scanner scanner_obj=new Scanner(System.in);
        System.out.println("Enter any number to check whether it is even number or not");
        checkEvenNumber_obj.number=scanner_obj.nextInt();
        checkEvenNumber_obj.checkEvenOrOdd(checkEvenNumber_obj.number);
       
scanner_obj.close();
    }
    public void checkEvenOrOdd(int number)
    {
        if(number%2==0)
        System.out.println("The given number "+number+" is an Even number");
        else 
        System.out.println("The given number "+number+" is not an Even number");
    }
}
