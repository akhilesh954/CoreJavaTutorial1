package CoreJavaTraing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CruentDatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Date d=new Date();
  SimpleDateFormat df=new SimpleDateFormat("M/d/YYY");
  SimpleDateFormat ff=new SimpleDateFormat("M/d/YYY hh:mm:ss");
  
  System.out.println(df.format(d));
  System.out.println(ff.format(d));
  
  System.out.println(d.toString());
	}

}
