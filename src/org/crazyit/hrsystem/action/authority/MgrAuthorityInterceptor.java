package org.crazyit.hrsystem.action.authority;

import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;

import org.crazyit.hrsystem.action.WebConstant;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MgrAuthorityInterceptor extends AbstractInterceptor
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation)
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的level属性
		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);
		// 如果level不为null，且level为mgr
		if ( level != null && level.equals(WebConstant.MGR_LEVEL))
		{
			return invocation.invoke();
		}
		return Action.LOGIN;
	}
}