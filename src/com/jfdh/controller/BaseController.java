package com.jfdh.controller;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础控制器，其他控制器需extends此控制器获得initBinder自动转换的功
 * 
 * @author
 * 
 */
@Controller
@RequestMapping("/baseController")
public abstract class BaseController {

	private static final Logger logger = Logger.getLogger(BaseController.class);

	/**
	 * 将前台传递过来的日期格式的字符串，自动转化为Date类型
	 * 
	 * @param binder
	 * 
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		// dateFormat.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(
//				dateFormat, true));
		// binder.registerCustomEditor(String.class, new
		// StringTrimmerEditor(false));
	}

	public String getBusinessTableName() {
		return "BASE";
	}

	public String getOperateModel() {
		return "基础模块";
	}

}
