//package com.sssp.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
//		auth.inMemoryAuthentication().withUser("user").password("password").roles("ROLE_USER");
//	}   
//	
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		  http
//          .authorizeRequests()
//          .antMatchers("/").permitAll()//根目录和(!登录页面不进行拦截)登录页面不拦截就会有诡异的问题
//          .anyRequest().authenticated()
//          .and()
//          .formLogin()
//          .loginPage("/login")//未登录用户拦截跳转到的路径
//          .defaultSuccessUrl("/emps")//登录成功后的路径
//          .permitAll();
////          .and()
////          .logout()
////          .permitAll().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))//定义注销页面
////          .logoutSuccessUrl("/login").permitAll().logoutSuccessHandler(logoutSuccessHandler());
//    }
//	
//	
// 
//
//	
//	
//
//}
