
package alma.hadl.interfaces;

import java.io.Serializable;

public interface IRole<Type extends Serializable> extends Data<Type> {
  /**
   * @return le nom de l'interface
   */
  String getNom() ;

}
