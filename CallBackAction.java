package application;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class CallBackAction {
    public static String orderDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return formatter.format(date); 

    }

    public static String orderDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date = new Date();  
        return formatter.format(date); 
    
    }
}