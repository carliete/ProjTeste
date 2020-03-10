package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
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
	
	private static boolean conexao;
	
	@Test
	@BeforeAll
	public static void testeBeforeAll() {
		// Testar se a conneção com o banco de dados foi Aberta
		conexao = true;
		Assumptions.assumeTrue(conexao,"Conexao não iniciada");
		System.out.println("Iniciei a conexÃ£o com o banco de dados");

	}
	
	
	@Test
	@AfterAll
	public static void testeAfterAll() {
		// Testar se a conneção com o banco de dados foi fechada
		conexao = false;
		Assumptions.assumeFalse(conexao,"Conexao não fechou");
		System.out.println("Fechou a conexÃ£o com o banco de dados");
		
		
	}

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
		// Se a pagina tiver uma descrição gera um erro
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
		// Retorna erro se tiver duas paginas com o mesmo nome
		Pagina pagi = new Pagina("Blog", "a");
		assertNotEquals(pagi.nome, nova, "Pagina Já existente");
	}

	@BeforeEach
	@Disabled
	void testeBefore() {

	}

	@AfterEach
	@Disabled
	void testAfter() {

	}

	@Test
	@Disabled
	@Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
	void testeTime() throws InterruptedException {
		// Se o salvamento passar do limite de tempo
		// wait(700);
		User user = new User(admin, admin2);
		System.out.println(user);

	}
	
	@Test
	@Disabled
	public void AssumeFalse() {
		//Se a condiçao nao for falsa da erro
		Assumptions.assumeFalse(conexao);
		System.out.println("Conexao AssumeFalse");
	}
	@Test
	@Disabled
	public void AssumeTrue() {
		//Se a condição não for verdadeira da erro
		Assumptions.assumeTrue(conexao);
		System.out.println("Conexao AssumeTrue");
	}

}
