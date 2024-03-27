package Task8;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner_obj=new Scanner(System.in);
        System.out.println("Enter any value: ");
        int num=scanner_obj.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
           if(num%i==0)
            count++;
        }
        if (num==1)
        System.out.println("The given number is neither prime nor composite");
        else if(count==2)
        System.out.println("The given number is prime number");
        else
        System.out.println("The given number is non-prime");
scanner_obj.close();
    }
}
