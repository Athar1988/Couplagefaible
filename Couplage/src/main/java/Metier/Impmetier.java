package Metier;

import Dao.Idao;

public class Impmetier implements Imetier{

	private Idao ID=null;

	public void setID(Idao iD) {
		ID = iD;
	}
	public double calcule() {
		double val=ID.getValue();
		return val*2;
	}

}
