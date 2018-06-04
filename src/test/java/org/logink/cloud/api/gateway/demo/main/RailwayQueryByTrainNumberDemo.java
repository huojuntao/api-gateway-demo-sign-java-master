package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
* logink cloud gateway api demo <br>
 *     北京铁路局车号查询接口
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master
* 对应测试类： org.logink.cloud.api.gateway.demo.main.RailwayQueryByTrainNumberDemo
*/
public class RailwayQueryByTrainNumberDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/railway-query/findByTrainNumber";
		//请求的body,json格式
		String body = "{\"railwayWagonNumber\": \"077916\"," +//车号，即铁路领货凭证或者货票上的“车号”
				"    \"shippingNodeNumber\": \"877602\"}"; // 运单号，即铁路领货凭证上的“运单号”
		try {
			// PostUtil封装了header设置和签名计算
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

