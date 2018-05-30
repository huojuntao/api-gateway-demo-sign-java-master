package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
* logink cloud gateway api demo 
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master 下载
* 对应测试类： https://github.com/huojuntao/api-gateway-demo-sign-java-master/blob/master/src/test/java/org/logink/cloud/api/gateway/demo/main/RailwaySubscribeDemo.java
*/
public class RailwaySubscribeDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/railway-query/subscribe";
		//请求的body,json格式
		String body = "{\"taskId\":\"4028830b5f512c68015f512f22e40000\"," // 订阅标识符
				+ "\"railwayWagonNumber\":\"4936338\", " // 车号
				+ "\"containerNumber\":\"\"," // 集装箱箱号
				+ "\"shippingNodeNumber\":\"\"," // 运单号
				+ "\"invoiceNumber\":\"\"," // 货票号
				+ "\"placeOfDeparture\":\"\", " // 发站
				+ "\"destination\":\"\"," // 到达站
				+ "\"endDate\":\"2018-5-20\"}"; // 订阅截止时间
		try {
			// PostUtil封装了header设置和签名计算
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

