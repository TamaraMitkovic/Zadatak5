import java.util.ArrayList;
import java.util.*;

public class Hotel extends Smestaj {
	ArrayList<Soba> sobe=new ArrayList<Soba>();

	public Hotel() {
	}

	public Hotel(String naziv, String mesto, double profit) {
		super(naziv, mesto, profit);
	}
	public boolean dodajSobu(Soba s) {
		for(Soba so:sobe) {
			if(so.getBrSobe()==s.getBrSobe()) {
				return false;
			}
		}
		return sobe.add(s);
	}
	public boolean izbaciSobu(int brSobe) {
		int toRemove=-1;
		for(int i=0;i<sobe.size();i++) {
			if(sobe.get(i).getBrSobe()==brSobe) {
				toRemove=i;
				break;
			}
		}
		
		if(toRemove==-1) {
			return false;
		}
		else {
			return sobe.remove(toRemove) != null;
		}
	}
	@Override
	public double getPrihodi() {
		int suma=0;
		for(int i=0;i<sobe.size();i++) {
			suma+=sobe.get(i).getCena();
		}		
		return suma*profitMargin;
	}

	@Override
	public String toString() {
		return "Hotelska lista soba: " + sobe;
	}
	
}
