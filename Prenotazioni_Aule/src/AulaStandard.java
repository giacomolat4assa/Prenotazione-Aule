import java.util.Objects;
 
public class AulaStandard extends Aula{
	private int numeroLavagne;
	
	public AulaStandard(String nome, int capienzaMax, int numeroLavagne){
		super(nome, capienzaMax);
		this.numeroLavagne=numeroLavagne;
	}
	
	public int getNumeroLavagne() {
		return numeroLavagne;
	}
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj))
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		AulaStandard other = (AulaStandard) obj;
		return this.numeroLavagne == other.numeroLavagne;
	}
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), numeroLavagne);
	}
}