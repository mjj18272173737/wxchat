package com.zhidi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/test")
	public Map<String, Object> test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		return map;
	}
}
