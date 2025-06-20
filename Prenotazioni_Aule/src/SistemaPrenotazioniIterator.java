import java.util.Iterator;

public class SistemaPrenotazioniIterator implements Iterable<Prenotazione>{
	private Prenotazione prenotazioni[];
	private int index;
	private int lenght;
	
	private void enlarge() {
		lenght *= 2;
		Prenotazione[] newPrenotazioni = new Prenotazione[lenght];
		for(int i=0; i<index; i++) {
			newPrenotazioni[i] = prenotazioni[i];
		}
		prenotazioni = newPrenotazioni;
	}
	
	public SistemaPrenotazioniIterator() {
		this.lenght = 5;
		this.index = 0;
		this.prenotazioni = new Prenotazione[lenght];
	}
	
	public void addPrenotazione(Prenotazione other) {
		if(index==lenght)
			enlarge();
		for (int i = 0; i < index; i++) {
			if(prenotazioni[i].equals(other))
				throw new AulaException("aula gia esistente!");
		}
		prenotazioni[index++] = other;
	}
	public AulaStandard[] getAuleStandardPrenotate(String data) {
		
		AulaStandard[] result = new AulaStandard[index];
		int count = 0;
		
		Iterator<Prenotazione> it = this.iterator();
		while (it.hasNext()) {
			Prenotazione p = it.next();
			if(p.getData().equals(data) 
			&& p.getAula() instanceof AulaStandard)
				result[count++] = (AulaStandard) p.getAula();
		}
		
		AulaStandard[] finalResult = new AulaStandard[count];
		for (int i = 0; i < count; i++)
			finalResult[i] = result[i];
		
		return finalResult;
	}
	
	// cercare una prenotazione data l'aula, 
	public Prenotazione getPrenotazioneDataAula (String nomeAula) {
		for (Prenotazione p : this) {
			if (p.getAula().getNome().equals(nomeAula))
	            return p;
		}
		return null;
	}
	
	   @Override
	    public Iterator<Prenotazione> iterator() {
	        return new Iterator<Prenotazione>() {
	            private int current = 0;
	            @Override
	            public boolean hasNext() {
	                return current < index;
	            }
	            @Override
	            public Prenotazione next() {
	                return prenotazioni[current++];
	            }
	        };
	   }	
}
