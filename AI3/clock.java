package AI3;
import java.util.Scanner;


/**
 * Write a description of class clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class clock
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of seconds");
        var num = sc.nextInt();
        var hours = num/3600;
        var remainder = num%3600;
        var minutes = 0;
        var minute = (remainder<60)?0:(remainder/60);
        System.out.println(minutes);
        var seconds = remainder%60;
        System.out.println("hours"+hours+"\n"+"minutes"+minute+"\n"+"seconds:"+seconds);
        
        
        
        
        
        
        
    }
}