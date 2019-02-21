/**
 * 
 */
package org.dubbo.demo.client.web;

import org.dubbo.demo.api.DubboProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author xiaxiuqiang
 * @date 创建时间：2019年2月21日 下午3:09:51
 * 
 */

@RestController
@RequestMapping("/test")
public class DubboTestController {

	@Reference
	private DubboProviderService dubboProviderService;

	@RequestMapping("/hello")
	public String sayHelloToDubbo() {
		return dubboProviderService.sayHello();
	}

}
