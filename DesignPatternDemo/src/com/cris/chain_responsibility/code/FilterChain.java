package com.cris.chain_responsibility.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链<br>
 * 过滤器链是责任链模式的核心，它保存着所有责任链的先后顺序<br>
 * 以及所有的过滤器
 * @author cris
 *
 */
public class FilterChain{
	//保存所有的过滤器
	private List<Filter> filters = new ArrayList<>();
	//保存当前执行到的过滤器的索引
	int index;
	
	/**
	 * 添加过滤器
	 * @param f 所要添加的过滤器
	 * @return 自己
	 */
	public FilterChain addFilter(Filter f){
		filters.add(f);
		return this;
	}
	
	public void doFilter(Request req, Response res, FilterChain fc) {
		if (index == filters.size()) return ;
		
		//取出过滤器
		Filter f =filters.get(index);
		index++;
		
		//执行过滤器链中的下一个过滤器
		f.doFilter(req, res, fc);
	}
	
}
