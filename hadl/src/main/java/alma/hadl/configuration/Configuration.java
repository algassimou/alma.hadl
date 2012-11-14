
package alma.hadl.configuration;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;

import alma.hadl.attachement.RealAttachement;
import alma.hadl.noeud.Noeud;

public class Configuration extends AbstractConfiguration {

	/**
	 * Construit une configuration et rend la configuration accessible sur le reseau
	 * @param adresse adresse de la config
	 * @param port le port de la config
	 * @throws RemoteException
	 * @throws AlreadyBoundException 
	 * @throws MalformedURLException 
	 * @see bindConfiguration
	 */
	public Configuration(String adresse, int port) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// TODO Auto-generated constructor stub
		super();
		Configuration.bindConfiguration(this, adresse, port);
	}
	
	public Configuration() throws RemoteException {
		// TODO Auto-generated constructor stub
		super();
	}

	public void addNoeud(Noeud n)throws RemoteException {
	}

	/**
	 * les noued connu de la configuration
	 */
	private List<Noeud> noeuds;

	/**
	 * les attachements de la configuration
	 */
	private List<RealAttachement> attachements;

	/**
	 * @return un identifiant valide pour un noeud
	 */
	public int getNextIdentifiant() throws RemoteException{
		return this.nextId++ ;
	}
	
	/**
	 * Recheche et retourne une configuration accessible sur le réseau
	 * @param adresse l'adresse plus le potr d'ecoute de la configuration
	 * @return un ProxyConfiguration qui fera le lien avec la configuration rechercher
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 * @see ProxyConfiguration
	 */
	public static IConfiguration getConfiguration(String adresse) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		return new ProxyConfiguration((IConfiguration) Naming.lookup(adresse));
	}
	
	/**
	 * Rend une configuration accessible sur le réseau
	 * @param config la configuration
	 * @param adresse l'adresse où va resider la configuration
	 * @param port le port d'ecoute de la configuration
	 * @throws RemoteException 
	 * @throws AlreadyBoundException 
	 * @throws MalformedURLException 
	 */
	public static void bindConfiguration (Configuration config, String adresse, int port) throws RemoteException, MalformedURLException, AlreadyBoundException {
		LocateRegistry.createRegistry(port);
		Naming.bind(adresse, config);
	}

}
