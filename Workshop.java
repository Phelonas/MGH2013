
public class Workshop {

	
	private int workshopNumber;
	private String bezeichnung;
	private int datum;
	
	public int getWorkshopNumber() {
		return workshopNumber;
	}
	public void setWorkshopNumber(int workshopNumber) {
		this.workshopNumber = workshopNumber;
	}
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
	public Workshop(int workshopNumber, String bezeichnung, int datum) {
		super();
		this.workshopNumber = workshopNumber;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
	}
	
	
}
