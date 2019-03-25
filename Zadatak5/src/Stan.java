
public class Stan extends Smestaj {
	private Soba s;
	private int brSprata;
	public Stan() {
		s=null;
		brSprata=0;
	}
	public Stan(String naziv, String mesto, double profitMargin, Soba s, int brSprata) {
		super(naziv, mesto, profitMargin);
		this.s = s;
		this.brSprata = brSprata;
	}
	
	public Soba getS() {
		return s;
	}
	public void setS(Soba s) {
		this.s = s;
	}
	public int getBrSprata() {
		return brSprata;
	}
	public void setBrSprata(int brSprata) {
		this.brSprata = brSprata;
	}
	@Override
	public double getPrihodi() {
		if(s==null) {
			return 0;
		}
		else {
			return s.getCena()*profitMargin;
		}
	}
	@Override
	public String toString() {
		return "Stan broj " + s + ", sprat " + brSprata + ".";
	}
	
}
