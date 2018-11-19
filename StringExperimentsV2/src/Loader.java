
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String fragments[] = text.split("\\s*,\\s*");
        int fragmentsCount = fragments.length;
        int sum = 0;
        for(int i = 0; i < fragmentsCount; i++)
        {
            fragments[i] = fragments[i].replaceAll("[^0-9]+", "");
            sum += Integer.parseInt(fragments[i]);
        }

        System.out.println("Общий зароботок ребят: " + sum + " руб.");
    }
}