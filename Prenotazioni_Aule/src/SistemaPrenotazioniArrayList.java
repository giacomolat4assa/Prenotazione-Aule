import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioniArrayList {
	private List<Prenotazione> prenotazioni;
	
	public SistemaPrenotazioniArrayList() {
		this.prenotazioni = new ArrayList<>();
	}
	
	public void addPrenotazione(Prenotazione p) {
		if(prenotazioni.contains(p))
			throw new AulaException("prenotazione gia presente");
		prenotazioni.add(p);
	}
	
	public List<AulaStandard> getAuleinData (String dataPrenotazione){
		List<AulaStandard> result = new ArrayList<>();
		
		for(Prenotazione p : prenotazioni) {
			if(p.getData().equals(dataPrenotazione) && p.getAula() instanceof AulaStandard)
				result.add( (AulaStandard) p.getAula() );
		}
		return result;
	}
}
