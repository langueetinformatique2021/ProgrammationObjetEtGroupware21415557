package atelier07;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.SimpleTimeZone;
import java.util.Date;

public class testGregorianCalendar {
	
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		 
		 String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
		
		 if (ids.length == 0)
		     System.exit(0);
		
		 System.out.println("Current Time");
		
		 SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
	
		 pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		 pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		
		 Calendar calendar = new GregorianCalendar(pdt);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);
	
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		                    + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		 System.out.println("DST_OFFSET: "
		                    + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

//calendar.get(Calendar.ERA)：表示纪元（公元前或公元后）。
//calendar.get(Calendar.YEAR)：当前年份。
//calendar.get(Calendar.MONTH)：当前月份（从 0 开始）。
//calendar.get(Calendar.WEEK_OF_YEAR)：当前年份中的第几周。
//calendar.get(Calendar.DATE)：当前日期。
//calendar.get(Calendar.DAY_OF_MONTH)：当前日期是当月的第几天。
//calendar.get(Calendar.DAY_OF_WEEK)：星期几（1 - 7，1 是星期天）。
//calendar.get(Calendar.AM_PM)：AM 或 PM。
//calendar.get(Calendar.HOUR)：12 小时制的小时数。
//calendar.get(Calendar.HOUR_OF_DAY)：24 小时制的小时数。
//calendar.get(Calendar.MINUTE)：分钟。
//calendar.get(Calendar.SECOND)：秒。
//calendar.get(Calendar.MILLISECOND)：毫秒。
//calendar.get(Calendar.ZONE_OFFSET)：时区偏移量（单位为毫秒）。
//calendar.get(Calendar.DST_OFFSET)：夏令时偏移量（单位为毫秒）	
		 System.out.println("Current Time, with hour reset to 3");
		 calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
		 calendar.set(Calendar.HOUR, 3)
//这段代码清除 calendar 中的小时字段，然后设置小时为 3，接着打印当前时间的各个字段。
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		        + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
		 System.out.println("DST_OFFSET: "
		        + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
	}
	\\

}