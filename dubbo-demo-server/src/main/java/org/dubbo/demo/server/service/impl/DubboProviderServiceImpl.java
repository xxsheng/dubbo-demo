/**
 * 
 */
package org.dubbo.demo.server.service.impl;

import org.dubbo.demo.api.DubboProviderService;

import com.alibaba.dubbo.config.annotation.Service;

/** 

* @author xiaxiuqiang

* @date 创建时间：2019年2月21日 下午3:45:27 

* 

*/
@Service
public class DubboProviderServiceImpl implements DubboProviderService {

	/* (non-Javadoc)
	 * @see org.dubbo.demo.api.DubboProviderService#sayHello()
	 */
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello dubbo!!!";
	}

}
