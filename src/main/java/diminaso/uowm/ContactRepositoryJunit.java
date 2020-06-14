package diminaso.uowm;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepositoryJunit extends CrudRepository <ContactJunit, Long> {
	public ContactJunit findByName(String name);
}