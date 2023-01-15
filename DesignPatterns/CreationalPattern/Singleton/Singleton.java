package DesignPatterns.CreationalPattern.Singleton;
public class Singleton {

   public static void main(String[] args) throws InterruptedException {
       ScheduleRequest meh = new ScheduleRequest("Ms.Mehzabin");
       ScheduleRequest haque = new ScheduleRequest("Mr.Haque");
       ScheduleRequest sultana = new ScheduleRequest("Ms.Sultana");

       meh.currentSchedule();
       haque.currentSchedule();
       sultana.currentSchedule();

   }

    
}
