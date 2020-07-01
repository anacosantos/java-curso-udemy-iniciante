package VideoAula;

public class Video implements InterfaceVideo{

	private String titulo;
	private int avalia��o;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avalia��o = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvalia��o() {
		return avalia��o;
	}
	public void setAvalia��o(int avalia��o) {
		int nova;
		nova = (int)((this.avalia��o + avalia��o)/this.views);
		this.avalia��o = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public float getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		this.reproduzindo = true;
		
	}
	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}
	@Override
	public void like() {
		this.curtidas ++;
		
	}
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avalia��o=" + avalia��o + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
}
