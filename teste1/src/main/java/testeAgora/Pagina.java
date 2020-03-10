package testeAgora;

public class Pagina {
	public String nome;
	public String descri;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public Pagina(String nome, String descri) {
		super();
		this.nome = nome;
		this.descri = descri;
	}

}
