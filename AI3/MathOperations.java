package AI3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        var greater = (num>40)?"PASS":"FAIL";
        System.out.println("The num has "+"\n"+ greater);
        sc.close();
    }
}