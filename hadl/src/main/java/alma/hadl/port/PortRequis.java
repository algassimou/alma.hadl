
package alma.hadl.port;

import java.io.Serializable;
import java.util.Observable;

import alma.hadl.interfaces.IPort;
import alma.hadl.service.IServiceFourni;

public class PortRequis<Type extends Serializable> 
	extends Observable implements IPort<Type> {
	
	/**
	 * le nom de l'interface
	 */
	private String nom;

  /**
   * @return le nom de l'interface
   * @see nom
   */
  public String getNom() {
    return this.nom ;
  }

  	/**
  	 * La classe implementant le service fourni
  	 * @see IServiceFourni
  	 */
  	private Class<IServiceFourni<?>> serviceFourni;

}
