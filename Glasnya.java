import java.util.Scanner;

public class Glasnya
{

public static void Gl(Glasnya a)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку/Enter a line: ");

        String str=in.nextLine();

        int k = 0;

        if((str.charAt(0)=='а')||(str.charAt(0)=='о')||(str.charAt(0)=='у')||(str.charAt(0)=='ю')||(str.charAt(0)=='и')||(str.charAt(0)=='е')||(str.charAt(0)=='ё')||(str.charAt(0)=='ы')||(str.charAt(0)=='э')||(str.charAt(0)=='я')||(str.charAt(0)=='А')||(str.charAt(0)=='О')||(str.charAt(0)=='У')||(str.charAt(0)=='Ю')||(str.charAt(0)=='И')||(str.charAt(0)=='Е')||(str.charAt(0)=='Ё')||(str.charAt(0)=='Ы')||(str.charAt(0)=='Э')||(str.charAt(0)=='Я')||(str.charAt(0)=='a')||(str.charAt(0)=='e')||(str.charAt(0)=='y')||(str.charAt(0)=='u')||(str.charAt(0)=='i')||(str.charAt(0)=='o')||(str.charAt(0)=='A')||(str.charAt(0)=='E')||(str.charAt(0)=='Y')||(str.charAt(0)=='U')||(str.charAt(0)=='I'))
        {
            k++;
            System.out.println("Первое слово начинается на гласную/The first word begins with a vowel.");
        }

        else
        {
            System.out.println("Первое слово не начинается с гласной/The first word does not begin with a vowel.");
        }

        for (int s = 0; s < str.length(); s++)
        {
            if ((str.charAt(s) == ' ') && ((str.charAt(s + 1) == 'а') || (str.charAt(s + 1) == 'о') || (str.charAt(s + 1) == 'у') || (str.charAt(s + 1) == 'ю') || (str.charAt(s + 1) == 'и') || (str.charAt(s + 1) == 'е') || (str.charAt(s + 1) == 'ё') || (str.charAt(s + 1) == 'ы') || (str.charAt(s + 1) == 'э') || (str.charAt(s + 1) == 'я') || (str.charAt(s + 1) == 'А') || (str.charAt(s + 1) == 'О') || (str.charAt(s + 1) == 'У') || (str.charAt(s + 1) == 'Ю') || (str.charAt(s + 1) == 'И') ||  (str.charAt(s + 1) == 'Е') || (str.charAt(s + 1) == 'Ё') || (str.charAt(s + 1) == 'Ы') || (str.charAt(s + 1) == 'Э') || (str.charAt(s + 1) == 'Я') || (str.charAt(s + 1) == 'a') || (str.charAt(s + 1) == 'A') || (str.charAt(s + 1) == 'e') || (str.charAt(s + 1) == 'E') || (str.charAt(s + 1) == 'y') || (str.charAt(s + 1) == 'Y') || (str.charAt(s + 1) == 'u') || (str.charAt(s + 1) == 'U') || (str.charAt(s + 1) == 'i') || (str.charAt(s + 1) == 'I') || (str.charAt(s + 1) == 'o') || (str.charAt(s + 1) == 'O')))
            {
                k++;
            }
        }

        System.out.println("Количество слов начинающихся с гласной/Number of words beginning with a vowel: " + k);
    }
}
