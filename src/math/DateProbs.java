package math;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProbs {

    public static void formatDate(String s) throws ParseException {
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        Date date = df.parse(s);
        System.out.println(out.format(date));
    }
}
