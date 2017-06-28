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
	
	/*获取当前用户名*/
	public String getCurrentUsername() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}


}


/*
 * 
 * Authentication 是一个接口，用来表示用户认证信息的， 在用户登录认证之前相关信息会封装为一个 Authentication
 * 具体实现类的对象，在登录认证成功之后又会生成一个信息更全面， 包含用户权限等信息的 Authentication 对象， 然后把它保存在
 * SecurityContextHolder 所持有的 SecurityContext 中，供后续的程序进行调用，如访问权限的鉴定等。
 * 
 * Spring Security 使用一个 Authentication 对象来描述当前用户的相关信息。SecurityContextHolder
 * 中持有的是当前用户的 SecurityContext，而 SecurityContext 持有的是代表当前用户相关信息的 Authentication
 * 的引用。这个 Authentication 对象不需要我们自己去创建，在与系统交互的过程中，Spring Security 会自动为我们创建相应的
 * Authentication 对象，然后赋值给当前的 SecurityContext。
 * 
 * 
 * 
 */
