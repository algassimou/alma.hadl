package alma.hadl.configuration;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

import alma.hadl.noeud.Noeud;

public class StubConfiguration extends Configuration {
	private static final long serialVersionUID = 1L;
	private int valeur ;

	protected StubConfiguration(String adresse, int port, int val) throws RemoteException, MalformedURLException, AlreadyBoundException {
		super();
		valeur = val ;
		Configuration.bindConfiguration(this, adresse, port);
		// TODO Auto-generated constructor stub
	}

	public void addNoeud(Noeud n) {
		// TODO Auto-generated method stub

	}

	public int getNextIdentifiant() {
		// TODO Auto-generated method stub
		return valeur;
	}
	
	public int getValeur () {
		return this.valeur ;
	}
	
	public void setValeur (int i){
		this.valeur = i ;
	}
	
	

}
