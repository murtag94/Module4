import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException
    {
        String text = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String surname = text.substring(0, text.indexOf(' '));
        String name = text.substring(text.indexOf(' '), text.lastIndexOf(' '));
        String patronymic = text.substring(text.lastIndexOf(' '));

        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name.trim());
        System.out.println("Отчество: " + patronymic.trim());
    }
}
