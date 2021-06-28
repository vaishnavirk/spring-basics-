package springMVCdemof;

import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView  add(HttpServletRequest request, HttpServletResponse response) {
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i+j;
		
		// to pass the response we need to create model and view object 
		ModelAndView mv = new ModelAndView();
		//1
		mv.setViewName("display.jsp");
		
		//2
		mv.addObject("result",k);
		
//		return "display.jsp";
		
		// return mv object
		return mv;
	}

}
