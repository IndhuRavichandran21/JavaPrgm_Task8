package Task8;

import java.util.Scanner;

public class CheckSeniorCitizen {
    int age;
    public static void main(String[] args) {
        CheckSeniorCitizen checkSeniorCitizen_obj=new CheckSeniorCitizen();
        Scanner scanner_obj=new Scanner(System.in);
        System.out.println("Enter the age of a person");
        checkSeniorCitizen_obj.age = scanner_obj.nextInt();
       checkSeniorCitizen_obj.checkSeniorOrNot(checkSeniorCitizen_obj.age);
       
        scanner_obj.close();
    }
    public void checkSeniorOrNot(int age)
    {
        if(age>=60)
        System.out.println("The person is a senior citizen");
        else
        System.out.println("The person is not a senior citizen");
    }
}
