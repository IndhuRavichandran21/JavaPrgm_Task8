package Task8;

import java.util.Scanner;

public class CountDigits {
    int number;
    public static void main(String []args)
    {
        CountDigits countDigits_obj=new CountDigits();
        System.out.println("Enter any number");
        Scanner scanner_obj=new Scanner(System.in);
        countDigits_obj.number=scanner_obj.nextInt();
        countDigits_obj.countDigits(countDigits_obj.number);
        scanner_obj.close();
    }
    public void countDigits(int number)
    {
        int count=0;
        while(number!=0)
        {
        number=number/10;
        count++;

        }
        System.out.println("Number of digit(s) for a given number is "+count);

    }
}
