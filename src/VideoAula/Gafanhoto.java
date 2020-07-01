package VideoAula;

public class Gafanhoto extends Pessoa{
	
	public Gafanhoto(String nome, int idade, String sexo, String string) {
		super(nome, idade, sexo);
		this.login = string;
		this.totAssistido = 0;
	}

	private String login;
	private float totAssistido;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public float getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(float totAssistido) {
		this.totAssistido = totAssistido;
	}

	public void viuMaisUm() {
		
	}

	@Override
	public String toString() {
		return "Gafanhoto ["+ super.toString()  + "login=" + login + ", totAssistido=" +
	totAssistido + "]";
	}
	
}
