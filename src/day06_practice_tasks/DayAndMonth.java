package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {
        day(3);
        day(150);
        day(6);

    }



    public static void day (int dayOfWeek){

        String nameOfDay = "";
        switch(dayOfWeek){
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            case 7:
                nameOfDay = "Sunday";
                break;

            default:
                nameOfDay = "Invalid Day";
        }
        System.out.println("The day of the week is " + nameOfDay);

    }


}
