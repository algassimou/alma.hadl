
package alma.hadl.connecteur;

/**
 * Interface representant un connecteur
 */
public interface IConnecteur extends alma.hadl.noeud.Noeud {
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
