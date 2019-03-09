
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author tzf
 * @DateTime 2019年3月6日 下午8:14:47
 * @Description: 
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/test")
	public String sayhello() {
		System.out.print("进来了");
		return "test";
	}
}
