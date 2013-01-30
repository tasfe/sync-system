package cn.common.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Hover
 *
 */
public class EnvFilter implements Filter{
	ServletContext context;
	
	@Override
	public void destroy() {
		SpringUtil.removeEnv();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		Env env = SpringUtil.getEnv();
		try{
			env.setContext(context);
			filterChain.doFilter(request, response);
		}finally{
			SpringUtil.removeEnv();
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		context = filterConfig.getServletContext();
	}

}
