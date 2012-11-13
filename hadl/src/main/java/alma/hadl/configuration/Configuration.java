
package alma.hadl.configuration;

import java.util.List;

import alma.hadl.attachement.RealAttachement;
import alma.hadl.noeud.Noeud;

public class Configuration extends AbstractConfiguration {
	public static IConfiguration getConfig(String adresse)
	{
		return null ;
	}
	
	public void addNoeud(Noeud n) {
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
	public int getNextIdentifiant() {
		return this.nextId++ ;
	}

}
