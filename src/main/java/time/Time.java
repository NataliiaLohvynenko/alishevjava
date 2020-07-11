package time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Time {

    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.HOURS);
        System.out.println(localDateTime.toString());


        Calendar csl = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(csl.getTime()));
        System.out.println(csl.getTime());
}
}
