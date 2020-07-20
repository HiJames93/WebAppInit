package cn.james.webapp_init.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String timeStamp(Date currentDate){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        return simpleDateFormat.format(currentDate);
    }
}
