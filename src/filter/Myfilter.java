package filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Myfilter
 */
public class Myfilter implements Filter {

 
    public Myfilter() {
        System.out.println("第一个过滤器的构造方法");
    }

	
	public void destroy() {
		System.out.println("第一个过滤器的destroy方法");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("第一个过滤器的业务方法（doFilter）拦截");
		chain.doFilter(request, response);
		System.out.println("第一个过滤器的业务方法（doFilter）放行");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("第一个过滤器的init方法");
		
		Enumeration<String> en =  fConfig.getInitParameterNames();
		while(en.hasMoreElements()){
			String name = en.nextElement();
			String value = fConfig.getInitParameter(name);
			System.out.println(name+"   "+value);
		}
	}

}
