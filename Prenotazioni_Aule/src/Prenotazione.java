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
		return data.equals(other.data) && aula.equals(other.aula);
	}
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + data.hashCode();
		result = 31 * result + aula.hashCode();
		return result;
	}
}
