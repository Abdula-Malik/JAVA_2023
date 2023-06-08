import java.io.IOException;

public class Switch {
    public static void main(String[] args) {
//        int month = 4; //апрель
//        String season;
//
//        switch (month){
//            case 12:
//            case 1:
//            case 2:
//                season =  "зима";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                season = "весна";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                season = "лето";
//            case 9:
//            case 10:
//            case 11:
//                season = "осень";
//                break;
//            default: season = "несуществующий месяц";
//
//
//        }
//        System.out.println("Апрель - это " + season + ".");

        int [] nums  =  {  1, 2, 3, 4, 5, 6,  7, 8, 9, 10  } ;
        int sum  =  0;
        for (int i=0 ;  i  <  10 ;  i++)  sum += nums [i];
        System.out.println(sum);

    }
}



