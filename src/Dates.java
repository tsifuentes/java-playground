import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("E MMMM yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat df4 = new SimpleDateFormat("E dd 'of' MMMM 'of' yyyy");
        String dateText = df.format(date);
        String dateText2 = df2.format(date);
        String dateText3 = df3.format(date);
        String dateText4 = df4.format(date);
        System.out.println("dateText = " + dateText);
        System.out.println("dateText = " + dateText2);
        System.out.println("dateText = " + dateText3);
        System.out.println("dateText = " + dateText4);

        getTime();

        System.out.println("=======");
        calendar();
        parseStringDate();
    }

    public static void getTime(){
        Date dateStart = new Date();
        System.out.println("dateStart = " + dateStart);
        long time = 0;
        for (int i = 0; i <= 1000000; i++) {
            time += i;
        }
        Date dateEnd = new Date();
        System.out.println("dateEnd = " + dateEnd);
        long latency = dateEnd.getTime() - dateStart.getTime();
        System.out.println("time = " + time);
        System.out.println("latency = " + latency);
    }

    public static void calendar(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        Date date = calendar.getTime();
        System.out.println("calendar.getTime() = " + date);

        calendar.set(2021, 0, 12, 20, 12, 20);
        System.out.println("calendar.getTime() = " + calendar.getTime());

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.MILLISECOND, 100);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("calendar.getTime() = " + calendar.getTime());
        String dateLast = df.format(calendar.getTime());
        System.out.println("date 24H = " + dateLast);

        calendar.set(Calendar.HOUR, 9);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        System.out.println("calendar.getTime() = " + calendar.getTime());
        String dateLast2 = df.format(calendar.getTime());
        System.out.println("date 12H = " + dateLast2);
    }

    public static void parseStringDate(){
        Scanner s = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Enter a date with format 'yyyy-MM-dd': ");
        try {
            Date date = df.parse(s.next());
            System.out.println("date = " + date);
            System.out.println("df.format(date) = " + df.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
