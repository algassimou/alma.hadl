
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

	public void ecrire(Type t) {
		// TODO Auto-generated method stub
		
	}

	public Type lire() {
		// TODO Auto-generated method stub
		return null;
	}
}
