
package alma.hadl.service;

import java.io.Serializable;

import alma.hadl.interfaces.Interface;

public interface IService<TypeFourni extends Serializable> 
		extends Interface {
	/**
	 * @return le nom de l'interface
	 */
	String getNom() ;
}
