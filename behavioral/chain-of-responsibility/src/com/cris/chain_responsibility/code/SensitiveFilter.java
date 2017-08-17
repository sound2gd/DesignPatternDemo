package com.cris.chain_responsibility.code;
/**
 * 敏感词过滤器，把被就业过滤成就业
 * @author cris
 *
 */
public class SensitiveFilter implements Filter{

	@Override
	public void doFilter(Request req, Response res, FilterChain fc) {
		req.reqMsg = req.reqMsg.replace("被就业", "就业 ----Sensitive req");
		fc.doFilter(req, res, fc);
		res.resMsg = res.resMsg.concat(" ---Sensitive res");
	}
	
}
