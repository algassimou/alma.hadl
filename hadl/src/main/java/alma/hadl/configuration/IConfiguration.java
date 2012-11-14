
package alma.hadl.configuration;

import java.rmi.Remote;
import java.rmi.RemoteException;

import alma.hadl.noeud.Noeud;

public interface IConfiguration extends Remote {

	/**
	 * Ajoute un noeud à une configuration
	 * @param n le noeud à ajouter
	 */
	public void addNoeud(Noeud n) throws RemoteException;

	/**
	 * @return un identifiant valide pour un noeud
	 */
	public int getNextIdentifiant() throws RemoteException;
	
	
	//public boolean createattachement () ;

}
