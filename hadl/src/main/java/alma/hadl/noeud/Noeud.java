
package alma.hadl.noeud;

/**
 * Les élément Composant Connecteur et Configuration sont des Noeud
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

}
