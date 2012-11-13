
package alma.hadl.configuration;

import alma.hadl.noeud.Noeud;

class ProxyConfiguration extends AbstractConfiguration implements alma.hadl.noeud.Noeud {
	private Configuration target;

	/**
	 * les attachements de la proxyconfiguration
	 */
	private alma.hadl.attachement.ProxyAttachment attachements;

	/**
	 * @return l'identifiant du noeud
	 */
	public int getId() {
		return 0 ;
	}

	/**
	 * fixe l'identifiant d'un noeud
	 * @param id l'identifiant du noeud
	 */
	public void setId(int id) {
		// Bouml preserved body begin 00022B87
		// Bouml preserved body end 00022B87
	}

	/**
	 * @return un identifiant valide pour un noeud
	 */
	public int getNextIdentifiant() {
		return 0 ;
	}

	public void addNoeud(Noeud n) {
		// TODO Auto-generated method stub

	}

}
