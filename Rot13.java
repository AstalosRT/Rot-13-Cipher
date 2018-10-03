import java.util.Scanner;

public class Rot13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to cipher?");
        String str = scan.nextLine();
        letterChange(str);
        
    }
    public static void letterChange(String cipher)
    {
        Scanner scan = new Scanner(System.in);
        String done = "";
        
        int times = 0;
        int stop = cipher.length();
        while (times < stop)
        {

            for (int i=0; i<1; i++)
            {
                char chr = cipher.charAt(times);
                int asciiValue = (int) chr;
                int str2 = 0;

                if (asciiValue < 110 && asciiValue >= 97)
                {
                    str2 = (chr + 13);
                }
                else if (asciiValue >= 110)
                {
                    str2 = (chr - 13);
                }
                
                char car = ((char) (str2));

                done = done + car;
                
                times++;
            }
        }
        System.out.println(done);
    }
}