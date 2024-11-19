public class TimeCalc {
    public static void main(String[] args) {
        // מוציא מקלט של שעות בנוסח - 24  את האינטגר של הדקות והשעות
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int total_minutes = (hours * 60) + minutes + minutesToAdd;
        int total_hours = total_minutes / 60;
        int newhours = total_hours % 24;
        int newmins = total_minutes - (total_hours *60);
        String print_h = "";
        String print_m = "";
        if (newhours < 10) {
            print_h = "0" + newhours;
        }
        else{
            print_h = "" + newhours;
        }
        if (newmins < 10) {
            print_m = "0" + newmins;
        }
        else{
            print_m = "" + newmins;
        }
        System.out.println(print_h + ":" + print_m);
    }
}
