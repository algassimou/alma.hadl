
package alma.hadl.composant;

import alma.hadl.port.PortFourni;
import alma.hadl.port.PortRequis;
import alma.hadl.service.IServiceFourni;
import alma.hadl.service.ServiceRequis;

public class Composant implements IComposant {
	private int id ;
	/**
	 * @return l'identifiant du noeud
	 */
	public int getId() {
		return this.id ;
	}

	/**
	 * fixe l'identifiant d'un noeud
	 * @param id l'identifiant du noeud
	 */
	public void setId(int id) {
		this.id = id ;
	}

	public void  addServiceRequis(ServiceRequis<?,?> service) {
	}

	public void addServiceFourni(Class<IServiceFourni<?>> service, PortRequis portRequis, PortFourni portFourni) {
	}

}
