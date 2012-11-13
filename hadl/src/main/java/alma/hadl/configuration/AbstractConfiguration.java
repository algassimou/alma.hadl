
package alma.hadl.configuration;

import java.util.List;

import alma.hadl.connection.IConnection;

/**
 * Factorise le comportement commun a Configuration et ProxyConfiguration
 * 
 * @see IConfiguration
 * @see Configuration
 * @see ProxyConfiguration
 */
abstract class AbstractConfiguration implements IConfiguration {

  /**
   * toutes les connexion connus par lConfiguration
   */
  private List<IConnection> connections;

  /**
   * le prochain identifiant valide pour un noeud
   */
  protected int nextId;

}
