/* Web controller handles HTTP requests
 * One can identify these requests by the @Controller annotation
 * GreetingController handles GET requests for /greeting by
 * returning the name of a View, "greeting", which is responsible
 * for rendering HTML content
 */

package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	//@RequestMapping(method=GET) // Narrows mapping to the HTTP operation GET
	
	@RequestMapping("/greeting") // Ensures that HTTP requests to /greeting are mapped to the greeting() method
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	
	/* @RequestParam binds the value of the query String parameter name into the name parameter of greeting()
	 * The query String parameter is not required though; if it's absent in the request, the defaultValue of
	 * "World" is used. The value of the name parameter is added to a Model object, ultimately making it
	 * accessible to the view template
	 * Implementation of the method body relies on a view technology, Thymeleaf, to perform server-side rendering
	 * of the HTML
	 */

		model.addAttribute("name", name);
		return "greeting";

	}

}