
public class Rahmenprogramm {

	
	private String bezeichnung;
	private int datum;
	private int zeit;
	private String ort;
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getDatum() {
		return datum;
	}
	public void setDatum(int datum) {
		this.datum = datum;
	}
	public int getZeit() {
		return zeit;
	}
	public void setZeit(int zeit) {
		this.zeit = zeit;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public Rahmenprogramm(String bezeichnung, int datum, int zeit, String ort) {
		super();
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
	}
	
	
}
