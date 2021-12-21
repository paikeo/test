import java.util.ArrayList;
import java.util.List;

public class Mazzo {

	private String tipo;
	
	List<Carta> carte = new ArrayList<Carta>();

	public Mazzo(String tipo) {
		super();
		this.tipo = tipo;
		if(tipo.equals("napoletano")) {
			for(int i=1; i<=10; i++) {
				carte.add(new Carta(i,"denari"));
				carte.add(new Carta(i,"denari"));
				carte.add(new Carta(i,"denari"));
				carte.add(new Carta(i,"denari"));
			}
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
