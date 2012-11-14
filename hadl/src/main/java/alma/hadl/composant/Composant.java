
package alma.hadl.composant;

import alma.hadl.noeud.AbstractNoeud;
import alma.hadl.port.PortFourni;
import alma.hadl.port.PortRequis;
import alma.hadl.service.IServiceFourni;
import alma.hadl.service.ServiceRequis;

public class Composant extends AbstractNoeud implements IComposant {

	public void  addServiceRequis(ServiceRequis<?,?> service) {
	}

	public void addServiceFourni(Class<IServiceFourni<?>> service, PortRequis<?> portRequis, PortFourni portFourni) {
	}

}
