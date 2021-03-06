package com.jfdh.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FloderHelper {
	private static int weeks = 0;  
	  
	// 获得当前日期与本周一相差的天数  
	private int getMondayPlus() {  
	    Calendar cd = Calendar.getInstance();  
	    // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......  
	    int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK);  
	    if (dayOfWeek == 1) {  
	        return -6;  
	    } else {  
	        return 2 - dayOfWeek;  
	    }  
	}  
	  
	// 获得上周星期一的日期  
	public String getPreviousMonday() {  
	    weeks--;  
	    int mondayPlus = this.getMondayPlus();  
	    GregorianCalendar currentDate = new GregorianCalendar();  
	    currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);  
	    Date monday = currentDate.getTime();  
	    DateFormat df = DateFormat.getDateInstance();  
	    String preMonday = df.format(monday);  
	    return preMonday;  
	}  
	  
	// 获得本周星期一的日期  
	public String getCurrentMondayBak() {  
	    weeks = 0;  
	    int mondayPlus = this.getMondayPlus();  
	    GregorianCalendar currentDate = new GregorianCalendar();  
	    currentDate.add(GregorianCalendar.DATE, mondayPlus);  
	    Date monday = currentDate.getTime();  
	    DateFormat df = DateFormat.getDateInstance();  
	    String preMonday = df.format(monday);  
	    return preMonday;  
	} 
	
	// 获得本周星期一的日期  
	public String getCurrentMonday() {  
	    weeks = 0;  
	    int mondayPlus = this.getMondayPlus();  
	    GregorianCalendar currentDate = new GregorianCalendar();  
	    currentDate.add(GregorianCalendar.DATE, mondayPlus);  
	    Date monday = currentDate.getTime();  
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
	    String preMonday = df.format(monday);  
	    return preMonday;  
	} 
	  
	// 获得下周星期一的日期  
	public String getNextMonday() {  
	    weeks++;  
	    int mondayPlus = this.getMondayPlus();  
	    GregorianCalendar currentDate = new GregorianCalendar();  
	    currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);  
	    Date monday = currentDate.getTime();  
	    DateFormat df = DateFormat.getDateInstance();  
	    String preMonday = df.format(monday);  
	    return preMonday;  
	}  
	  
	// 获得相应周的周日的日期  
	public String getSunday() {  
	    int mondayPlus = this.getMondayPlus();  
	    GregorianCalendar currentDate = new GregorianCalendar();  
	    currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks + 6);  
	    Date monday = currentDate.getTime();  
	    DateFormat df = DateFormat.getDateInstance();  
	    String preMonday = df.format(monday);  
	    return preMonday;  
	}  
}
