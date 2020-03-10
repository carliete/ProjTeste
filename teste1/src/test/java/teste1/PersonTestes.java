package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import testeAgora.Pagina;
import testeAgora.User;

class PersonTestes {

	private String admin = "user";
	private String admin2 = "pass";
	private String nome = "nome";
	private String nova = "Site";

	@Test
	void test() {
		User user = new User("user", "pass");
		assertEquals(admin, user.user);
		assertEquals(admin2, user.pass);

	}

	@Test
	void test2() {
		// Se a pagina tiver uma descrição gera um erro
		Pagina pag = new Pagina("blog", null);
		assertNull(pag.descri, "Descricao inserida");

	}

	@Test
	void testExpectedException() {
		// Caso a pessoa digite um numero no nome gera erro
		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt(nome);
		});
	}

	@Test
	void testNotEquals() {
		//Retorna erro se tiver duas paginas com o mesmo nome
		Pagina pagi = new Pagina("Blog", "a");
		assertNotEquals(pagi.nome, nova, "Pagina Já existente");
	}
	
	@Test 
	@BeforeEach
	void testeBefore() {
		
	}
	
	@Test 
	@AfterEach
	void testAfter() {
		
	}
	
	@Test 
	@BeforeAll
	void testeBeforeAll() {
		
	}
	@Test 
	@AfterAll
	void testeAfterAll() {
		
	}
	
	@Test 
	@Timeout(value = 0)
	void testeTime() {
		
	}
	
	
}
