package VideoAula;

public class Video {

	private String titulo;
	private int avaliação;
	private float views;
	private float curtidas;
	private boolean reproduzindo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliação() {
		return avaliação;
	}
	public void setAvaliação(int avaliação) {
		this.avaliação = avaliação;
	}
	public float getViews() {
		return views;
	}
	public void setViews(float views) {
		this.views = views;
	}
	public float getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(float curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	
}
