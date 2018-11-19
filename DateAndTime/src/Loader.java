import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EE", Locale.forLanguageTag("ENGLISH"));
        Calendar calendar = Calendar.getInstance();

        String fullDate = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        if(!Pattern.compile("([0-2][0-9]|3[0-1])[/.](0[1-9]|1[0-2])[/.](18|19|20)[0-9]{2}").matcher(fullDate).matches())
        calendar.set(1994, Calendar.JANUARY, 19);
        Calendar calendarCurrent = Calendar.getInstance();
        Date date;
        for(int i = 0; calendar.before(calendarCurrent); i++)
        {
            date = calendar.getTime();
            System.out.println(i + " - " + dateFormat.format(date));
            calendar.add(Calendar.YEAR, 1);
        }
    }
}
