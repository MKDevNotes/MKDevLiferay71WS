package org.dn.osgi.helloworld.portlet;

import org.dn.osgi.helloworld.constants.DnHelloWorldPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Muthukumar Thangavinayagam
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=MKDevNotes",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DnHelloWorldPortletKeys.DnHelloWorld,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DnHelloWorldPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		
		System.out.println("HelloWorld Printed here.....");
		
		super.doView(renderRequest, renderResponse);
	}
}