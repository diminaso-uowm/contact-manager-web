package diminaso.uowm;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CreateContactTest {
	@Autowired
	private ContactRepositoryJunit repo;
	
	@Test
	@Rollback(false)
	public void testCreateContact() {
		ContactJunit contact1 = new ContactJunit("Dimitrios", "Nasoufis", "+301111111111", "+302222222222", "dimitris@nasoufis.com");
		ContactJunit contact2 = new ContactJunit("Thanos", "Apostolou", "+303333333333", "+304444444444", "thanos@apostolou.com");
		ContactJunit SavedContact1 = repo.save(contact1);
		ContactJunit SavedContact2 = repo.save(contact2);
		assertNotNull(SavedContact1);
		assertNotNull(SavedContact2);
	}
}