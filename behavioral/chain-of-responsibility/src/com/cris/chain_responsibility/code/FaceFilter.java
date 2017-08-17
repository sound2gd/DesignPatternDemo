package com.cris.chain_responsibility.code;
/**
 * 把:) 替换成-> ^_^
 * @author yuanyang
 *
 */
public class FaceFilter implements Filter{

	@Override
	public void doFilter(Request req, Response res, FilterChain fc) {
		req.reqMsg=req.reqMsg.replace(":)", "^_^ -----Face req");
		fc.doFilter(req, res, fc);
		res.resMsg = res.resMsg.concat(" ---Face res");
	}

}
