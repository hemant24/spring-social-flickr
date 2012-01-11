package org.springframework.social.flickr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.social.flickr.api.FlickrProfile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FlickrController extends AbstractController {
	private String message;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		FlickrProfile fp  = new FlickrProfile();
		System.out.println(fp);
		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
}