
package alma.hadl.interfaces;

import java.io.Serializable;

/**
 * Interface decrivant un port
 */
public interface IPort<Type extends Serializable> extends Data<Type> {
  /**
   * @return le nom de l'interface
   */
  String getNom() ;

}
