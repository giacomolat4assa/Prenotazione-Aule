import java.util.Objects;

public class AulaAttrezzata extends Aula{
	private int numeroPostazioniPc;
	
	public AulaAttrezzata(String nome, int capienzaMax, int numeroPostazioniPc){
			super(nome, capienzaMax);
			this.numeroPostazioniPc=numeroPostazioniPc;
	}
	public int getnumeroPostazioniPc() {
		return numeroPostazioniPc;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj))
			return false;
		if(this.getClass() != obj.getClass())	
			return false;
		AulaAttrezzata other = (AulaAttrezzata) obj;
		return this.numeroPostazioniPc == other.numeroPostazioniPc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), numeroPostazioniPc);
	}
}
