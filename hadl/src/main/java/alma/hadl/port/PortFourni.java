
package alma.hadl.port;

import java.io.Serializable;
import java.util.Observable;
import alma.hadl.interfaces.IPort;

public class PortFourni<Type extends Serializable> 
		extends Observable 
		implements IPort<Type> {
  
	private String nom;

	/**
	 * @return le nom de l'interface
	 */
	public String getNom() {
	   return this.nom ;
	}
}
