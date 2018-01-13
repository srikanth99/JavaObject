package SwitchCase;

/**
 * Created by User on 27/11/2016.
 */
public class Day_Selection {
    public static void main(String args[]) {
        Day_Selection ds = new Day_Selection();
        ds.selectDay("Monday");
    }
    public void selectDay(String dayName){
       switch (dayName){

           case "Sunday":
               System.out.println("Shilpa dont want to come to class");

           case "Monday":
               System.out.println("Krishh wants day off");

           case "Tuesday":
               System.out.println("Bhavani wants to follow the schedule");

           case "Wedday":
               System.out.println("Just an another day");

           case "Thursday":
               System.out.println("Hiren wants to plan weekend");
                break;
           case "Friday":
               System.out.println("Bindu dont want to cook");

           case "Saturday":
               System.out.println("Relax Time, Pubbing Time, Party Time");

       }
    }



}
