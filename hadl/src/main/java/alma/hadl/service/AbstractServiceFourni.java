
package alma.hadl.service;

import alma.hadl.port.PortFourni;

public abstract class AbstractServiceFourni<TypeFourni extends java.io.Serializable> 
implements IServiceFourni<TypeFourni> {

	private String nom;

	/**
	 * @return le nom de l'interface
	 */
	public String getNom() {
		return this.nom ;
	}

	private PortFourni<TypeFourni> portFourni;

}
