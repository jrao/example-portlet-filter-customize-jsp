package jrao.portlet.filter.customize.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.util.PortletKeys;

/**
 * @author jrao
 */
@Component(
	immediate = true,
	property = {
			"javax.portlet.name=" + PortletKeys.BLOGS
	},
	service = PortletFilter.class
)
public class BlogsRenderFilter implements RenderFilter {

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(RenderRequest request, RenderResponse response, FilterChain chain)
			throws IOException, PortletException {
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<p>Hello from Blogs portlet filter!</p>");
		
		chain.doFilter(request, response);
	}

}