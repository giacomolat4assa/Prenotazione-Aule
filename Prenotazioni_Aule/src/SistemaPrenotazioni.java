
public class SistemaPrenotazioni {
	private Prenotazione prenotazioni[];
	private int size;
	private int capacity;
	
	private void enlarge() {
		capacity *= 2;
		Prenotazione[] newPrenotazioni = new Prenotazione[capacity];
		for(int i=0; i<size; i++) {
			newPrenotazioni[i] = prenotazioni[i];
		}
		prenotazioni = newPrenotazioni;
	}
	
	public SistemaPrenotazioni() {
		this.capacity = 5;
		this.size = 0;
		this.prenotazioni = new Prenotazione[capacity];
	}
	
	public void addPrenotazione(Prenotazione other) {
		if(size==capacity)
			enlarge();
		for (int i = 0; i < size; i++) {
			if(prenotazioni[i].equals(other))
				throw new AulaOccupataException("aula gia esistente!");
		}
		prenotazioni[size++]=other;
	}
	public AulaStandard[] getAuleStandardPrenotate(String data) {
		
		AulaStandard[] result = new AulaStandard[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if(prenotazioni[i].getData().equals(data) 
			&& prenotazioni[i].getAula() instanceof AulaStandard)
				result[count++] = (AulaStandard) prenotazioni[i].getAula();
		}
		
		AulaStandard[] finalResult = new AulaStandard[count];
		for (int i = 0; i < count; i++)
			finalResult[i] = result[i];
		
		return finalResult;
	}
}
