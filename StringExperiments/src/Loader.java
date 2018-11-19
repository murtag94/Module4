
public class Loader
{
    public static int beginIndex;
    public static int andIndex;

    public static void main(String[] args)
    {
        String text = "Катя заработала 5001 рубль, Петя - 7563 рубля, а Маша - 30301 рубль";

        String earned = " заработал";
        String line = " - ";
        String rubl = " рубл";
        String conjunction = " а ";

        beginIndex = text.indexOf(" ", text.indexOf(earned) + earned.length());
        andIndex = text.indexOf(rubl);
        String fragment1 = text.substring(beginIndex, andIndex);

        beginIndex = text.lastIndexOf(line) + line.length();
        andIndex = text.lastIndexOf(rubl);
        String fragment2 = text.substring(beginIndex, andIndex);

        String firstName = text.substring(0, text.indexOf(" "));
        String secondName = text.substring(text.indexOf(conjunction) + conjunction.length(), text.lastIndexOf(line));

        int sum = Integer.parseInt(fragment1.trim()) + Integer.parseInt(fragment2.trim());
        System.out.println(firstName.trim() + " и " + secondName.trim() + " заработали: " + sum + " руб.");
    }
}