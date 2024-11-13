public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        int minutestoadd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));
        int totalmins = hours*60 + minutes + minutestoadd;
        int futuremins = totalmins % 60;
        int futurehours = (totalmins-futuremins) / 60;
        if (futurehours >= 24) {
            futurehours -= 24;
        }
        String zero = "";
        if (futurehours < 10) {
            zero = "0";
        }
        System.out.println(zero + futurehours + ":" + futuremins);

    }
}
// for some reason my jdk bin path isnt showing up so this is a temporary fix for the session below:
// $env:PATH = "C:\Program Files\Java\jdk-23\bin;" + $env:PATH 