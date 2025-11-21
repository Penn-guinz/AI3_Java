package AI3;
import java.util.Scanner;


/**
 * Write a description of class DayCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayCounter
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days");
        var num = sc.nextInt();
        var year = num/360;
        var months = (num%360<0)?0:(num%360)/30;
        var days = (num%360)%30;
        System.out.println("years"+year+"\n"+"months"+months+"\n"+"days:"+days);
    }
        
}