import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double Cel = 0;
        double Far = 0;
        String trash = "";

        done = false;
        do
        {
            System.out.print("Enter your temp in Celsius: ");

            if (in.hasNextDouble())
            {
                Cel = in.nextDouble();
                in.nextLine();
                Far = (Cel* 1.8) + 32;
                System.out.println("Your temperature in Fahrenheit is: " + Far);
                done = true;
            }
            else
            {
            trash = in.nextLine();
                System.out.println(trash + " is not a valid input");
            }
        }
        while(!done);

    }
}
