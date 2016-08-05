package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
                Date date=sdf.parse(args[0]);
                System.out.println(date);
        }catch(ParseException e){
                e.printStackTrace();
        }
    }
}
