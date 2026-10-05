package com.crm.CustomerManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public String getDataAndTime(String pattern) {
		Calendar c=Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
		
	}
	public int getGeneratedRandomNumber(int number) {
		Random r=new Random();
		int data = r.nextInt(number);
		return data;
	}

}
