
public abstract class Smestaj {
	private String naziv;
	private String mesto;
	protected double profitMargin;
	public Smestaj() {
		naziv="";
		mesto="";
		profitMargin=0.1;
	}
	public Smestaj(String naziv, String mesto, double profitMargin) {
		super();
		this.naziv = naziv;
		this.mesto = mesto;
		this.profitMargin = profitMargin;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public double getProfitMargin() {
		return profitMargin;
	}
	public void setProfitMargin(double profitMargin) {
		this.profitMargin = profitMargin;
	}
	public abstract double getPrihodi();
	@Override
	public String toString() {
		return "Naziv smestaja je " + naziv + ", smestaj se nalazi u mestu " + mesto + ", a procenat zarade od soba je " + profitMargin + ".";
	}
	
}
