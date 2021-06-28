package springMVCdemof;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
//	@RequestMapping("/add")
//	public ModelAndView  add(HttpServletRequest request, HttpServletResponse response) {
//		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
//		int k = i+j;
//		
//		// to pass the response we need to create model and view object 
//		ModelAndView mv = new ModelAndView();
//		//1
//		mv.setViewName("display");
//		
//		//2
//		mv.addObject("result",k);
//		
////		return "display.jsp";
//		
//		// return mv object
//		return mv;
//	}
	
	// EXAMPLE OF REQUESTPARAM
	
	@RequestMapping("/add")
	public ModelAndView  add(@RequestParam("t1") int i, @RequestParam("t1") int j) {
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i+j;
		
		// to pass the response we need to create model and view object 
		ModelAndView mv = new ModelAndView();
		//1
		mv.setViewName("display");
		
		//2
		mv.addObject("result",k);
		
//		return "display.jsp";
		
		// return mv object
		return mv;
	}
	
}
