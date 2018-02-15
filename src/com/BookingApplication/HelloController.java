package com.BookingApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//public class HelloController extends AbstractController{

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, 
//			HttpServletResponse arg1) throws Exception {
//		// TODO Auto-generated method stub
//		
//		
//		ModelAndView modelandView = new ModelAndView("HelloPage");
//		modelandView.addObject("welcomeMessage", "Hi user welcome to first Spring MVC application");
//	
//		return modelandView;
//	}
	
//}


	@Controller
	public class HelloController {
		
		
		@RequestMapping("/welcome")
		public ModelAndView helloworld() {
			ModelAndView modelandView = new ModelAndView("HelloPage");
			modelandView.addObject("welcomeMessage", "Hi user welcome to first Spring MVC application");
			return modelandView;
		}
	}


