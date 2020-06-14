package diminaso.uowm;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class AppController {
	@Autowired
	private ContactService service;
	
	@RequestMapping("/")
	public String HomePage(Model model) {
		return "index";
	}
	
	@RequestMapping("/list")
	public String ContactsTable(Model model) {
		List<Contact> ListContacts = service.listAll();
		model.addAttribute("ListContacts", ListContacts);
		return "contacts_list";
	}

	@RequestMapping("/new")
	public String NewContact(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "new_contact";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String SaveContact(@ModelAttribute("contact") Contact contact) {
		service.Save(contact);
		return "redirect:/list";
	}
	
	@RequestMapping("/edit/id/{id}")
	public ModelAndView EditContact(@PathVariable(name = "id") long id) {
		ModelAndView edt = new ModelAndView("edit_contact");
		Contact contact = service.get(id);
		edt.addObject("contact", contact);
		return edt;
	}
	
	@RequestMapping("/delete/id/{id}")
	public String DeleteContact(@PathVariable(name = "id") Long id) {
		service.Delete(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/wishlist")
	public String WishListPage(Model model) {
		return "wishlist";
	}
	
	@RequestMapping("/about")
	public String AboutPage(Model model) {
		return "about";
	}
}