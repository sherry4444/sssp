package com.sssp.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
					throws IOException, ServletException {
		response.sendRedirect(request.getContextPath());
	}
	
	/*��ȡ��ǰ�û���*/
	public String getCurrentUsername() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}


}


/*
 * 
 * Authentication ��һ���ӿڣ�������ʾ�û���֤��Ϣ�ģ� ���û���¼��֤֮ǰ�����Ϣ���װΪһ�� Authentication
 * ����ʵ����Ķ����ڵ�¼��֤�ɹ�֮���ֻ�����һ����Ϣ��ȫ�棬 �����û�Ȩ�޵���Ϣ�� Authentication ���� Ȼ�����������
 * SecurityContextHolder �����е� SecurityContext �У��������ĳ�����е��ã������Ȩ�޵ļ����ȡ�
 * 
 * Spring Security ʹ��һ�� Authentication ������������ǰ�û��������Ϣ��SecurityContextHolder
 * �г��е��ǵ�ǰ�û��� SecurityContext���� SecurityContext ���е��Ǵ���ǰ�û������Ϣ�� Authentication
 * �����á���� Authentication ������Ҫ�����Լ�ȥ����������ϵͳ�����Ĺ����У�Spring Security ���Զ�Ϊ���Ǵ�����Ӧ��
 * Authentication ����Ȼ��ֵ����ǰ�� SecurityContext��
 * 
 * 
 * 
 */
