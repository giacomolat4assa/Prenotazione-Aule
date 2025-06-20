import java.util.Objects;
public class Prenotazione {
	private String data;
	private Aula aula;
	
	public Prenotazione(String data, Aula aula){
		this.data = data;
		this.aula = aula;
	}
	String getData() {
		return data;
	}
	Aula getAula() {
		return aula;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || this.getClass()!=obj.getClass())
			return false;
		Prenotazione other = (Prenotazione) obj;
		return Objects.equals(data, other.data) && Objects.equals(aula, other.aula);
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, aula);
	}
}
