package diminaso.uowm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DeleteContactTest {
	@Autowired
	private ContactRepositoryJunit repo;
	
	@Test
	@Rollback(false)
	public void testCreateContact() {
		long id = 191;
		boolean isExistBeforeDelete = repo.findById(id).isPresent();
		repo.deleteById(id);
		boolean notExistAfterDelete = repo.findById(id).isPresent();
		assertTrue(isExistBeforeDelete);
		assertFalse(notExistAfterDelete);
	}
}