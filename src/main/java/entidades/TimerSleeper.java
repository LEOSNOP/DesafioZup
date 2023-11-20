package entidades;

public class TimerSleeper {

    public static void timesleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){}
    }

}
