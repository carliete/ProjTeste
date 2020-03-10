package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import testeAgora.Pagina;
import testeAgora.User;

class Teste {

	private String admin = "user";
	private String admin2 = "pass";

	@Test
	@Disabled
	void test() {
		User user = new User("user", "pass");
		assertEquals(admin, user.user);
		assertEquals(admin2, user.pass);

	}

	@Test
	void test2() {
		Pagina pag = new Pagina(null, "b");
		assertNull(pag.nome, "O nome da pagina não pode estar em branco");

	}
	
	@Test
	void testExpectedException() {
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt("azul");
	  });
	 
	}

}
