import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
    Timer timer;

    public Reminder(int hour, int min) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, 0);
        Date time = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), time);

    }
    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Lejárt az idő!");
            timer.cancel(); //A timer szál megszüntetése}
        }
    }
    public static void main(String args[]) {
        new Reminder(15, 37);
        System.out.println("Munka ütemezve.");

    }
}
