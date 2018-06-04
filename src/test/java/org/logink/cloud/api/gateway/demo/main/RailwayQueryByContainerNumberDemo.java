package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
* logink cloud gateway api demo <br>
 *     北京铁路局箱号查询接口
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master
* 对应测试类： org.logink.cloud.api.gateway.demo.main.RailwayQueryByContainerNumberDemo
*/
public class RailwayQueryByContainerNumberDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/railway-query/findByContainerNumber";
		//请求的body,json格式
		String body = "{\"containerNumber\": \"077916\"}";//集装箱箱号
		try {
			// PostUtil封装了header设置和签名计算
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

