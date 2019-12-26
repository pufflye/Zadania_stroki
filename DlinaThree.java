import java.util.Scanner;

public class DlinaThree
{
    public static void DT(DlinaThree c)
    {
        int n = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку/Entered string: ");

        String str = in.nextLine();
        String[] r = str.split(" ");

        for (int i = 0; i < r.length; i++)
        {
            if (r[i].length() == 3)
            {
                n++;
                System.out.println("Номер слова длиной три/The number of words of length three: " + n);
            }
        }
    }
}
