package Task8;

import java.util.Scanner;

public class GreaterSum {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
       int a=sc.nextInt();
       System.out.println("Enter the value of b");
       int b=sc.nextInt();
       System.out.println("Enter the value of c");
       int c=sc.nextInt();
       System.out.println("Enter the value of d");
       int d=sc.nextInt();
if((a+b)>(c+d))
System.out.println("Sum of a and b is greater than sum of c and d");
else
System.out.println("sum of c and d is greater than or equal to Sum of a and b");
sc.close();
    }
}
