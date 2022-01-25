
public class Lab2_qn3 {
    public static void main(String[] args) {

        double totalMilliseconds = System.currentTimeMillis();
        double totalSeconds = totalMilliseconds / 1000;
        double currentSecond = totalSeconds % 60;
        double totalMinutes = totalSeconds / 60;
        double currentMinute = totalMinutes % 60;
        double totalHours = totalMinutes / 60;
        double currentHour = totalHours % 24;
        
        System.out.println("Current time is " + (int)(currentHour) + ":" + (int)(currentMinute) +
         ":" + (int)(currentSecond) + " GMT");
    }
    
    

}
