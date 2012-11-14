
package alma.hadl.attachement;

import java.io.Serializable;
import java.util.Observable;

import alma.hadl.interfaces.Data;

public class RemoteAttachement<T extends Serializable> implements IRemoteAttachement {

	private Data<T> to ;
	
	
	public RemoteAttachement (Data<T> to) {
		this.to = to ;
	}
	
	
  /**
   * This method is called whenever the observed object is changed. An
   * application calls an <tt>Observable</tt> object's
   * <code>notifyObservers</code> method to have all the object's
   * observers notified of the change.
   * 
   * @param   o     the observable object.
   * @param   arg   an argument passed to the <code>notifyObservers</code>
   *                 method.
   */
  public void update(Observable o, Object arg) {
	  T t = (T) arg ;
	  to.ecrire(t);
  }

}
