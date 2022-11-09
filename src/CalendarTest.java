import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar getData = Calendar.getInstance();
        int day = getData.get(Calendar.DAY_OF_MONTH);
        int month = getData.get(Calendar.MONTH);
        int year = getData.get(Calendar.YEAR);
        System.out.println(month);
        System.out.println(day);
        System.out.println(year);
        System.out.println(getData.getTime());



    }
}
