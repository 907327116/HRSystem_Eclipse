package org.crazyit.hrsystem.action;

import org.apache.struts2.ServletActionContext;
import org.crazyit.hrsystem.action.base.EmpBaseAction;
import org.crazyit.hrsystem.domain.AttendType;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

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
public class AppChangeAction extends EmpBaseAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 申请异动的出勤ID
	private int attId;
	
	
	public int getAttId() {
		return attId;
	}
	public void setAttId(int attId) {
		this.attId = attId;
	}
	// 封装所有异动的列表
	private List<AttendType> types;
	// types的setter和getter方法
	public void setTypes(List<AttendType> types)
	{
		this.types = types;
	}
	public List<AttendType> getTypes()
	{
		return this.types;
	}
	// 处理用户请求
	public String execute()
		throws Exception
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String attId = request.getParameter("attId");
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
}