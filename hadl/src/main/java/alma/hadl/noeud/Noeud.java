
package alma.hadl.noeud;

import alma.hadl.interfaces.Data;

/**
 * Les �l�ment Composant Connecteur et Configuration sont des Noeud
 * @see IComposant
 * @see IConfiguration
 * @see IConnecteur
 */
public interface Noeud {
	/**
	 * @return l'identifiant du noeud
	 */
	int getId() ;

	/**
	 * fixe l'identifiant d'un noeud
	 * @param id l'identifiant du noeud
	 */
	void setId(int id) ;

	/**
	 * Pour un noeud renvoie l'une des ces interfaces dont le nom est passé en paramètre
	 * @param nom : le nom de l'interface data
	 * @return l'interface data
	 */
	public Data<?> getData (String nom) ;

}
