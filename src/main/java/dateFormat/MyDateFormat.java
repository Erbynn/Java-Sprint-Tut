
package dateFormat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MyDateFormat {
    public static void main(String[] args) {
//        Creating Date object
        Date today = new Date();

//        printing in default format
        System.out.println("The date is " + today);

//        ...in mm-dd-yy format
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");
        String formattedDate = sdf.format(today);
        System.out.println("Date : " + formattedDate);

//        ...in day, Month date, year
        sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        formattedDate = sdf.format(today);
        System.out.println("Date " + formattedDate);

//        ...in time hour:minute:sec
        sdf = new SimpleDateFormat("hh;mm;ss a");
        formattedDate = sdf.format(today);
        System.out.println("Time: " + formattedDate);

    }

}
