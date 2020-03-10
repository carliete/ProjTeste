package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.concurrent.TimeUnit;

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
	@Disabled
	void test() {
		User user = new User("user", "pass");
		assertEquals(admin, user.user);
		assertEquals(admin2, user.pass);

	}

	@Test
	@Disabled
	void test2() {
		// Se a pagina tiver uma descri��o gera um erro
		Pagina pag = new Pagina("blog", null);
		assertNull(pag.descri, "Descricao inserida");

	}

	@Test
	@Disabled
	void testExpectedException() {
		// Caso a pessoa digite um numero no nome gera erro
		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt(nome);
		});
	}

	@Test
	@Disabled
	void testNotEquals() {
		//Retorna erro se tiver duas paginas com o mesmo nome
		Pagina pagi = new Pagina("Blog", "a");
		assertNotEquals(pagi.nome, nova, "Pagina J� existente");
	}
	
	@Test 
	@BeforeEach
	@Disabled
	void testeBefore() {
		
	}
	
	@Test 
	@AfterEach
	void testAfter() {
		
		
	}
	
	
	/*
	 * @BeforeAll public static void testeBeforeAll() { // Testar se a conne��o com
	 * o banco de dados foi Aberta
	 * System.out.println("Iniciei a conexão com o banco de dados"); }
	 * 
	 * @AfterAll public static void testeAfterAll() { // Testar se a conne��o com o
	 * banco de dados foi fechada
	 * System.out.println("Fechou a conexão com o banco de dados"); }
	 */
	
	@Test 
	@Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
	void testeTime() throws InterruptedException {
		//Se o salvamento passar do limite de tempo
		//wait(700);
		User user = new User (admin, admin2);
		System.out.println(user);
		
	}
	
	
}
