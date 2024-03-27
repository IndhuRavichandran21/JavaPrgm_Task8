package Task8;

import java.util.Scanner;

public class SwapTwoNumbers {
    
    public static void main(String[] args) {
        
        Scanner scanner_obj=new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1=scanner_obj.nextInt();
        System.out.println("Enter the second value");
        int num2=scanner_obj.nextInt();
        int dummyVariable=num1;
        num1=num2;
        num2=dummyVariable;
        System.out.println("The given numbers swapped to num1="+num1+ " and num2="+num2);
        scanner_obj.close();
    }
}
