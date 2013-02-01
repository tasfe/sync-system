package com.store.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static final String DATE_STYLE1 = "YY/MM/DD hh:mm:ss";
	public static final String DATE_STYLE2 = "YY-MM-DD hh:mm:ss";
	
	private SimpleDateFormat sdf;
	
	public DateTimeUtil(){
		sdf = new SimpleDateFormat(DATE_STYLE1);
	}
	
	public void setDateStyle(String style){
		sdf = new SimpleDateFormat(style);
	}
	
	public String getCurrentDate(){
		return sdf.format(new Date(System.currentTimeMillis()));
	}
	
	public String getDateTimeByFormat(Date date){
		return sdf.format(date);
	}
}
