package diminaso.uowm;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class FindContactByNameTest {
	@Autowired
	private ContactRepositoryJunit repo;
	
	@Test
	@Rollback(false)
	public void testFindContactByName() {
		String name = "Thanos";
		ContactJunit contact1 = repo.findByName(name);
		assertThat(contact1.getName()).isEqualTo(name);
	}
	
	@Test
	@Rollback(false)
	public void testFindContactByName2() {
		String name = "dfgfdgsfghfsh";
		ContactJunit contact2 = repo.findByName(name);
		assertThat(contact2.getName()).isEqualTo(name);
	}
}
