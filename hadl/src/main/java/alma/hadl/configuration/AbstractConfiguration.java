
package alma.hadl.configuration;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import alma.hadl.connection.IConnection;

/**
 * Factorise le comportement commun a Configuration et ProxyConfiguration
 * 
 * @see IConfiguration
 * @see Configuration
 * @see ProxyConfiguration
 */
abstract class AbstractConfiguration 
extends UnicastRemoteObject 
implements IConfiguration {

	private static final long serialVersionUID = 1L;

	protected AbstractConfiguration() throws RemoteException {
		super();
	}

	/**
	 * toutes les connexion connus par lConfiguration
	 */
	private List<IConnection> connections;

	/**
	 * le prochain identifiant valide pour un noeud
	 */
	protected int nextId;

}
