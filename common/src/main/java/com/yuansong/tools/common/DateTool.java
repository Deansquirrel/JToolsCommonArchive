package com.yuansong.tools.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/***
 * 日期工具类
 * @author yuansong6@163.com
 *
 */
public class DateTool {
	
	private DateTool() {}
	
	private static String _format = "yyyy-MM-dd HH:mm:ss";
	
	/***
	 * 按默认格式返回当前日期时间字符串
	 * @return
	 */
	public static String GetDateStr() {
		return GetDateStr(new java.util.Date());
	}
	
	/***
	 * 按默认格式返回指定日期时间字符串
	 * @param date
	 * @return
	 */
	public static String GetDateStr(java.util.Date date) {
		return GetDateStr(date,_format);
	}
	
	/***
	 * 按指定格式返回当前日期时间字符串
	 * @param format
	 * @return
	 */
	public static String GetDateStr(String format) {
		return GetDateStr(new java.util.Date(), format);
	}
	
	/***
	 * 根据指定格式返回日期时间字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String GetDateStr(java.util.Date date,String format) {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/***
	 * 根据字符串和按默认日志格式，返回日期
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date GetDateFromStr(String date) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat(_format);
		return sdf.parse(date);
	}
	
	/***
	 * 根据字符串和指定的日期格式，返回日期
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date GetDateFromStr(String date,String format) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(date);
	}
}
