package Store;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookStore")
public class BookStoreController {
	
	
	@RequestMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("book", new BookStore());
		return "book-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(
						@Valid @ModelAttribute("book")BookStore theBookStore,
						BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "book-form";
		}else {
			return "book-confirmation";
		}
	}
}
