package com.cris.chain_responsibility.code;
/**
 * 过滤器接口<br>
 * 用来过滤信息
 * @author cris
 *
 */
public interface Filter {
	void doFilter(Request req,Response res,FilterChain fc);
}
