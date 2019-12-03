import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.time.LocalDateTime;

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

        System.out.println("------------------------------------------------------------------");

        System.out.println(pluralize("cat", -1));
        flipNHeads(4);
        clock();
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

    //feature #1 lab 1
    public static String pluralize(String word, int count){
        //should return plural for everything but 1 and -1, including 0
        if (count == 1 || count == -1){
            return word;
        } else {
            return word + "s";
        }
    }

    //feature #2 lab 1
    public static void flipNHeads(int headFlipsInARow){
        Random r = new Random();
        int flips = 0;
        int heads = 0;
        while (heads < headFlipsInARow){
            flips++;
            double flip = r.nextDouble();
            if (flip < .5){
                heads = 0;
                System.out.println("tails");
            } else {
                heads++;
                System.out.println("heads");
            }
        }
        System.out.println("It took " + flips + " flips to flip " + headFlipsInARow + " heads in a row.");
    }
}