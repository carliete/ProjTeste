package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import testeAgora.User;

class PersonTeste {

	private String admin = "user";
	private String admin2 = "pass";

	@Test
	void test() {
		User user = new User("user", "pass");
		assertEquals(admin, user.user);
		assertEquals(admin2, user.pass);
		
	}

}
