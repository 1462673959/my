package com.liushuai.util;

public class DateUtils {
	public static java.util.Date Datas2j(java.sql.Date date) {
		return new java.util.Date(date.getTime());
	}
	public static java.sql.Date Dataj2s(java.util.Date date) {
		return new java.sql.Date(date.getTime());
	}
}
