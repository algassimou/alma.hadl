package alma.hadl.configuration;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

import alma.hadl.noeud.Noeud;

public class StubConfiguration extends Configuration {
	private static final long serialVersionUID = 1L;
	private int valeur ;

	protected StubConfiguration(String adresse, int port, int val) throws RemoteException, MalformedURLException, AlreadyBoundException {
		super(adresse, port);
		valeur = val ;
		// TODO Auto-generated constructor stub
	}

	public void addNoeud(Noeud n) throws RemoteException{
		// TODO Auto-generated method stub

	}

	public int getNextIdentifiant() throws RemoteException{
		// TODO Auto-generated method stub
		return valeur;
	}
	
	public int getValeur ()throws RemoteException {
		return this.valeur ;
	}
	
	public void setValeur (int i) throws RemoteException{
		this.valeur = i ;
	}
	
	

}
