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
//          .antMatchers("/").permitAll()//��Ŀ¼��(!��¼ҳ�治��������)��¼ҳ�治���ؾͻ��й��������
//          .anyRequest().authenticated()
//          .and()
//          .formLogin()
//          .loginPage("/login")//δ��¼�û�������ת����·��
//          .defaultSuccessUrl("/emps")//��¼�ɹ����·��
//          .permitAll();
////          .and()
////          .logout()
////          .permitAll().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))//����ע��ҳ��
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
