package com.cris.chain_responsibility.code;

/**
 * 责任链模式测试类<br>
 * @author cris
 *
 */
public class App {

	public static void main(String[] args) {
		//构造请求
		Request request =  new Request();
		request.reqMsg = "被就业，<br>,:)";
		//构造响应
		Response res =  new Response();
		res.resMsg = "哈哈";
		
		//构造过滤器链
		FilterChain fc =new FilterChain();
		fc.addFilter(new SensitiveFilter())
		  .addFilter(new FaceFilter());
		//执行过滤器链
		fc.doFilter(request, res, fc);
		
		System.out.println("过滤后的请求信息:"+request.reqMsg);
		System.out.println("过滤后的响应信息:"+res.resMsg);
	}
	
}
