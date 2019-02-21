/**
 * 
 */
package org.dubbo.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/** 

* @author xiaxiuqiang

* @date 创建时间：2019年2月21日 下午3:54:30 

* 

*/
@SpringBootApplication
@EnableDubbo
public class DubboDemoClientApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(DubboDemoClientApplication.class);
	}

}
