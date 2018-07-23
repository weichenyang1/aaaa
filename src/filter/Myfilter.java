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
        System.out.println("��һ���������Ĺ��췽��");
    }

	
	public void destroy() {
		System.out.println("��һ����������destroy����");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("��һ����������ҵ�񷽷���doFilter������");
		chain.doFilter(request, response);
		System.out.println("��һ����������ҵ�񷽷���doFilter������");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("��һ����������init����");
		
		Enumeration<String> en =  fConfig.getInitParameterNames();
		while(en.hasMoreElements()){
			String name = en.nextElement();
			String value = fConfig.getInitParameter(name);
			System.out.println(name+"   "+value);
		}
	}

}
