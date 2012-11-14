
package alma.hadl.configuration;

import java.rmi.RemoteException;
import java.util.List;

import alma.hadl.connection.IAttachement;
import alma.hadl.interfaces.Data;
import alma.hadl.noeud.Noeud;

class ProxyConfiguration 
extends AbstractConfiguration 
implements Noeud {
	private static final long serialVersionUID = 1L;
	
	/**
	 * La configuration distante
	 */
	private IConfiguration targetConfig;
	
	/**
	 * le noeud
	 */
	private Noeud targetNoeud ;
	
	
	public ProxyConfiguration(IConfiguration config) throws RemoteException {
		super();
		targetConfig = config ;
		// TODO Auto-generated constructor stub
	}

	/**
	 * les attachements de la proxyconfiguration
	 */
	private List<IAttachement> attachements;

	/**
	 * @return l'identifiant du noeud
	 */
	public int getId() {
		return this.targetNoeud.getId() ;
	}

	/**
	 * fixe l'identifiant d'un noeud
	 * @param id l'identifiant du noeud
	 */
	public void setId(int id) {
		this.targetNoeud.setId(id);
	}

	/**
	 * @return un identifiant valide pour un noeud
	 * @throws RemoteException 
	 */
	public int getNextIdentifiant() throws RemoteException{
		return targetConfig.getNextIdentifiant();
	}

	public void addNoeud(Noeud n) throws RemoteException {
		// TODO Auto-generated method stub
		targetConfig.addNoeud(n);
		targetNoeud = n ;
	}

	public Data<?> getData(String nom) {
		// TODO Auto-generated method stub
		return this.targetNoeud.getData(nom);
	}

}
