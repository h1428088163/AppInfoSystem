package cn.appsys.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * String向Date转换的转换器
 * @author lenovo
 *
 */
public class StringToDateConverter implements Converter<String,Date>{
	private String datePattern;
	
	public StringToDateConverter(){}
	
	public StringToDateConverter(String datePattern){
		this.datePattern=datePattern;
	}
	@Override
	public Date convert(String source){
		Date date=null;
		try {
			date=new SimpleDateFormat(datePattern).parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
		
	}
}
