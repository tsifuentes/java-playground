import java.text.SimpleDateFormat;
import java.util.Date;

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
}
