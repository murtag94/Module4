import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static int carNumber;
    public static int containerNumber;
    public static int boxNumber;

    public static void main(String[] args) throws IOException
    {
        int boxCount = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        while (boxNumber < boxCount)
        {
            carNumber++;
            System.out.println("Грузовик " + carNumber + ":");
            for (int i = 0; i < 12; i++)
            {
                if(boxNumber >= boxCount)
                    break;
                containerNumber++;
                System.out.println("Контейнер " + containerNumber + ":");
                for (int a = 0; a < 27; a++)
                {
                    boxNumber++;
                    System.out.println("Ящик " + boxNumber);
                    if(boxNumber >= boxCount)
                        break;
                }
            }
        }
    }
}
