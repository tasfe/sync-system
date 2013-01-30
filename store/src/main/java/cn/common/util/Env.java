package cn.common.util;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 获取容器对象
 * @author Hover
 */
public class Env {
	private ServletContext context;	
	/**
	 * 获取SPRING容器
	 * @return
	 */
	private WebApplicationContext getWebApplicationContext(){
		return WebApplicationContextUtils.getWebApplicationContext(context);
	}
	/**
	 * 获取容器对象
	 * @param clazz
	 * @return
	 */
	public <T> T getBean(Class<T> clazz){
		return getWebApplicationContext().getBean(clazz);
	}
	
	public ServletContext getContext() {
		return context;
	}
	public void setContext(ServletContext context) {
		this.context = context;
	}
}
