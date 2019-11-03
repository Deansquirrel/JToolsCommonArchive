package com.yuansong.tools.common;

/***
 * 转换工具类
 * @author yuansong6@163.com
 *
 */

public class ConversionTool {

	/***
	 * 
	 * @param date
	 * @return
	 */
	public java.util.Date ConvertSqlDateToUtilDate(java.sql.Date date){
		return new java.util.Date(date.getTime());
	}
	
	/***
	 * 
	 * @param date
	 * @return
	 */
	public java.sql.Date ConvertUtilDateToSqlDate(java.util.Date date){
		return new java.sql.Date(date.getTime());
	}
}
