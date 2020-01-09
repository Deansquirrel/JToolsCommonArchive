package com.yuansong.tools.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/***
 * 普通工具类
 * @author yuansong6@163.com
 *
 */

public class CommonTool {
	/***
	 * 字符串MD5计算
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 */
	public String Md5Encode(byte[] data) throws NoSuchAlgorithmException, UnsupportedEncodingException{
	    MessageDigest md5 = null;	    
        md5 = MessageDigest.getInstance("MD5");
		
//		byte[] byteArray = null;
//		byteArray = data.getBytes("UTF-8");		
//		byte[] md5Bytes = md5.digest(byteArray);
        
		byte[] md5Bytes = md5.digest(data);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
		    int val = ((int) md5Bytes[i]) & 0xff;
		    if (val < 16) {
		        hexValue.append("0");
		    }
		    hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString().toUpperCase();
	}
	
	/***
	 * GUID
	 * @return
	 */
	public String UUID() {
		return  java.util.UUID.randomUUID().toString().toUpperCase();
	}
	 
}
