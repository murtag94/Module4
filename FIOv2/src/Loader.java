import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите Ф.И.О.");
        String fullName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        if(!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fullName).matches())
        {
            System.out.println("Неверно введено Ф.И.О.");
        }
        else {
            String[] fullNameArray = fullName.split("\\s");
            System.out.println("Фамилия: " + fullNameArray[0].trim());
            System.out.println("Имя: " + fullNameArray[1].trim());
            System.out.println("Отчество: " + fullNameArray[2].trim());
        }
    }
}
