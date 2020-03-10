package teste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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

	String admin = "user";
	String admin2 = "pass";
	private String nome = "Teste";
	private String nova = "Site";
	
	static List<User> users = new ArrayList<User>();
	static List<Pagina> paginas = new ArrayList<Pagina>();
	private static boolean conexao;

	@BeforeAll
	public static void testeBeforeAll() {

		// Testar se a conneção com o banco de dados foi Aberta
		conexao = true;
		System.out.println("Tentando iniciar a conexão com o banco de dados");
		AssumeTrue();
		users.add(new User("a","a"));
		users.add(new User("b","b"));
		users.add(new User("c","c"));
		
		paginas.add(new Pagina("a","a"));
		paginas.add(new Pagina("b","b"));
		paginas.add(new Pagina("c","c"));
	}

	@AfterAll
	public static void testeAfterAll() {
		// Testar se a conneção com o banco de dados foi fechada
		conexao = false;
		System.out.println("Tentando fechar a conexão com o banco de dados");
		AssumeFalse();

	}

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
		// Retorna erro se tiver duas paginas com o mesmo nome
		Pagina pagi = new Pagina("Blog", "a");
		assertNotEquals(pagi.nome, nova, "Pagina Já existente");
	}

	@Test
	@BeforeEach
	@Disabled
	void testeBefore() {
		System.out.println("Verificando Paginas cadastradas");

		}

	@AfterEach
	void testAfter() {
		
	}

	@Test
	@Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
	void testeTime() throws InterruptedException {
		// Se o salvamento passar do limite de tempo
		// Thread.sleep(700);
		User user = new User(admin, admin2);
		users.add(user);

	}

	@Test
	public static void AssumeFalse() {
		// Se a condiçao nao for falsa da erro
		Assumptions.assumeFalse(conexao);
		System.out.println("Conexao Fechada com sucesso");
	}

	@Test
	public static void AssumeTrue() {
		// Se a condição não for verdadeira da erro
		Assumptions.assumeTrue(conexao);
		System.out.println("Conexao iniciada com sucesso");
	}

}
