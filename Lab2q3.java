public class Lab2q3 {
    public static void main (String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/60;
        long Seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours % 24;

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + Seconds + " GMT");

    }
}