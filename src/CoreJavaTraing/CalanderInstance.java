package CoreJavaTraing;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Calendar cal=Calendar.getInstance();
 SimpleDateFormat df=new SimpleDateFormat("M/d/YYY hh:mm:ss");
System.out.println(df.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
System.out.println(cal.get(Calendar.AM_PM));
System.out.println(cal.get(Calendar.DAY_OF_WEEK));
System.out.println(cal.get(Calendar.MINUTE));
 
	}

}
