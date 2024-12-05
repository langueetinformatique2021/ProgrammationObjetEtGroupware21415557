package atelier07;

import java.util.Calendar;
//导入了 Calendar 类
import java.text.SimpleDateFormat;
//导入了 SimpleDateFormat 类
public class DateTimeDisplay {

 public static void displayDateTime() {
//公共的静态方法 displayDateTime()
	  TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
      Calendar calendar = Calendar.getInstance();
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
      System.out.println("Current Date: " + dateFormat.format(calendar.getTime()));
      System.out.println("Current Time: " + timeFormat.format(calendar.getTime()));
  }

  public static void main(String[] args) {
	  displayDateTime();
  }\\
}