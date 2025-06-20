public abstract class Aula {
	private String nome;
	private int capienzaMax;
	
	Aula(String nome, int capienzaMax){
		if(nome!=null)
			this.nome = nome;
		else
			throw new AulaException("aula senza nome!");
		if(capienzaMax>0)
			this.capienzaMax = capienzaMax;
		else 
			throw new AulaException("aula vuota!");
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
		return nome.equals(other.nome) && (this.capienzaMax==other.capienzaMax);
	}
	@Override 
	public int hashCode() {
		int result = 17;
		result = 31 * result + (nome != null ? nome.hashCode() : 0);
		result = 31 * result + capienzaMax;
		return result;
	}
}
