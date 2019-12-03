import java.text.SimpleDateFormat;
import java.util.Calendar;

//File name matches EXACTLY with class name
public class Basics {
    //main method ALWAYS looks EXACTLY like this
    public static void main(String[] args){
        System.out.println("Hello, Java!");
        Calendar cal = Calendar.getInstance();
        String currentMonth = new SimpleDateFormat("MMMM").format(cal.getTime());
        System.out.println(isItSalmonSeason(currentMonth));

        String myName = "Ryan";


        //arrays in java are super basic.  start with fixed length. 

        //option 1
        String[] names = new String[3];
        names[0] = "Ryan";
        names[1] = "David";
        names[2] = "Jon";

        //option 2 
        String[] namesTwo = new String[]{"Ryan", "David", "Jon"};

        for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
        }

        for (String name : names){
        System.out.println(name);
        }
    }

    public static boolean isItSalmonSeason(String month){
        //salmon season between july - august, using december(current) to confrim true
        // == works well for primitives ONLY
        // .equals() works for everthing else
        if (month.equals("July") || month.equals("August") || month.equals("December")){
            return true;
        } else {
            return false;
        }
    }
}