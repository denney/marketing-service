package com.wondertek.baiying.marketing.web.rest;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

	final static String resCode="0000";
	final static String resMessage="success";
	Map<String, Object> resMap;
	
	public BaseController() {
		resMap=new HashMap<String, Object>();
		resMap.put("resCode", resCode);
		resMap.put("resMessage", resMessage);
	}
}
