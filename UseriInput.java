import java.util.Scanner;


/**
 * Write a description of class UseriInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UseriInput
{
    public static void main(String[]arg)
    {
            
        System.out.println("Enter num");
        int firstNum = sc.nextInt();
        System.out.println("Enter another num");
        int secondNum = sc.nextInt();
        
        int sum = firstNum + secondNum;
        System.out.println("The sum is "+sum);
        
        int larger=(firstNum > secondNum)?firstNum:secondNum;
        System.out.println("The larger num is "+larger);
        sc.close();
        
    }
}