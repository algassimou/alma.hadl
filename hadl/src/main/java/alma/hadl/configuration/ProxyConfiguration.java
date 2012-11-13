
package alma.hadl.configuration;

import java.rmi.RemoteException;
import java.util.List;

import alma.hadl.attachement.ProxyAttachment;
import alma.hadl.noeud.Noeud;

class ProxyConfiguration 
extends AbstractConfiguration 
implements Noeud {
	private static final long serialVersionUID = 1L;
	
	/**
	 * La configuration distante
	 */
	private IConfiguration target;
	
	/**
	 * l'identifiant du noeud
	 */
	private int id ;
	
	public ProxyConfiguration(Configuration config) throws RemoteException {
		super();
		target = config ;
		// TODO Auto-generated constructor stub
	}

	/**
	 * les attachements de la proxyconfiguration
	 */
	private List<ProxyAttachment> attachements;

	/**
	 * @return l'identifiant du noeud
	 */
	public int getId() {
		return this.id  ;
	}

	/**
	 * fixe l'identifiant d'un noeud
	 * @param id l'identifiant du noeud
	 */
	public void setId(int id) {
		// on fait rien on ne change pas l'identifiant du proxyConfiguration
	}

	/**
	 * @return un identifiant valide pour un noeud
	 * @throws RemoteException 
	 */
	public int getNextIdentifiant() throws RemoteException{
		return target.getNextIdentifiant();
	}

	public void addNoeud(Noeud n) throws RemoteException {
		// TODO Auto-generated method stub
		target.addNoeud(n);
	}

}
