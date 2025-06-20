import java.util.Objects;

public abstract class Aula {
	private String nome;
	private int capienzaMax;
	
	Aula(String nome, int capienzaMax){
		this.nome = nome;
		this.capienzaMax = capienzaMax;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getCapienzaMax() {
		return this.capienzaMax;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(this == obj)
			return true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(nome,other.nome) && (this.capienzaMax==other.capienzaMax);
	}
	@Override 
	//ciao
	public int hashCode() {
		return Objects.hash(nome,capienzaMax);
	}
}
