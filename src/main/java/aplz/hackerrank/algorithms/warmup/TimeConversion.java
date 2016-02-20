package aplz.hackerrank.algorithms.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeConversion {


    public static String sample = "07:05:45PM";

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(sample);
        String time = in.next();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = dateFormat.parse(time);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        System.out.printf("%02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
    }
}
