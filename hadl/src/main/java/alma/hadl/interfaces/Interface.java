
package alma.hadl.interfaces;

/**
 * Une interface est soit 
 * <ul>
 * <li> un port </li>
 * <li> un role </li>
 * <li> un service </li>
 * </ul>
 * 
 * @see IPort
 * @see IRole
 * @see IService
 */
public interface Interface {
  /**
   * @return le nom de l'interface
   */
  String getNom() ;

}
