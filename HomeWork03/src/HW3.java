import java.util.Scanner;



public class HW3 {
    public static void main(String[] args)
    {
        System.out.println("***** Please, input the day of the week ***** ");

        String[][] sched = new String[7][2];
        sched [0][0] = "Monday";
        sched [0][1] = "Got to Work";
        sched [1][0] = "Tuesday";
        sched [1][1] = "Got to Work then  go to meeting";
        sched [2][0] = "Wednesday";
        sched [2][1] = "Do Homework";
        sched [3][0] = "Thursday";
        sched [3][1] = "Meet your friends";
        sched [4][0] = "Friday";
        sched [4][1] = "Go to picnic";
        sched [5][0] = "Satuday";
        sched [5][1] = "Enjoy your weekend";
        sched [6][0] = "Sunday";
        sched [6][1] = "Go to Holiday";



        boolean check = true;
        while(check){
            Scanner scan = new Scanner (System.in);
            String day = scan.nextLine();
            String strreplace = day.replaceAll("\\s", "");
            strreplace = strreplace.toLowerCase();
            strreplace = strreplace.substring(0, 1).toUpperCase() + strreplace.substring(1).toLowerCase();



            switch(strreplace){
                case "Monday":
                    System.out.println("Your task for Monday: " + sched[0][1]);
                    break;
                case "Tuesday":
                    System.out.println("Your task for Tuesday: " + sched[1][1]);
                    break;
                case "Wednesday":
                    System.out.println("Your task for Wednesday: " + sched[2][1]);
                    break;
                case "Thursday":
                    System.out.println("Your task for Thursday: " + sched[3][1]);
                    break;
                case "Friday":
                    System.out.println("Your task for Friday: " + sched[4][1]);
                    break;
                case "Saturday":
                    System.out.println("Your task for Saturday: " + sched[5][1]);
                    break;
                case "Sunday":
                    System.out.println("Your task for Sunday: " + sched[6][1]);
                    break;
                case "EXIT":
                    check = false;
                default:
                    System.out.println("Sorry, I don't understand you, please try again!");
            }
        }
    }
}