
public class Soba {
	private int brKreveta;
	private int brSobe;
	private double cena;
	private boolean zauzeta;
	
	public Soba() {
		brKreveta=0;
		brSobe=0;
		cena=0;
		zauzeta=false;
	}

	public Soba(int brKreveta, int brSobe, double cena, boolean zauzeta) {
		super();
		this.brKreveta = brKreveta;
		this.brSobe = brSobe;
		this.cena = cena;
		this.zauzeta = zauzeta;
	}

	public int getBrKreveta() {
		return brKreveta;
	}

	public void setBrKreveta(int brKreveta) {
		this.brKreveta = brKreveta;
	}

	public int getBrSobe() {
		return brSobe;
	}

	public void setBrSobe(int brSobe) {
		this.brSobe = brSobe;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean isZauzeta() {
		return zauzeta;
	}

	public void setZauzeta(boolean zauzeta) {
		this.zauzeta = zauzeta;
	}

	@Override
	public String toString() {
		return "Soba ima " + brKreveta + " kreveta, broj sobe je " + brSobe + ", cena je " + cena + ", soba je " + zauzeta + ".";
	}
	
}
