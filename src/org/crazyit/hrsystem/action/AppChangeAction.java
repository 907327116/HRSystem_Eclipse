package org.crazyit.hrsystem.action;

import org.apache.struts2.ServletActionContext;
import org.crazyit.hrsystem.action.base.EmpBaseAction;
import org.crazyit.hrsystem.domain.AttendType;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
	
	// �����춯�ĳ���ID
	private int attId;
	
	
	public int getAttId() {
		return attId;
	}
	public void setAttId(int attId) {
		this.attId = attId;
	}
	// ��װ�����춯���б�
	private List<AttendType> types;
	// types��setter��getter����
	public void setTypes(List<AttendType> types)
	{
		this.types = types;
	}
	public List<AttendType> getTypes()
	{
		return this.types;
	}
	// �����û�����
	public String execute()
		throws Exception
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String attId = request.getParameter("attId");
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
}