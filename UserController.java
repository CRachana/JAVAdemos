package successfailurelogin;

import main.model.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;import org.springframework.;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.postMapping;
import org.springframework.web.bind.annotation.Getmapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping(value="/aa")
	public String loadPage(Model model)
	{​​
	User user = new User();
	model.addAttribute("alias", user);
	return "login" ;
	}

	@GetMapping(value="*")
	public String fallBackMethod()
	{​​
	User user = new User();
	model.addAttribute("alias", user);
	return "dummy" ;​​
	}

	@PostMapping(value="/login")
	public ModelAndView loginFunction(@Valid @ModelAttribute("alias") User user, BindingResult result )
	{​​
	ModelAndView modelAndView;
	if(result.hasErrors())
	{​​
	return modelAndView = new ModelAndView("login");
	}
	if(use.getPassword().equals("welcome"))
		{
		modelAndView= new ModelAndView("loginsuccess");
		modelAndView.addObject("userKey" ,user);
		}​​
		else
		{
			modelAndView= new ModelAndView("failure");
			}
		}​ ​
}