
package alma.hadl.service;

import alma.hadl.port.PortFourni;
import alma.hadl.port.PortRequis;

public class ServiceRequis<TypeFourni extends java.io.Serializable, TypeRequis extends java.io.Serializable> 
		implements IService<TypeFourni> {

  private PortRequis<TypeRequis> portRequis;
  private PortFourni<TypeFourni> portFourni;
  private String nom;

  public TypeRequis execute(TypeFourni ObjectFourni) {
	  return null ;
  }

public String getNom() {
	// TODO Auto-generated method stub
	return this.nom ;
}

}
