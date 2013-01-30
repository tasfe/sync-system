package com.store.util;

import java.io.IOException;
import java.util.Properties;

public class QueryMap {

	private static Properties pro;
	static{
		pro = new Properties();
		try {
			pro.load(Class.class.getResourceAsStream("/query.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private QueryMap(){
		
	}
	
	public static String getSql(String sql){
		return pro.getProperty(sql);
	}
}
