package project.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Miracle on 2017/3/26.
 */
public class FDate {

    public static String getNowDate(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
