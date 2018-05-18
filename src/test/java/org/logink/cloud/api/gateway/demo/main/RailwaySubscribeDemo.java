package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
* logink cloud gateway api demo 
* github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master
*/
public class RailwaySubscribeDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/message/sms/sendSms";
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
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

