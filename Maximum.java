import java.util.Scanner;

public class Maximum
{
    public static void M(Maximum b)
    {
        int cout = 0, first = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку/Entered string: ");

        String str = in.nextLine();
        String[] d = str.split(" ");

        String s = " ";

        for (int i = 0; i < d.length; i++) {
            if (d[i].length() >= cout) {
                cout = d[i].length();
                s = d[i];
            }
        }
        System.out.println("" + s);
    }
}