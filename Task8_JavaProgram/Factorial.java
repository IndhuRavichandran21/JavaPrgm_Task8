package Task8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner_obj=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=scanner_obj.nextInt();
        int fact=1;
        while(num>=1)
        {
            
             fact=fact*num;
             num--;

        }
        System.out.println("The factorial of the given number is "+fact);
scanner_obj.close();
    }
}
