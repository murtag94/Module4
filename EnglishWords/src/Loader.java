import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Once a month my family and I go to the cinema. It’s our tradition and favor-ite way to watch new movies. We begin to prepare in advance. We usually look for what movies are on and then discuss what movie to watch. My father prefers popular science films and my mother likes musicals. My sister watches a good love story with pleasure. And I enjoy detective films. We all like different genres, but we never argue with each other. We choose movie for the family, we need something pleasant, amusing and funny. My father usually books tickets before the show. Then I look forward to that evening when I turn out in the cinema. I like the experience of being there. Cinema inside has a special magic atmosphere. We take places in the comfortable chairs. My father buys caramel popcorn for my mum and sister, a coke for me and a bottle of water for himself. And we are ready for watching.";
        Pattern pattern = Pattern.compile("([A-Z]*[a-z]*(-|’)?[a-z]+)|[A-Z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())

        {
            System.out.println(matcher.group());
        }
    }
}
