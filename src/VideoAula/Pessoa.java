package VideoAula;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected String sexo;
	protected boolean experiencia;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isExperiencia() {
		return experiencia;
	}

	public void setExperiencia(boolean experiencia) {
		this.experiencia = experiencia;
	}

	protected void ganharExp() {
		
	}
}
