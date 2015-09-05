package main.java.servlets.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PremiumFilter implements Filter {    
    
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpSession session = httpRequest.getSession();
            
            if ((Boolean) session.getAttribute("premium")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/main_menu.jsp");
		dispatcher.forward(request, response);
            }
            else {
                chain.doFilter(request, response);
            }
            
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
