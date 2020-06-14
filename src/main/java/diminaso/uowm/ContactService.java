package diminaso.uowm;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	public List<Contact> listAll() {	
		return repo.findAll();
	}
	
	public void Save(Contact contact) {
		repo.save(contact);
	}

	public Contact get(Long id) {
		return repo.findById(id).get();
	}
	
	public void Delete(Long id) {
		repo.deleteById(id);
	}
}