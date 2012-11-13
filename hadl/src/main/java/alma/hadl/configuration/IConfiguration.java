
package alma.hadl.configuration;

import alma.hadl.noeud.Noeud;

public interface IConfiguration {

	/**
	 * Ajoute un noeud à une configuration
	 * @param n le noeud à ajouter
	 */
	public void addNoeud(Noeud n) ;

	/**
	 * @return un identifiant valide pour un noeud
	 */
	int getNextIdentifiant() ;

}
