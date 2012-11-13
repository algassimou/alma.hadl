
package alma.hadl.connection;

import java.rmi.RemoteException;
import java.util.Observable;
import java.util.Observer;

/**
 * Permet l'attachement entre un IPort et IRole
 * 
 * @see IPort
 * @see IRole
 */
public interface IAttachement extends IConnection, Observer {
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
  void update(Observable o, Object arg) ;
}
